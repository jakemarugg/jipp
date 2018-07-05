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
 * "print-scaling" keyword as defined in
 * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf).
 */
data class PrintScaling(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PrintScaling] attributes */
    class Type(name: String) : KeywordType<PrintScaling>(Encoder, name)

    companion object {
        @JvmField val auto = PrintScaling("auto")
        @JvmField val autoFit = PrintScaling("auto-fit")
        @JvmField val fill = PrintScaling("fill")
        @JvmField val fit = PrintScaling("fit")
        @JvmField val none = PrintScaling("none")
        @JvmField val Encoder = KeywordType.encoderOf(PrintScaling::class.java) { value, _, _ ->
            PrintScaling(value)
        }
    }
}
