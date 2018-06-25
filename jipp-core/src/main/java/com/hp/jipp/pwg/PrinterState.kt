// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.Enum
import com.hp.jipp.encoding.EnumType

/**
 * "printer-state" enum as defined in:
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 */
data class PrinterState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An attribute type for [PrinterState] attributes */
    class Type(name: String) : EnumType<PrinterState>(Encoder, name)

    object Code {
        const val idle = 3
        const val processing = 4
        const val stopped = 5
    }

    companion object {
        @JvmField val idle = PrinterState(Code.idle, "idle")
        @JvmField val processing = PrinterState(Code.processing, "processing")
        @JvmField val stopped = PrinterState(Code.stopped, "stopped")

        @JvmField val Encoder = EnumType.Encoder(PrinterState::class.java) { code, name ->
            PrinterState(code, name)
        }
    }
}