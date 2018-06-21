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
 * "y-image-position" keyword as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 *
 * Also used by:
 *   * `y-image-position-default`
 *   * `y-image-position-supported`
 */
data class YImagePosition(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [YImagePosition] attributes */
    class Type(name: String) : KeywordType<YImagePosition>(Encoder, name)

    companion object {
        @JvmField val bottom = YImagePosition("bottom")
        @JvmField val center = YImagePosition("center")
        @JvmField val none = YImagePosition("none")
        @JvmField val top = YImagePosition("top")
        @JvmField val Encoder = KeywordType.encoderOf(YImagePosition::class.java) { value, _, _ ->
            YImagePosition(value)
        }
    }
}
