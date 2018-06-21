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
 * "input-source" keyword as defined in:
 *   * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf)
 *
 * Also used by:
 *   * `input-source-supported`
 */
data class InputSource(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [InputSource] attributes */
    class Type(name: String) : KeywordType<InputSource>(Encoder, name)

    companion object {
        @JvmField val adf = InputSource("adf")
        @JvmField val filmReader = InputSource("film-reader")
        @JvmField val platen = InputSource("platen")
        @JvmField val Encoder = KeywordType.encoderOf(InputSource::class.java) { value, _, _ ->
            InputSource(value)
        }
    }
}
