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
 * "jpeg-features-supported" keyword as defined in:
 *   * [APPLE20151021](http://www.pwg.org/pipermail/ipp/2015/018634.html)
 */
data class JpegFeatures(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [JpegFeatures] attributes */
    class Type(name: String) : KeywordType<JpegFeatures>(Encoder, name)

    companion object {
        @JvmField val arithmetic = JpegFeatures("arithmetic")
        @JvmField val cmyk = JpegFeatures("cmyk")
        @JvmField val deep = JpegFeatures("deep")
        @JvmField val hierarchical = JpegFeatures("hierarchical")
        @JvmField val icc = JpegFeatures("icc")
        @JvmField val lossless = JpegFeatures("lossless")
        @JvmField val none = JpegFeatures("none")
        @JvmField val progressive = JpegFeatures("progressive")
        @JvmField val Encoder = KeywordType.encoderOf(JpegFeatures::class.java) { value, _, _ ->
            JpegFeatures(value)
        }
    }
}
