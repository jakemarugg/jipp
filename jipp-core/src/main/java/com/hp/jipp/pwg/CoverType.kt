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
 * "cover-type" keyword as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 */
data class CoverType(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [CoverType] attributes */
    class Type(name: String) : KeywordType<CoverType>(Encoder, name)

    companion object {
        @JvmField val noCover = CoverType("no-cover")
        @JvmField val printBack = CoverType("print-back")
        @JvmField val printBoth = CoverType("print-both")
        @JvmField val printFront = CoverType("print-front")
        @JvmField val printNone = CoverType("print-none")
        @JvmField val Encoder = KeywordType.encoderOf(CoverType::class.java) { value, _, _ ->
            CoverType(value)
        }
    }
}