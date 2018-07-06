// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-media-sheets-col" collection as defined in:
 * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class JobMediaSheetsCol
@JvmOverloads constructor(
    val blank: Int? = null,
    val blankTwoSided: Int? = null,
    val fullColor: Int? = null,
    val fullColorTwoSided: Int? = null,
    val highlightColor: Int? = null,
    val highlightColorTwoSided: Int? = null,
    val monochrome: Int? = null,
    val monochromeTwoSided: Int? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            blank?.also {
                add(Members.blank.of(it))
            }
            blankTwoSided?.also {
                add(Members.blankTwoSided.of(it))
            }
            fullColor?.also {
                add(Members.fullColor.of(it))
            }
            fullColorTwoSided?.also {
                add(Members.fullColorTwoSided.of(it))
            }
            highlightColor?.also {
                add(Members.highlightColor.of(it))
            }
            highlightColorTwoSided?.also {
                add(Members.highlightColorTwoSided.of(it))
            }
            monochrome?.also {
                add(Members.monochrome.of(it))
            }
            monochromeTwoSided?.also {
                add(Members.monochromeTwoSided.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<JobMediaSheetsCol>(Members, name)

    companion object Members : CollectionParser<JobMediaSheetsCol> {
        override val typeName = JobMediaSheetsCol::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): JobMediaSheetsCol {
            val remain = attributes.toMutableList()
            return JobMediaSheetsCol(
                extractOne(remain, blank),
                extractOne(remain, blankTwoSided),
                extractOne(remain, fullColor),
                extractOne(remain, fullColorTwoSided),
                extractOne(remain, highlightColor),
                extractOne(remain, highlightColorTwoSided),
                extractOne(remain, monochrome),
                extractOne(remain, monochromeTwoSided),
                _extras = remain)
        }
        /** "blank" member type */
        @JvmField val blank = IntegerType("blank")
        /** "blank-two-sided" member type */
        @JvmField val blankTwoSided = IntegerType("blank-two-sided")
        /** "full-color" member type */
        @JvmField val fullColor = IntegerType("full-color")
        /** "full-color-two-sided" member type */
        @JvmField val fullColorTwoSided = IntegerType("full-color-two-sided")
        /** "highlight-color" member type */
        @JvmField val highlightColor = IntegerType("highlight-color")
        /** "highlight-color-two-sided" member type */
        @JvmField val highlightColorTwoSided = IntegerType("highlight-color-two-sided")
        /** "monochrome" member type */
        @JvmField val monochrome = IntegerType("monochrome")
        /** "monochrome-two-sided" member type */
        @JvmField val monochromeTwoSided = IntegerType("monochrome-two-sided")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [JobMediaSheetsCol] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "blank" member type */
            @JvmField val blank = Keywords(Members.blank.name)
            /** "blank-two-sided" member type */
            @JvmField val blankTwoSided = Keywords(Members.blankTwoSided.name)
            /** "full-color" member type */
            @JvmField val fullColor = Keywords(Members.fullColor.name)
            /** "full-color-two-sided" member type */
            @JvmField val fullColorTwoSided = Keywords(Members.fullColorTwoSided.name)
            /** "highlight-color" member type */
            @JvmField val highlightColor = Keywords(Members.highlightColor.name)
            /** "highlight-color-two-sided" member type */
            @JvmField val highlightColorTwoSided = Keywords(Members.highlightColorTwoSided.name)
            /** "monochrome" member type */
            @JvmField val monochrome = Keywords(Members.monochrome.name)
            /** "monochrome-two-sided" member type */
            @JvmField val monochromeTwoSided = Keywords(Members.monochromeTwoSided.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}