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
 * "cover-back-supported" keyword as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 *
 * Also used by:
 *   * `cover-front-supported`
 *   * `job-cover-back-supported`
 */
data class CoverBack(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [CoverBack] attributes */
    class Type(name: String) : KeywordType<CoverBack>(Encoder, name)

    companion object {
        @JvmField val coverType = CoverBack("cover-type")
        @JvmField val media = CoverBack("media")
        @JvmField val mediaCol = CoverBack("media-col")
        @JvmField val Encoder = KeywordType.encoderOf(CoverBack::class.java) { value, _, _ ->
            CoverBack(value)
        }
    }
}