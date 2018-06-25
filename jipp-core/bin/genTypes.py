#!/usr/bin/python
import urllib
from lxml import etree
import copy
import re
import pprint
import os.path
import sys
from jinja2 import Environment, FileSystemLoader # pip install Jinja2

# Global data
specs = { }
enums = { }
keywords = { }
attributes = { }
proj_dir = os.path.dirname(os.path.realpath(__file__)) + "/../"
warns = 0

# Some enums/keywords have a plural 's' on the end, which we remove for clarity.
# Types ending with these words are not plural for our purposes and should keep their s:
nonplurals = [ 'sides', 'status', 'print-supports', 'details', 'which-jobs' ]

def warn(output):
    global warns
    warns = warns + 1
    print "    WARN: " + output

def note(output):
    print "    NOTE: " + output

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

def clean_syntax(syntax):
    if syntax is None:
        return None

    # XML fix
    syntax = syntax.replace("type2 num", "type2 enum")

    # XML fix
    syntax = re.sub("\]\s+\[.*\]", "", syntax)

    # Some strings we do not care about no matter where they occur
    syntax = syntax.replace("(MAX)", "")
    syntax = syntax.replace("type1", "")
    syntax = syntax.replace("type2", "")
    syntax = syntax.replace("[PWG5100.NN]", "") # XML fix
    syntax = syntax.replace("1setOf", "")
    syntax = syntax.replace("1set Of", "") # XML fix
    syntax = syntax.strip()

    if syntax.startswith('(') and syntax.endswith(')'):
        return clean_syntax(syntax[1:-1])

    # XML fix to clean up "(name(MAX)" (missing term paren)
    if syntax.startswith('(') and not syntax.endswith(')'):
        return clean_syntax(syntax[1:])

    # we could be a lot more strict about 1setof, but not yet. Trim it.
    if " | " in syntax:
        # Ignore no-value and unknown since those are accepted everywhere
        parts = [clean_syntax(part.strip()) for part in syntax.split("|")]
        syntax = " | ".join([part for part in parts if part != "no-value" and part != "unknown"])
    return syntax

# Make sure that if the syntax is new, take the more complex version
def parse_syntax(record, target):
    syntax = clean_syntax(record.find('{*}syntax').text)
    if target['syntax'] != syntax:
        if len(syntax) > len(target['syntax']):
            target['syntax'] = syntax

# Parse a single enum record into the global list of enums
def parse_enum(record):
    attribute = record.find('{*}attribute').text

    enum = enums.setdefault(attribute, { 'name': attribute, 'values': { }, 'specs': [ ],
                                         'syntax': clean_syntax(record.find('{*}syntax').text) })
    parse_spec(record, enum)
    parse_syntax(record, enum)

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

    # XML fix: These are all grouped together in the XML
    if enum['name'].startswith("job-finishings"):
        enum['ref'] = 'finishings'

    # XML fix: this has a strange value
    if enum['name'] == 'fetch-status-code':
        enum['ref'] = 'status'
        return

    if value is None:
        return

    if name is None:
        m = re.search("<? ?(?:[aA]ny |all )\"?([a-z-]+)\"?( enum)? (value(s?)|name(s?)) ?>?", value)
        if m and m.group(1):
            enum['ref'] = m.group(1)
        else:
            enum['bad'] = True
            warn("enum " + attribute + " has unparseable value '" + value + "'")
        return

    # Totally ignore (deprecated), Reserved, (Under Review), etc.
    if re.search("\(.*\)", name) or "Reserved" in name:
        return

    try:
        if value.startswith("0x"):
            enum['hex'] = True
        value = int(value, 0)
        enum['values'][name] = value
    except ValueError:
        warn("enum " + attribute + " has non-integer value " + value)



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
                                               'syntax': clean_syntax(record.find('{*}syntax').text) })
    parse_spec(record, keyword)
    parse_syntax(record, keyword)

    # XML fix:
    # insert-sheet keyword should appear with
    # "<Member attributes are the same as the "insert-sheet" Job Template attribute>"

    value = record.find('{*}value')
    if value is not None:
        value = value.text

    type = record.find('{*}type')
    if type is not None:
        keyword['type'] = type.text

    # Ignore blank value or values containing stuff like (Reserved)
    if value is None or re.search("\(.*\)", value):
        return

    if ' ' not in value:
        keyword['values'].append(value)
    else:
        if not assign_ref(value, keyword):
            keyword['bad'] = True
            warn("keyword " + attribute + " has unparseable value '" + value + "'")

# Try to figure out what "ref" is referencing, and if successful assign it to target and return True
def assign_ref(ref, target):
    ref = re.sub('^<? ?(any|Any|all|All)? ?', '', ref)
    ref = re.sub(' ?>?$', '', ref)

    # Smash these into the Media type which has everything on earth
    if ref == '"media" media or size keyword value' or \
            ref == '"media" input tray keyword value' or \
            ref == 'media size name value':
        target['ref'] = 'media'
        return True

    # XML fix: Correct some known irregularities
    ref = re.sub('"media" color name$', 'media-color name', ref)
    ref = re.sub('job-default-output-until', 'job-delay-output-until', ref)
    ref = re.sub(' the "media-col"$', ' the "media-col" Job Template attribute', ref)
    ref = re.sub(' the "separator-sheets"$', ' the "separator-sheets" Job Template attribute', ref)
    ref = re.sub(' the "cover-back"$', ' the "cover-back" Job Template attribute', ref)
    ref = re.sub(' the "cover-front"$', ' the "cover-front" Job Template attribute', ref)

    # A reference to a keyword
    m = re.search("^\"?([a-z-]+)\"?( keyword)? (value(s?)|name(s?))$", ref)
    if m and m.group(1):
        target['ref'] = m.group(1)
        return True

    # A reference to another attribute
    m = re.search("^\"?([a-z-]+)\"? attribute keyword name$", ref)
    if m and m.group(1):
        target['ref'] = m.group(1)
        return True

    # A reference to any keyword in a group
    m = re.search("^\"?([A-Z a-z-]+)\"? attribute keyword name$", ref)
    if m and m.group(1):
        target['ref_group'] = m.group(1)
        return True

    # A reference to names of members within a collection
    m = re.search("^([a-z-]+) member attribute name$", ref)
    if m and m.group(1):
        target['ref_members'] = m.group(1)
        return True

    m = re.search("^\"([a-z-]+)\"( .* attribute)?$", ref)
    if m and m.group(1):
        target['ref'] = m.group(1)
        return True

    m = re.search("^Member attributes are the same as the \"([a-z-]+)\" (.*) attribute$", ref)
    if m and m.group(1) and m.group(2):
        target['ref_member'] = m.group(1)
        target['ref_group'] = m.group(2)
        return True

    # e.g. "<Any Job Template attribute>"
    m = re.search("([A-Za-z ]+) attribute", ref)
    if m and ' ' in m.group(1):
        target['ref_group'] = m.group(1)
        return True

    return False

# TODO: For collections we should create a POJO that knows how convert back and forth to its collection attribute.

# Parse a single attribute record
def parse_attribute(record):
    attr_name = record.find('{*}name').text
    collection_name = record.find('{*}collection').text
    syntax = clean_syntax(record.find('{*}syntax').text)

    # Ignore (UnderReview) (Deprecated) etc
    if re.search("\(.*\)", attr_name):
        return

    collection = attributes.setdefault(collection_name, { })
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
            if not assign_ref(member_name, attr):
                warn("Unparseable '" + attr_name + "' member name: '" + member_name + "'")
            return

        attr = attr['members'].setdefault(member_name, {
                'name': member_name, 'specs': [ ], 'syntax': syntax, 'members': { } } )

        if submember_name is not None:
            if submember_name.startswith('<'):
                if not assign_ref(submember_name, attr):
                    warn("Unparseable '" + attr_name + "' member '" + member_name + "'" +
                         " submember name '" + submember_name + "'")
                return

            attr['members'].setdefault(submember_name, {
                'name': submember_name, 'specs': [ ], 'syntax': syntax, 'members': { } } )

# For each record entity in sections titled with "name", invoke parse()
def parse_records(root, name, parse):
    for elem in root.iter('{*}registry'):
        if elem.find('{*}title').text == name:
            for record in elem.iter('{*}record'):
                parse(record)

def not_numeric(string):
    if string[0].isdigit():
        return "num" + string
    else:
        return string

# Accepts any string, returning in the form Spaced Title
def spaced_title(string):
    return " ".join([word.title() for word in re.split("[ -]", string) if len(word) > 0])

# Accepts any string, returning in the form CamelClass
def camel_class(string):
    return "".join([word.title() for word in re.split("[ _\.-]", string) if len(word) > 0])

# Accepts any string, returning in the form camelClass
def camel_member(string):
    value = camel_class(string)
    if len(value) > 1:
        return not_numeric(value[0].lower() + value[1:])
    else:
        return not_numeric(value[0].lower())

def upper(string):
    return string.upper()

def depluralize(name):
    if name[-1] != 's':
        return name

    for nonplural in nonplurals:
        if name.endswith(nonplural):
            return name

    return name[:-1]

def emit_keyword(template, keyword):
    if not keyword['values']:
        # If this is a reference to collection members, we can now resolve it
        if 'ref_members' in keyword:
            for group in attributes.values():
                for type in group.values():
                    if type['name'] == keyword['ref_members']:
                        keyword['values'].extend(type['members'].keys())
            keyword['values'] = sorted(list(set(keyword['values'])))
        if 'ref_group' in keyword:
            # TODO: When encountering a ref_group we could extract to a different reference, e.g. JobStatusAttributes
            # and replace with ref = 'JobStatusAttributes'
            group_name = keyword['ref_group']
            if group_name not in attributes:
                warn("Keyword refers to group " + group_name + " but no such group")
                return
            keyword['values'] = sorted(attributes[group_name].keys())

    if not keyword['values']:
        warn("keyword " + keyword['name'] + " has no values defined")
        return

    keyword['fullname'] = keyword['name']
    keyword['name'] = re.sub('-(supported|requested)$', '', keyword['name'])
    # XML fix because separator-sheets-supported should either be separator-sheets-type-supported, or -type
    # should be gone
    keyword['name'] = re.sub('-sheets-type', '-sheets', keyword['name'])
    if 'name' in keyword['syntax']:
        keyword['orName'] = True
    keyword['name'] = depluralize(keyword['name'])
    with open(prep_file(keyword['name']), "w") as file:
        file.write(template.render(keyword=keyword, app=os.path.basename(sys.argv[0]), updated=updated, specs=specs))

# Given a class name, select an appropriate location for it and signal the user we are writing it
def prep_file(name):
    out_file = os.path.abspath(proj_dir + 'src/main/java/com/hp/jipp/pwg/' + camel_class(name) + ".kt")
    if not os.path.exists(os.path.dirname(out_file)):
        os.makedirs(os.path.dirname(out_file))
    #print out_file
    return out_file

def emit_enum(template, enum):
    if not enum['values']:
        warn("enum " + enum['name'] + " has no values defined")
        return

    # Remove -supported and -requested
    enum['fullname'] = enum['name']
    enum['name'] = re.sub('-(supported|requested)$', '', enum['name'])
    enum['name'] = depluralize(enum['name'])

    with open(prep_file(enum['name']), "w") as file:
        file.write(template.render(enum=enum, app=os.path.basename(sys.argv[0]), updated=updated, specs=specs))

def emit_kind(env, template_name, items, emit_func):
    template = env.get_template(template_name)
    for item in items.values():
        if 'bad' in item:
            continue

        if 'ref' in item:
            if item['ref'] not in items:
                pp.pprint(item)
                warn(item['name'] + " has bad ref=" + item['ref'])
            continue

        item['refs'] = []
        for ref_item in items.values():
            if 'ref' in ref_item and ref_item['ref'] == item['name']:
                item['refs'].append(ref_item['name'])

        emit_func(template, item)

def get_intro(map, name):
    if name not in map:
        # XML fix: try to find the relevant keyword/enum by trimming
        if name.endswith("-default"):
            return get_intro(map, name[:-len("-default")])
        if name.endswith("-supported"):
            return get_intro(map, name[:-len("-supported")])
        if name.endswith("-actual"):
            return get_intro(map, name[:-len("-actual")])
        if name.endswith("-supplied"):
            return get_intro(map, name[:-len("-supplied")])
        if name.endswith("-document-state-reasons"):
            return get_intro(map, "document-state-reasons")
        if name.endswith("-document-state"):
            return get_intro(map, "document-state")
        if name.endswith("-state"):
            return get_intro(map, name + 's') # Try the plural
        if name.startswith("output-device-"):
            return get_intro(map, name[len("output-device-"):])
        # XML fix: job-error-sheet-supported needs to look for -type
        if name == "job-error-sheet":
            return get_intro(map, "job-error-sheet-type")
        # XML fix: separator-sheets-supported needs to look for -type
        if name == "separator-sheets":
            return get_intro(map, "separator-sheets-type")
        # XML fix: job-accounting-sheets-supported needs to look for -type
        if name == "job-accounting-sheets":
            return get_intro(map, "job-accounting-sheets-type")
        return None
    if 'ref' in map[name]:
        return get_intro(map, map[name]['ref'])
    if 'bad' in map[name]:
        return None
    return camel_class(map[name]['name']) + ".Type("

def emit_attributes(env):
    template = env.get_template('group.kt.tmpl')
    for name, values in attributes.items():
        types = []
        for typeName, desc in sorted(values.items(), key=lambda (k, v): k):
            type = copy.deepcopy(desc)
            type['intro'] = find_intro(type, type['syntax'], type['name'])
            if not type['intro']:
                continue

            for member in type['members'].values():
                fix_member(type['members'], member)

            types.append(type)

        with open(prep_file(name + "-group"), "w") as file:
            file.write(template.render(name=name, types=types, app=os.path.basename(sys.argv[0]), updated=updated, specs=specs))

# For each member recursively find and apply its intro, or remove it
def fix_member(dict, member):
    member['intro'] = find_intro(member, member['syntax'], member['name'])
    if not member['intro']:
        del dict[member['name']]
    for submember in member['members'].values():
        fix_member(member['members'], submember)

# Given an attribute type object, look up its intro and apply it.
def find_intro(type, syntax, name):
    original_syntax = syntax

    # XML fix: job-collation-type-actual should point to enum, not keyword
    if name == "job-collation-type-actual" and syntax == "keyword":
        syntax = "enum"

    # These is supposed to refer only to certain Media values but we cannot distinguish them easily.
    if name == 'media-key' or name == 'media-key-supported' or name == "media-size-name":
        name = 'media'

    if syntax is None:
        print "Type has no syntax"
        pp.pprint(type)
        return None

    #if name.endswith("-supported"):
    #    # This may be a reference to member names in a collection

    # Look for known keyword/enum reference
    intro = None
    if syntax == 'keyword':
        intro = get_intro(keywords, name)
    elif syntax == 'keyword | name':
        intro = get_intro(keywords, name)
    elif syntax == 'enum':
        intro = get_intro(enums, name)
    if intro:
        return intro

    # Look for other known references
    if re.search('^uri(\([0-9]+\))?$', syntax):
        return "UriType("
    if re.search('^rangeOfInteger(\([0-9MINAX:-]*\))?$', syntax):
        return "RangeOfIntegerType("
    if re.search('^integer(\([0-9MINAX:-]*\)) | rangeOfInteger(\([0-9MINAX:-]*\))?$', syntax):
        return "IntegerOrRangeOfIntegerType("
    if re.search('^integer(\([0-9MINAX:-]*\))?$', syntax):
        return "IntegerType("
    if syntax == "boolean":
        return "BooleanType("
    if syntax == "charset":
        return "StringType(Tag.charset, "
    if syntax == "mimeMediaType":
        return "StringType(Tag.mimeMediaType, "
    if syntax == "naturalLanguage":
        return "StringType(Tag.naturalLanguage, "
    if syntax == "resolution":
        return "ResolutionType("
    if syntax == "collection":
        # TODO: We need to emit a "see" reference to the collection class/object when we write this out
        return "CollectionType("
    if syntax == "dateTime":
        return "DateTimeType("
    if syntax == 'name':
        return "NameType("
    if re.search('^name\(([0-9]+)\)$', syntax):
        m = re.search('name\(([0-9]+)\)', syntax)
        return "NameType(" + m.group(1) + ", "
    if syntax == 'text':
        return "TextType("
    if syntax == 'text':
        return "TextType("
    if syntax == 'uriScheme':
        return "StringType(Tag.uriScheme, "
    if re.search('^text\(([0-9]+)\)$', syntax):
        m = re.search('text\(([0-9]+)\)', syntax)
        return "TextType(" + m.group(1) + ", "
    if syntax == 'octetString':
        return "OctetStringType("
    if re.search('^octetString\(([0-9]+)\)$', syntax):
        m = re.search('octetString\(([0-9]+)\)', syntax)
        return "OctetStringType(" + m.group(1) + ", "

    warn("Could not find type for attribute " + name + " with syntax '" + original_syntax + "'")
    return None


def emit_code():
    env = Environment(loader=FileSystemLoader(proj_dir + 'bin'))
    env.filters['camel_class'] = camel_class
    env.filters['camel_member'] = camel_member
    env.filters['spaced_title'] = spaced_title
    env.filters['upper'] = upper

    emit_kind(env, 'enum.kt.tmpl', enums, emit_enum)
    emit_kind(env, 'keyword.kt.tmpl', keywords, emit_keyword)
    emit_attributes(env)


# MAIN

xml_file = proj_dir + 'build/ipp-registrations.xml'
if not os.path.exists(os.path.dirname(xml_file)):
    os.makedirs(os.path.dirname(xml_file))

# Fetch the file into xml_file if necessary
if not os.path.isfile(xml_file):
    urllib.urlretrieve('http://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml', xml_file)

# Parse from file
tree = etree.parse(xml_file)

# Capture the update date to be added to all files
for elem in tree.iter('{*}registry'):
    if elem.find('{*}title').text == "Internet Printing Protocol (IPP) Registrations":
        updated = elem.find('{*}updated').text

parse_records(tree, "Enum Attribute Values", parse_enum)
parse_records(tree, "Keyword Attribute Values", parse_keyword)

# XML Fixes
# input-attributes-supported should probably be "any input-attributes member attribute name"
# document-access-supported should probably be "any document-access member attribute name"
# *-supported a lot of cases actually

# XML Fix: missing printer-kind keyword
keywords['printer-kind'] = {
    'name': 'printer-kind',
    'specs': [ 'PWG5100.16'],
    'syntax': 'keyword',
    'values' : [ 'disc', 'document', 'envelope', 'label', 'large-format', 'photo', 'postcard', 'receipt', 'roll']
}

pp = pprint.PrettyPrinter(indent=2)

parse_records(tree, "Attributes", parse_attribute)
parse_records(tree, "Status Codes", parse_status_code)

#print "\Attributes: "
#pp.pprint(attributes)
#print "\nKeywords: "
#pp.pprint(keywords)
#print "\nEnums: "
#pp.pprint(enums)
#print "\nSpecifications: "
#pp.pprint(specs)

# TODO: For collections emit a data class with nullable attributes and conversion <--> attributes. When this is done
# include a keyword type of all possible members to be used outside the collection (e.g. PrintObject, MaterialsCol)

emit_code()
print "WARNINGS: " + str(warns)

#pp.pprint(collections['Document Description']['impressions-col'])