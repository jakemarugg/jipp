// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "separator-sheets" collection as defined in:
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
@Suppress("RedundantCompanionReference", "unused")
data class SeparatorSheets
@JvmOverloads constructor(
    val media: Media? = null,
    val mediaCol: MediaCol? = null,
    val separatorSheetsType: List<SeparatorSheetsType>? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            media?.also {
                add(Members.media.of(it))
            }
            mediaCol?.also {
                add(Members.mediaCol.of(it))
            }
            separatorSheetsType?.also {
                add(Members.separatorSheetsType.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<SeparatorSheets>(Members, name)

    companion object Members : CollectionParser<SeparatorSheets> {
        override val typeName = SeparatorSheets::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): SeparatorSheets {
            val remain = attributes.toMutableList()
            return SeparatorSheets(
                extractOne(remain, media),
                extractOne(remain, mediaCol),
                extractAll(remain, separatorSheetsType),
                _extras = remain)
        }
        /** "media" member type */
        @JvmField val media = Media.Type("media")
        /** "media-col" member type */
        @JvmField val mediaCol = MediaCol.Type("media-col")
        /** "separator-sheets-type" member type */
        @JvmField val separatorSheetsType = SeparatorSheetsType.Type("separator-sheets-type")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [SeparatorSheets] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "media" member type */
            @JvmField val media = Keywords(Members.media.name)
            /** "media-col" member type */
            @JvmField val mediaCol = Keywords(Members.mediaCol.name)
            /** "separator-sheets-type" member type */
            @JvmField val separatorSheetsType = Keywords(Members.separatorSheetsType.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}
