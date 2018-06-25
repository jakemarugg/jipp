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
 * "print-base" keyword as defined in:
 *   * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
 */
data class PrintBase(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PrintBase] attributes */
    class Type(name: String) : KeywordType<PrintBase>(Encoder, name)

    companion object {
        @JvmField val brim = PrintBase("brim")
        @JvmField val none = PrintBase("none")
        @JvmField val raft = PrintBase("raft")
        @JvmField val skirt = PrintBase("skirt")
        @JvmField val standard = PrintBase("standard")
        @JvmField val Encoder = KeywordType.encoderOf(PrintBase::class.java) { value, _, _ ->
            PrintBase(value)
        }
    }
}