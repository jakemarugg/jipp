// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.BuildError
import java.io.IOException

/**
 * An attribute type for `name` types, which can be encoded with either [Tag.nameWithoutLanguage] or
 * [Tag.nameWithLanguage].
 *
 * See [RFC8011 Section 5.1.3](https://tools.ietf.org/html/rfc8011#section-5.1.3).
 */
class NameType(
    val maxEncodedSize: Int,
    override val name: String
) : AttributeType<Name>(Encoder, Tag.nameWithoutLanguage) {

    constructor(name: String) : this(DEFAULT_MAX, name)

    override fun of(values: List<Name>): Attribute<Name> {
        values.forEach {
            val encodedSize = it.value.toByteArray(Charsets.UTF_8).size
            if (encodedSize > maxEncodedSize) {
                throw BuildError("Encoded size $encodedSize is more than $maxEncodedSize: ${it.value}")
            }
        }
        return when (values.mapNotNull { it.lang }.size) {
            0 -> Attribute(Tag.nameWithoutLanguage, name, values, encoder)
            values.size -> Attribute(Tag.nameWithLanguage, name, values, encoder)
            else -> throw BuildError("If one Name includes a language, then all must have a language")
        }
    }

    /** Return an attribute containing strings as names (without language) */
    fun ofStrings(values: List<String>) = of(values.map { Name(it) })

    /** Return an attribute containing strings as names (without language) */
    fun of(vararg values: String) = ofStrings(values.toList())

    /** Return an attribute containing strings as names (without language) */
    operator fun invoke(vararg values: String) = ofStrings(values.toList())

    companion object Encoder : SimpleEncoder<Name>("Name") {
        const val DEFAULT_MAX = 255

        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): Name {
            return if (valueTag == Tag.nameWithLanguage) {
                // Length should exactly match lang/string total length but we will discard
                input.readShort().toInt()
                val lang = input.readString()
                val string = input.readString()
                Name(string, lang)
            } else {
                // Just like String in this case, no special length
                val string = input.readString()
                Name(string)
            }
        }

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: Name) {
            if (value.lang != null) {
                out.writeShort(out.stringLength(value.lang) + out.stringLength(value.value))
                out.writeString(value.lang)
                out.writeString(value.value)
            } else {
                out.writeString(value.value)
            }
        }

        override fun valid(valueTag: Tag): Boolean {
            return valueTag === Tag.nameWithLanguage || valueTag === Tag.nameWithoutLanguage
        }
    }
}
