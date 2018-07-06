// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "input-scan-regions-supported" collection as defined in:
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class InputScanRegionsSupported
@JvmOverloads constructor(
    val xDimension: IntRange? = null,
    val xOrigin: IntRange? = null,
    val yDimension: IntRange? = null,
    val yOrigin: IntRange? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            xDimension?.also {
                add(Members.xDimension.of(it))
            }
            xOrigin?.also {
                add(Members.xOrigin.of(it))
            }
            yDimension?.also {
                add(Members.yDimension.of(it))
            }
            yOrigin?.also {
                add(Members.yOrigin.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<InputScanRegionsSupported>(Members, name)

    companion object Members : CollectionParser<InputScanRegionsSupported> {
        override val typeName = InputScanRegionsSupported::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): InputScanRegionsSupported {
            val remain = attributes.toMutableList()
            return InputScanRegionsSupported(
                extractOne(remain, xDimension),
                extractOne(remain, xOrigin),
                extractOne(remain, yDimension),
                extractOne(remain, yOrigin),
                _extras = remain)
        }
        /** "x-dimension" member type */
        @JvmField val xDimension = RangeOfIntegerType("x-dimension")
        /** "x-origin" member type */
        @JvmField val xOrigin = RangeOfIntegerType("x-origin")
        /** "y-dimension" member type */
        @JvmField val yDimension = RangeOfIntegerType("y-dimension")
        /** "y-origin" member type */
        @JvmField val yOrigin = RangeOfIntegerType("y-origin")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [InputScanRegionsSupported] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "x-dimension" member type */
            @JvmField val xDimension = Keywords(Members.xDimension.name)
            /** "x-origin" member type */
            @JvmField val xOrigin = Keywords(Members.xOrigin.name)
            /** "y-dimension" member type */
            @JvmField val yDimension = Keywords(Members.yDimension.name)
            /** "y-origin" member type */
            @JvmField val yOrigin = Keywords(Members.yOrigin.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}