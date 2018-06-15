#!/usr/bin/python
import urllib
from lxml import etree
import re
import pprint
import os.path

# Parse enums
def parse_enums(root):
    for elem in root.iter('{*}registry'):
        if elem.find('{*}title').text == "Enum Attribute Values":
            for record in elem.iter('{*}record'):
                attribute = record.find('{*}attribute').text
                enum = enums.setdefault(attribute, { 'name': attribute, 'values': { }, 'specs': [ ],
                                                     'syntax': record.find('{*}syntax').text })

                xref = record.find('{*}xref')
                if xref is not None:
                    spec = parse_spec(xref)
                    if spec is not None and spec not in enum['specs']:
                        enum['specs'].append(spec)

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

                if value is None:
                    continue

                if name is not None:
                    if "(deprecated)" not in name and "Reserved" not in name:
                        enum['values'][name] = value
                else:
                    value = value.replace("status code", "status-code")
                    m = re.search("(?:[aA]ny |all )\"?([a-z-]+)\"?( enum)? value", value)
                    if m and m.group(1):
                        enum['ref'] = m.group(1)
                    else:
                        print "WARN: enum " + attribute + " has unparseable value '" + value + "'"

def parse_spec(xref):
    spec = None
    uri = None
    if xref.attrib['type'] == 'rfc':
        spec = xref.attrib['data']
        uri = "http://www.iana.org/go/" + spec

    if xref.attrib['type'] == 'uri':
        spec = xref.text
        uri = xref.attrib['data']

    if spec is None or uri is None:
        print "WARN: unparseable spec reference " + etree.tostring(xref)
    else:
        if spec not in specs:
            specs[spec] = uri
    return spec

# Parse enums
def parse_keywords(root):
    for elem in root.iter('{*}registry'):
        if elem.find('{*}title').text == "Keyword Attribute Values":
            for record in elem.iter('{*}record'):
                attribute = record.find('{*}attribute').text
                keyword = keywords.setdefault(attribute, { 'name': attribute, 'values': [ ], 'specs': [ ],
                                                           'syntax': record.find('{*}syntax').text })
                xref = record.find('{*}xref')
                if xref is not None:
                    spec = parse_spec(xref)
                    if spec is not None and spec not in keyword['specs']:
                        keyword['specs'].append(spec)

                value = record.find('{*}value')
                if value is not None:
                    value = value.text
                if value is not None:
                    if ' ' not in value:
                        keyword['values'].append(value)
                    else:
                        m = re.search("(?:[aA]ny |all )\"?([a-z-]+)\"?( keyword)? value", value)
                        if m and m.group(1):
                            keyword['ref'] = m.group(1)
                        else:
                            print "WARN: enum " + attribute + " has unparseable value '" + value + "'"

# MAIN

xml_file = 'ipp-registrations.xml'

# Fetch the file into xml_file if necessary
if not os.path.isfile(xml_file):
    urllib.urlretrieve('http://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml', xml_file)

# Parse from file
tree = etree.parse(xml_file)

specs = { }
enums = { }
keywords = { }


parse_enums(tree)
parse_keywords(tree)
# TODO: Parse Status Code as if it was another enum

pp = pprint.PrettyPrinter(indent=2)
print "\nKeywords: "
pp.pprint(keywords)
print "\nEnums: "
pp.pprint(enums)
print "\nSpecifications: "
pp.pprint(specs)
