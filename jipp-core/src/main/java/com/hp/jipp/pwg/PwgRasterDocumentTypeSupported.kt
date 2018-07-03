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
 * "pwg-raster-document-type-supported" keyword as defined in:
 *   * [PWG5102.4](http://ftp.pwg.org/pub/pwg/candidates/cs-ippraster10-20120420-5102.4.pdf)
 */
data class PwgRasterDocumentTypeSupported(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PwgRasterDocumentTypeSupported] attributes */
    class Type(name: String) : KeywordType<PwgRasterDocumentTypeSupported>(Encoder, name)

    companion object {
        @JvmField val adobeRgb16 = PwgRasterDocumentTypeSupported("adobe-rgb_16")
        @JvmField val adobeRgb8 = PwgRasterDocumentTypeSupported("adobe-rgb_8")
        @JvmField val black1 = PwgRasterDocumentTypeSupported("black_1")
        @JvmField val black16 = PwgRasterDocumentTypeSupported("black_16")
        @JvmField val black8 = PwgRasterDocumentTypeSupported("black_8")
        @JvmField val cmyk16 = PwgRasterDocumentTypeSupported("cmyk_16")
        @JvmField val cmyk8 = PwgRasterDocumentTypeSupported("cmyk_8")
        @JvmField val device1016 = PwgRasterDocumentTypeSupported("device10_16")
        @JvmField val device108 = PwgRasterDocumentTypeSupported("device10_8")
        @JvmField val device1116 = PwgRasterDocumentTypeSupported("device11_16")
        @JvmField val device118 = PwgRasterDocumentTypeSupported("device11_8")
        @JvmField val device1216 = PwgRasterDocumentTypeSupported("device12_16")
        @JvmField val device128 = PwgRasterDocumentTypeSupported("device12_8")
        @JvmField val device1316 = PwgRasterDocumentTypeSupported("device13_16")
        @JvmField val device138 = PwgRasterDocumentTypeSupported("device13_8")
        @JvmField val device1416 = PwgRasterDocumentTypeSupported("device14_16")
        @JvmField val device148 = PwgRasterDocumentTypeSupported("device14_8")
        @JvmField val device1516 = PwgRasterDocumentTypeSupported("device15_16")
        @JvmField val device158 = PwgRasterDocumentTypeSupported("device15_8")
        @JvmField val device116 = PwgRasterDocumentTypeSupported("device1_16")
        @JvmField val device18 = PwgRasterDocumentTypeSupported("device1_8")
        @JvmField val device216 = PwgRasterDocumentTypeSupported("device2_16")
        @JvmField val device28 = PwgRasterDocumentTypeSupported("device2_8")
        @JvmField val device316 = PwgRasterDocumentTypeSupported("device3_16")
        @JvmField val device38 = PwgRasterDocumentTypeSupported("device3_8")
        @JvmField val device416 = PwgRasterDocumentTypeSupported("device4_16")
        @JvmField val device48 = PwgRasterDocumentTypeSupported("device4_8")
        @JvmField val device516 = PwgRasterDocumentTypeSupported("device5_16")
        @JvmField val device58 = PwgRasterDocumentTypeSupported("device5_8")
        @JvmField val device616 = PwgRasterDocumentTypeSupported("device6_16")
        @JvmField val device68 = PwgRasterDocumentTypeSupported("device6_8")
        @JvmField val device716 = PwgRasterDocumentTypeSupported("device7_16")
        @JvmField val device78 = PwgRasterDocumentTypeSupported("device7_8")
        @JvmField val device816 = PwgRasterDocumentTypeSupported("device8_16")
        @JvmField val device88 = PwgRasterDocumentTypeSupported("device8_8")
        @JvmField val device916 = PwgRasterDocumentTypeSupported("device9_16")
        @JvmField val device98 = PwgRasterDocumentTypeSupported("device9_8")
        @JvmField val rgb16 = PwgRasterDocumentTypeSupported("rgb_16")
        @JvmField val rgb8 = PwgRasterDocumentTypeSupported("rgb_8")
        @JvmField val sgray1 = PwgRasterDocumentTypeSupported("sgray_1")
        @JvmField val sgray16 = PwgRasterDocumentTypeSupported("sgray_16")
        @JvmField val sgray8 = PwgRasterDocumentTypeSupported("sgray_8")
        @JvmField val srgb16 = PwgRasterDocumentTypeSupported("srgb_16")
        @JvmField val srgb8 = PwgRasterDocumentTypeSupported("srgb_8")
        @JvmField val Encoder = KeywordType.encoderOf(PwgRasterDocumentTypeSupported::class.java) { value, _, _ ->
            PwgRasterDocumentTypeSupported(value)
        }
    }
}
