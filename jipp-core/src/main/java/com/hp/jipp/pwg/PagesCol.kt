// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "pages-col" collection as defined in:
 *   * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
 */
data class PagesCol
@JvmOverloads constructor(
    val fullColor: Int? = null,
    val monochrome: Int? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            fullColor?.also {
                add(Members.fullColor.of(it))
            }
            monochrome?.also {
                add(Members.monochrome.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<PagesCol>(Members, name)

    companion object Members : CollectionParser<PagesCol> {
        override val typeName = PagesCol::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): PagesCol {
            val remain = attributes.toMutableList()
            return PagesCol(
                extractOne(remain, fullColor),
                extractOne(remain, monochrome),
                _extras = remain)
        }
        /** "full-color" member type */
        @JvmField val fullColor = IntegerType("full-color")
        /** "monochrome" member type */
        @JvmField val monochrome = IntegerType("monochrome")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [PagesCol] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "full-color" member type */
            @JvmField val fullColor = Keywords(Members.fullColor.name)
            /** "monochrome" member type */
            @JvmField val monochrome = Keywords(Members.monochrome.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}