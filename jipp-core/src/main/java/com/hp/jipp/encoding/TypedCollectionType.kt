// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.ParseError
import java.io.IOException

/**
 * An attribute type for collections that can be parsed into a plain type.
 */
open class TypedCollectionType<T: HasAttributeCollection>(
    parser: CollectionParser<T>,
    override val name: String
) : AttributeType<T>(Encoder(parser), Tag.beginCollection) {

    class Encoder<T: HasAttributeCollection>(
        private val parser: CollectionParser<T>
    ) : com.hp.jipp.encoding.Encoder<T>() {

        override val typeName = parser.typeName

        // Terminates a collection
        private val endCollectionAttribute = OctetStringType(Tag.endCollection, "").empty()

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: T) {
            out.writeShort(0) // Empty value

            for (attribute in value.attributes.attributes) {
                // Write a memberAttributeName attribute
                Tag.memberAttributeName.write(out)
                out.writeShort(0)
                out.writeString(attribute.name)

                // Write the attribute, but without its name
                attribute.withName("").write(out)
            }

            // Terminating attribute
            endCollectionAttribute.write(out)
        }

        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, finder: Finder, valueTag: Tag): T {
            input.skipValueBytes()
            val attributes = ArrayList<Attribute<*>>()

            // Read attribute pairs until endCollection is reached.
            while (true) {
                val tag = Tag.read(input)
                if (tag === Tag.endCollection) {
                    // Skip the rest of this attr and return.
                    input.skipValueBytes()
                    input.skipValueBytes()
                    break
                } else if (tag === Tag.memberAttributeName) {
                    input.skipValueBytes()
                    val memberName = input.readString()
                    val memberTag = Tag.read(input)

                    // Read and throw away the blank attribute name
                    input.readValueBytes()
                    val encoder = finder.find(memberTag, memberName)
                    attributes.add(input.readAttribute(encoder, memberTag, memberName))
                } else {
                    throw ParseError("Bad tag in collection: $tag")
                }
            }
            return parser.fromAttributes(attributes)
        }

        override fun valid(valueTag: Tag): Boolean {
            return valueTag === Tag.beginCollection
        }
    }
}
