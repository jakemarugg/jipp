// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.Keyword
import com.hp.jipp.encoding.KeywordType

/**
 * "cover-sheet-info-supported" keyword as defined in:
 *   * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf)
 */
data class CoverSheetInfo(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [CoverSheetInfo] attributes */
    class Type(name: String) : KeywordType<CoverSheetInfo>(Encoder, name)

    companion object {
        @JvmField val dateTime = CoverSheetInfo("date-time")
        @JvmField val fromName = CoverSheetInfo("from-name")
        @JvmField val logo = CoverSheetInfo("logo")
        @JvmField val message = CoverSheetInfo("message")
        @JvmField val organization = CoverSheetInfo("organization")
        @JvmField val subject = CoverSheetInfo("subject")
        @JvmField val toName = CoverSheetInfo("to-name")
        @JvmField val Encoder = KeywordType.encoderOf(CoverSheetInfo::class.java) { value, _, _ ->
            CoverSheetInfo(value)
        }
    }
}