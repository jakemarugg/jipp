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
 * "input-color-mode" keyword as defined in
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf),
 * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 *
 * Also used by:
 *   * `input-color-mode-supported`
 */
data class InputColorMode(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [InputColorMode] attributes */
    class Type(name: String) : KeywordType<InputColorMode>(Encoder, name)

    companion object {
        @JvmField val auto = InputColorMode("auto")
        @JvmField val biLevel = InputColorMode("bi-level")
        @JvmField val cmyk16 = InputColorMode("cmyk_16")
        @JvmField val cmyk8 = InputColorMode("cmyk_8")
        @JvmField val color = InputColorMode("color")
        @JvmField val color8 = InputColorMode("color_8")
        @JvmField val monochrome = InputColorMode("monochrome")
        @JvmField val monochrome16 = InputColorMode("monochrome_16")
        @JvmField val monochrome4 = InputColorMode("monochrome_4")
        @JvmField val monochrome8 = InputColorMode("monochrome_8")
        @JvmField val rgb16 = InputColorMode("rgb_16")
        @JvmField val rgba16 = InputColorMode("rgba_16")
        @JvmField val rgba8 = InputColorMode("rgba_8")
        @JvmField val Encoder = KeywordType.encoderOf(InputColorMode::class.java) { value, _, _ ->
            InputColorMode(value)
        }
    }
}
