// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.getStaticObjects
import java.io.IOException

/** Attribute type for attributes based on [KeywordOrName] */
open class KeywordType<T : KeywordOrName>(
    encoder: KeywordType.Encoder<T>,
    override val name: String,
    vararg val altTags: Tag
) : AttributeType<T>(encoder, Tag.keyword) {

    /** An encoder for keyword types  */
    class Encoder<T : KeywordOrName>(private val factory: KeywordOrName.Factory<T>, all: Collection<T>, name: String) :
            SimpleEncoder<T>(name) {

        private val map: Map<String, T> = all.map { it.value to it }.toMap()

        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): T {
            val key = StringType.readValue(input, valueTag)
            // TODO: For nameWithLanguage, get the language string
            return map[key] ?: factory.of(key, valueTag, null)
        }

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: T) {
            // TODO: For nameWithLanguage, write the language string
            StringType.writeValue(out, value.value)
        }

        // TODO: Allow the encoder to determine which tags are acceptable as input
        override fun valid(valueTag: Tag) = valueTag == Tag.keyword

        val all: Collection<T>
            get() = map.values
    }

    companion object {
        /** Return a new [Encoder] for a class internally defining static [Keyword] objects */
        fun <T : KeywordOrName> encoderOf(cls: Class<T>, factory: KeywordOrName.Factory<T>): KeywordType.Encoder<T> =
                KeywordType.Encoder(factory, cls.getStaticObjects()
                        .filter { cls.isAssignableFrom(it.javaClass) }
                        .map {
                            @Suppress("UNCHECKED_CAST")
                            it as T
                        }, cls.simpleName)

        /** Return a new [Encoder] for a class internally defining static [Keyword] objects */
        fun <T : KeywordOrName> encoderOf(cls: Class<T>, factory: (String, Tag, String?) -> T): KeywordType.Encoder<T> =
                encoderOf(cls, object : KeywordOrName.Factory<T> {
                    override fun of(value: String, tag: Tag, language: String?): T = factory(value, tag, language)
                })
    }
}
