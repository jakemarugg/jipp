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
 * "input-content-type" keyword as defined in
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 *
 * Also used by:
 *   * `input-content-type-supported`
 */
data class InputContentType(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [InputContentType] attributes */
    class Type(name: String) : KeywordType<InputContentType>(Encoder, name)

    companion object {
        @JvmField val auto = InputContentType("auto")
        @JvmField val halftone = InputContentType("halftone")
        @JvmField val lineArt = InputContentType("line-art")
        @JvmField val magazine = InputContentType("magazine")
        @JvmField val photo = InputContentType("photo")
        @JvmField val text = InputContentType("text")
        @JvmField val textAndPhoto = InputContentType("text-and-photo")
        @JvmField val Encoder = KeywordType.encoderOf(InputContentType::class.java) { value, _, _ ->
            InputContentType(value)
        }
    }
}
