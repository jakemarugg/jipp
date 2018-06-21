package com.hp.jipp.encoding

import com.hp.jipp.util.BuildError
import java.io.IOException

/**
 * An attribute type for `name` types, which can be encoded with either [Tag.nameWithoutLanguage] or
 * [Tag.nameWithLanguage].
 *
 * See [RFC8011 Section 5.1.3](https://tools.ietf.org/html/rfc8011#section-5.1.3).
 */
class NameType(override val name: String) : AttributeType<Name>(Encoder, Tag.nameWithoutLanguage) {
    companion object Encoder : SimpleEncoder<Name>("Name") {
        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): Name {
            // Length should exactly match lang/string total length but we will discard
            input.readShort().toInt()
            val lang = input.readString()
            val string = input.readString()
            return Name(string, lang)
        }

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: Name) {
            // TODO: Deal with the fact that some names will have language and some will not
            value.lang ?: throw BuildError("Cannot write a LangString without a language")
            out.writeShort(out.stringLength(value.lang) + out.stringLength(value.value))
            out.writeString(value.lang)
            out.writeString(value.value)
        }

        override fun valid(valueTag: Tag): Boolean {
            return valueTag === Tag.nameWithLanguage || valueTag === Tag.textWithLanguage
        }
    }
}

data class Name(val value: String, val lang: String? = null)