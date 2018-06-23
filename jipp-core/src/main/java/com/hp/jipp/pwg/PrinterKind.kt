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
 * "printer-kind" keyword as defined in:
 *   * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf)
 */
data class PrinterKind(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PrinterKind] attributes */
    class Type(name: String) : KeywordType<PrinterKind>(Encoder, name)

    companion object {
        @JvmField val disc = PrinterKind("disc")
        @JvmField val document = PrinterKind("document")
        @JvmField val envelope = PrinterKind("envelope")
        @JvmField val label = PrinterKind("label")
        @JvmField val largeFormat = PrinterKind("large-format")
        @JvmField val photo = PrinterKind("photo")
        @JvmField val postcard = PrinterKind("postcard")
        @JvmField val receipt = PrinterKind("receipt")
        @JvmField val roll = PrinterKind("roll")
        @JvmField val Encoder = KeywordType.encoderOf(PrinterKind::class.java) { value, _, _ ->
            PrinterKind(value)
        }
    }
}
