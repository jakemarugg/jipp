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
 * "print-content-optimize" keyword as defined in
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf).
 *
 * Also used by:
 *   * `print-content-optimize-default`
 *   * `print-content-optimize-supported`
 */
data class PrintContentOptimize(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PrintContentOptimize] attributes */
    class Type(name: String) : KeywordType<PrintContentOptimize>(Encoder, name)

    companion object {
        @JvmField val auto = PrintContentOptimize("auto")
        @JvmField val graphic = PrintContentOptimize("graphic")
        @JvmField val photo = PrintContentOptimize("photo")
        @JvmField val text = PrintContentOptimize("text")
        @JvmField val textAndGraphic = PrintContentOptimize("text-and-graphic")
        @JvmField val Encoder = KeywordType.encoderOf(PrintContentOptimize::class.java) { value, _, _ ->
            PrintContentOptimize(value)
        }
    }
}
