// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-size-supported" collection as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 */
data class MediaSizeSupported
@JvmOverloads constructor(
    val xDimension: IntRangeOrInt? = null,
    val yDimension: IntRangeOrInt? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            xDimension?.also {
                add(Members.xDimension.of(it))
            }
            yDimension?.also {
                add(Members.yDimension.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<MediaSizeSupported>(Members, name)

    companion object Members : CollectionParser<MediaSizeSupported> {
        override val typeName = MediaSizeSupported::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): MediaSizeSupported {
            val remain = attributes.toMutableList()
            return MediaSizeSupported(
                extractOne(remain, xDimension),
                extractOne(remain, yDimension),
                _extras = remain)
        }
        /** "x-dimension" member type */
        @JvmField val xDimension = IntegerOrRangeOfIntegerType("x-dimension")
        /** "y-dimension" member type */
        @JvmField val yDimension = IntegerOrRangeOfIntegerType("y-dimension")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [MediaSizeSupported] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "x-dimension" member type */
            @JvmField val xDimension = Keywords(Members.xDimension.name)
            /** "y-dimension" member type */
            @JvmField val yDimension = Keywords(Members.yDimension.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}