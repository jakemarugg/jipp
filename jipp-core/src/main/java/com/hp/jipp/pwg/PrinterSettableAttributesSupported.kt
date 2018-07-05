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
 * "printer-settable-attributes-supported" keyword as defined in
 * [RFC3380]().
 */
data class PrinterSettableAttributesSupported(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PrinterSettableAttributesSupported] attributes */
    class Type(name: String) : KeywordType<PrinterSettableAttributesSupported>(Encoder, name)

    companion object {
        @JvmField val none = PrinterSettableAttributesSupported("none")
        @JvmField val Encoder = KeywordType.encoderOf(PrinterSettableAttributesSupported::class.java) { value, _, _ ->
            PrinterSettableAttributesSupported(value)
        }
    }
}
