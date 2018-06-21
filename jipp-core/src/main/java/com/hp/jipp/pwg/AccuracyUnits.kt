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
 * "accuracy-units" keyword as defined in:
 *   * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
 *
 * Also used by:
 *   * `accuracy-units-supported`
 */
data class AccuracyUnits(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [AccuracyUnits] attributes */
    class Type(name: String) : KeywordType<AccuracyUnits>(Encoder, name)

    companion object {
        @JvmField val mm = AccuracyUnits("mm")
        @JvmField val nm = AccuracyUnits("nm")
        @JvmField val um = AccuracyUnits("um")
        @JvmField val Encoder = KeywordType.encoderOf(AccuracyUnits::class.java) { value, _, _ ->
            AccuracyUnits(value)
        }
    }
}
