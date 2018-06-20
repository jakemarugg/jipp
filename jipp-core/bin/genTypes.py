#!/usr/bin/python
import urllib
from lxml import etree
import re
import pprint
import os.path
import sys
from jinja2 import Environment, FileSystemLoader # pip install Jinja2

# Global data
specs = { }
enums = { }
keywords = { }
collections = { }
proj_dir = os.path.dirname(os.path.realpath(__file__)) + "/../"

def warn(output):
    print "    WARN: " + output

# Given a record attempt to grab the referenced specification out of its xref.
# Return the short id of the spec or None if not found.
def parse_spec(record, target):
    xref = record.find('{*}xref')
    if xref is None:
        return None

    spec = None
    uri = None
    if xref.attrib['type'] == 'rfc':
        spec = xref.attrib['data']
        uri = "http://www.iana.org/go/" + spec

    if xref.attrib['type'] == 'uri':
        spec = xref.text
        uri = xref.attrib['data']

    if spec is None or uri is None:
        warn("unparseable spec reference " + etree.tostring(xref))
    else:
        if spec not in specs:
            specs[spec] = uri

    if spec is not None and spec not in target['specs']:
        target['specs'].append(spec)

# Parse a single enum record into the global list of enums
def parse_enum(record):
    attribute = record.find('{*}attribute').text
    enum = enums.setdefault(attribute, { 'name': attribute, 'values': { }, 'specs': [ ],
                                         'syntax': record.find('{*}syntax').text })
    parse_spec(record, enum)

    value = record.find('{*}value')
    if value is not None:
        value = value.text

    name = record.find('{*}name')
    if name is not None:
        name = name.text
        if name is not None:
            m = re.search("are the same.*\"([a-z-]+)\"", name)
            if m and m.group(1):
                value = "any " + m.group(1) + " enum value"
                name = None

    # Special case: These are all grouped together in the XML
    if enum['name'].startswith("job-finishings"):
        enum['ref'] = 'finishings'

    # Special case: this has a strange value
    if enum['name'] == 'fetch-status-code':
        enum['ref'] = 'status'
        return

    if value is None:
        return

    if name is not None:
        if "(deprecated)" not in name and "Reserved" not in name:
            try:
                if value.startswith("0x"):
                    enum['hex'] = True
                value = int(value, 0)
                enum['values'][name] = value
            except ValueError:
                warn("enum " + attribute + " has non-integer value " + value)
    else:
        # Special case: Correct some known typos
        value = value.replace("status code", "status")
        value = value.replace("any finishings enum value", "<any finishings enum value>")

        m = re.search("< ?(?:[aA]ny |all )\"?([a-z-]+)\"?( enum)? (value(s?)|name(s?)) ?>", value)
        if m and m.group(1):
            enum['ref'] = m.group(1)
        else:
            warn("enum " + attribute + " has unparseable value '" + value + "'")


# Parse a single status code
def parse_status_code(record):
    enum = enums.setdefault('status', { 'name': 'status', 'values': { }, 'specs': [ ], 'hex': True })
    value = record.find('{*}value').text
    name = record.find('{*}name').text
    parse_spec(record, enum)
    if name == "Unassigned" or name.startswith("Reserved") or '-' in value:
        return
    try:
        value = int(value, 0)
        enum['values'][name] = value
    except ValueError:
        warn("status code has non-integer value " + value)

# Parse a single keyword record
def parse_keyword(record):
    attribute = record.find('{*}attribute').text
    keyword = keywords.setdefault(attribute, { 'name': attribute, 'values': [ ], 'specs': [ ],
                                               'syntax': record.find('{*}syntax').text })
    parse_spec(record, keyword)

    # Some values have an additional type specifier (e.g. media "size name" vs "media name" or "input tray")
    # TODO: Are these actually separate keywords? And how should refs be handled to these?
    type = record.find('{*}type')

    value = record.find('{*}value')
    if value is not None:
        value = value.text

    if value is not None:
        if ' ' not in value:
            keyword['values'].append(value)
        else:
            # Special case: Correct some known irregularities
            value = value.replace('"media" color', "media-color")

            m = re.search("< ?(?:[aA]ny |all )\"?([a-z-]+)\"?( keyword)? (value(s?)|name(s?)) ?>", value)
            if m and m.group(1):
                keyword['ref'] = m.group(1)
            else:
                warn("keyword " + attribute + " has unparseable value '" + value + "'")

# Parse a single attribute record
def parse_attribute(record):
    attr_name = record.find('{*}name').text
    collection_name = record.find('{*}collection').text
    syntax = record.find('{*}syntax').text

    collection = collections.setdefault(collection_name, { })
    attr = collection.setdefault(attr_name, {
        'name': attr_name, 'specs': [ ], 'syntax': syntax, 'members': { } } )

    parse_spec(record, attr)

    member_name = record.find('{*}member_attribute')
    if member_name is not None:
        member_name = member_name.text

    submember_name = record.find('{*}sub-member_attribute')
    if submember_name is not None:
        submember_name = submember_name.text

    if member_name is not None:
        if member_name.startswith('<'):
            m = re.search("<Member attributes are the same as the \"([a-z-]+)\"( .* attribute)?>", member_name)
            if m and m.group(1):
                attr['ref'] = m.group(1)
                return

            m = re.search("<Any (.*) attribute>", member_name)
            if m and m.group(1):
                attr['ref'] = m.group(1)
                return

            warn("Unparseable member '" + attr_name + "' member_attribute: '" + member_name + "'")
            return

        attr = attr['members'].setdefault(member_name, {
                'name': member_name, 'specs': [ ], 'syntax': syntax, 'members': { } } )

        if submember_name is not None:
            attr['members'].setdefault(submember_name, {
                'name': submember_name, 'specs': [ ], 'syntax': syntax, 'members': { } } )

# For each record entity in sections titled with "name", invoke parse()
def parse_records(root, name, parse):
    for elem in root.iter('{*}registry'):
        if elem.find('{*}title').text == name:
            for record in elem.iter('{*}record'):
                parse(record)

# Accepts any string, returning in the form Spaced Title
def spaced_title(string):
    return " ".join([word.title() for word in re.split("[ -]", string)])

# Accepts any string, returning in the form CamelClass
def camel_class(string):
    return "".join([word.title() for word in re.split("[ -]", string)])

# Accepts any string, returning in the form CamelClass
def camel_member(string):
    value = camel_class(string)
    return value[0].lower() + value[1:]

def upper(string):
    return string.upper()

def emit_code(updated):
    env = Environment(loader=FileSystemLoader(proj_dir + 'bin'))
    env.filters['camel_class'] = camel_class
    env.filters['camel_member'] = camel_member
    env.filters['spaced_title'] = spaced_title
    env.filters['upper'] = upper
    enum_kt = env.get_template('enum.kt.tmpl')
    for enum in enums.values():
        if 'ref' in enum:
            if enum['ref'] not in enums:
                warn("enum " + enum['name'] + " has bad ref=" + enum['ref'])
            continue

        if not enum['values']:
            warn("enum " + enum['name'] + " has no values defined")
            continue

        # Remove -supported and -requested
        enum['name'] = re.sub('-(supported|requested)$', '', enum['name'])

        # Lop off the plural for certain cases
        if enum['name'] == "finishings" or enum['name'] == "operations":
            enum['name'] = enum['name'][:-1]

        out_file = proj_dir + 'src/main/java/com/hp/jipp/model/' + camel_class(enum['name']) + ".kt"
        if not os.path.exists(os.path.dirname(out_file)):
            os.makedirs(out_file)
        print "Writing " + out_file
        with open(out_file, "w") as file:
            file.write(enum_kt.render(enum=enum, app=os.path.basename(sys.argv[0]), updated=updated, specs=specs))

# MAIN

xml_file = proj_dir + 'build/ipp-registrations.xml'
if not os.path.exists(os.path.dirname(xml_file)):
    os.makedirs(os.path.dirname(xml_file))

# Fetch the file into xml_file if necessary
if not os.path.isfile(xml_file):
    urllib.urlretrieve('http://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml', xml_file)

# Parse from file
tree = etree.parse(xml_file)

# TODO: Capture registry/updated date and emit that into all generated files
for elem in tree.iter('{*}registry'):
    if elem.find('{*}title').text == "Internet Printing Protocol (IPP) Registrations":
        updated = elem.find('{*}updated').text

parse_records(tree, "Enum Attribute Values", parse_enum)
parse_records(tree, "Keyword Attribute Values", parse_keyword)
parse_records(tree, "Attributes", parse_attribute)
parse_records(tree, "Status Codes", parse_status_code)

pp = pprint.PrettyPrinter(indent=2)
#print "\nCollections: "
#pp.pprint(collections)
#print "\nKeywords: "
#pp.pprint(keywords)
#print "\nEnums: "
#pp.pprint(enums)
#print "\nSpecifications: "
#pp.pprint(specs)

emit_code(updated)