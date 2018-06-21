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
 * "sides" keyword as defined in:
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 *
 * Also used by:
 *   * `input-sides`
 *   * `input-sides-supported`
 *   * `sides-default`
 *   * `sides-supported`
 */
data class Sides(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [Sides] attributes */
    class Type(name: String) : KeywordType<Sides>(Encoder, name)

    companion object {
        @JvmField val oneSided = Sides("one-sided")
        @JvmField val twoSidedLongEdge = Sides("two-sided-long-edge")
        @JvmField val twoSidedShortEdge = Sides("two-sided-short-edge")
        @JvmField val Encoder = KeywordType.encoderOf(Sides::class.java) { value, _, _ ->
            Sides(value)
        }
    }
}
