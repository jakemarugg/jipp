// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports
import com.hp.jipp.util.getStaticObjects

/**
 * Attribute types for the Document Description group.
 */
object DocumentDescriptionGroup {

    /**
     * "document-metadata" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val documentMetadata = OctetStringType("document-metadata")

    /**
     * "document-name" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentName = NameType("document-name")

    /**
     * "impressions" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val impressions = IntegerType("impressions")

    /**
     * "impressions-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val impressionsCol = CollectionType("impressions-col")

    /**
     * Attributes which may appear within [impressionsCol]
     */
     object ImpressionsCol {

        /** "blank-two-sided" member */
        @JvmField val blankTwoSided = IntegerType("blank-two-sided")

        /** "highlight-color" member */
        @JvmField val highlightColor = IntegerType("highlight-color")

        /** "highlight-color-two-sided" member */
        @JvmField val highlightColorTwoSided = IntegerType("highlight-color-two-sided")

        /** "full-color" member */
        @JvmField val fullColor = IntegerType("full-color")

        /** "full-color-two-sided" member */
        @JvmField val fullColorTwoSided = IntegerType("full-color-two-sided")

        /** "blank" member */
        @JvmField val blank = IntegerType("blank")

        /** "monochrome" member */
        @JvmField val monochrome = IntegerType("monochrome")

        /** "monochrome-two-sided" member */
        @JvmField val monochromeTwoSided = IntegerType("monochrome-two-sided")
    }

    /**
     * "k-octets" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val kOctets = IntegerType("k-octets")

    /**
     * "media-sheets" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val mediaSheets = IntegerType("media-sheets")

    /**
     * "media-sheets-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val mediaSheetsCol = CollectionType("media-sheets-col")

    /**
     * Attributes which may appear within [mediaSheetsCol]
     */
     object MediaSheetsCol {

        /** "blank-two-sided" member */
        @JvmField val blankTwoSided = IntegerType("blank-two-sided")

        /** "highlight-color" member */
        @JvmField val highlightColor = IntegerType("highlight-color")

        /** "highlight-color-two-sided" member */
        @JvmField val highlightColorTwoSided = IntegerType("highlight-color-two-sided")

        /** "full-color" member */
        @JvmField val fullColor = IntegerType("full-color")

        /** "full-color-two-sided" member */
        @JvmField val fullColorTwoSided = IntegerType("full-color-two-sided")

        /** "blank" member */
        @JvmField val blank = IntegerType("blank")

        /** "monochrome" member */
        @JvmField val monochrome = IntegerType("monochrome")

        /** "monochrome-two-sided" member */
        @JvmField val monochromeTwoSided = IntegerType("monochrome-two-sided")
    }

    /**
     * "pages" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val pages = IntegerType("pages")

    /**
     * "pages-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val pagesCol = CollectionType("pages-col")

    /**
     * Attributes which may appear within [pagesCol]
     */
     object PagesCol {

        /** "monochrome" member */
        @JvmField val monochrome = IntegerType("monochrome")

        /** "full-color" member */
        @JvmField val fullColor = IntegerType("full-color")
    }

    /** All known attributes */
    @JvmField
    val all = DocumentDescriptionGroup::class.java.getStaticObjects()
            .filter { it is AttributeType<*> }
            .map { it as AttributeType<*> }
}