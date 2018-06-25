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
 * "compression" keyword as defined in:
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 *
 * Also used by:
 *   * `compression-accepted`
 *   * `compression-supported`
 */
data class Compression(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [Compression] attributes */
    class Type(name: String) : KeywordType<Compression>(Encoder, name)

    companion object {
        @JvmField val compress = Compression("compress")
        @JvmField val deflate = Compression("deflate")
        @JvmField val gzip = Compression("gzip")
        @JvmField val none = Compression("none")
        @JvmField val Encoder = KeywordType.encoderOf(Compression::class.java) { value, _, _ ->
            Compression(value)
        }
    }
}