// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.BuildError
import java.io.IOException

/**
 * An attribute type for `text` types, which can be encoded with either [Tag.textWithoutLanguage] or
 * [Tag.textWithLanguage].
 *
 * See [RFC8011 Section 5.1.2](https://tools.ietf.org/html/rfc8011#section-5.1.2).
 */
class TextType(
    val maxEncodedSize: Int,
    override val name: String
) : AttributeType<Text>(Encoder, Tag.textWithoutLanguage) {
    constructor(name: String) : this(DEFAULT_MAX, name)

    companion object Encoder : SimpleEncoder<Text>("Text") {
        const val DEFAULT_MAX = 1023

        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): Text {
            return if (valueTag == Tag.textWithLanguage) {
                // Length should exactly match lang/string total length but we will discard
                input.readShort().toInt()
                val lang = input.readString()
                val string = input.readString()
                Text(string, lang)
            } else {
                // Just like String in this case, no special length
                val string = input.readString()
                Text(string)
            }
        }

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: Text) {
            if (value.lang != null) {
                out.writeShort(out.stringLength(value.lang) + out.stringLength(value.value))
                out.writeString(value.lang)
                out.writeString(value.value)
            } else {
                out.writeString(value.value)
            }
        }

        override fun valid(valueTag: Tag): Boolean {
            return valueTag === Tag.textWithLanguage || valueTag === Tag.textWithoutLanguage
        }
    }

    override fun of(values: List<Text>): Attribute<Text> {
        values.forEach {
            val encodedSize = it.value.toByteArray(Charsets.UTF_8).size
            if (encodedSize > maxEncodedSize) {
                throw BuildError("Encoded size $encodedSize is more than $maxEncodedSize: ${it.value}")
            }
        }
        return when (values.mapNotNull { it.lang }.size) {
            0 -> Attribute(Tag.textWithLanguage, name, values, encoder)
            values.size -> Attribute(Tag.textWithoutLanguage, name, values, encoder)
            else -> throw BuildError("If one Text includes a language, then all must have a language")
        }
    }

    /** Convenience operator for text without language */
    fun of(vararg values: String) = of(values.map { Text(it) })

    /** Convenience operator for text without language */
    operator fun invoke(vararg values: String) = of(values.map { Text(it) })
}
