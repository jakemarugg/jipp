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
 * "pdf-features-supported" keyword as defined in:
 *   * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
 */
data class PdfFeature(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PdfFeature] attributes */
    class Type(name: String) : KeywordType<PdfFeature>(Encoder, name)

    companion object {
        @JvmField val prc = PdfFeature("prc")
        @JvmField val u3D = PdfFeature("u3d")
        @JvmField val Encoder = KeywordType.encoderOf(PdfFeature::class.java) { value, _, _ ->
            PdfFeature(value)
        }
    }
}