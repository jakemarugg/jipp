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
 * "x-image-position" keyword as defined in
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 *
 * Also used by:
 *   * `x-image-position-default`
 *   * `x-image-position-supported`
 */
data class XImagePosition(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [XImagePosition] attributes */
    class Type(name: String) : KeywordType<XImagePosition>(Encoder, name)

    companion object {
        @JvmField val center = XImagePosition("center")
        @JvmField val left = XImagePosition("left")
        @JvmField val none = XImagePosition("none")
        @JvmField val right = XImagePosition("right")
        @JvmField val Encoder = KeywordType.encoderOf(XImagePosition::class.java) { value, _, _ ->
            XImagePosition(value)
        }
    }
}
