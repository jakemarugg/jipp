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
 * "ipp-versions-supported" keyword as defined in:
 *   * [PWG5100.10](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp20-20090731-5100.10.pdf)
 *   * [PWG5100.12](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp20-20110214-5100.12.pdf)
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 */
data class IppVersion(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [IppVersion] attributes */
    class Type(name: String) : KeywordType<IppVersion>(Encoder, name)

    companion object {
        @JvmField val num10 = IppVersion("1.0")
        @JvmField val num11 = IppVersion("1.1")
        @JvmField val num20 = IppVersion("2.0")
        @JvmField val num21 = IppVersion("2.1")
        @JvmField val num22 = IppVersion("2.2")
        @JvmField val Encoder = KeywordType.encoderOf(IppVersion::class.java) { value, _, _ ->
            IppVersion(value)
        }
    }
}