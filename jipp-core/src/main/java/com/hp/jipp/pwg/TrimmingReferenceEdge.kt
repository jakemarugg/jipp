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
 * "trimming-reference-edge" keyword as defined in:
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *
 * Also used by:
 *   * `trimming-reference-edge-supported`
 */
data class TrimmingReferenceEdge(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [TrimmingReferenceEdge] attributes */
    class Type(name: String) : KeywordType<TrimmingReferenceEdge>(Encoder, name)

    companion object {
        @JvmField val bottom = TrimmingReferenceEdge("bottom")
        @JvmField val left = TrimmingReferenceEdge("left")
        @JvmField val right = TrimmingReferenceEdge("right")
        @JvmField val top = TrimmingReferenceEdge("top")
        @JvmField val Encoder = KeywordType.encoderOf(TrimmingReferenceEdge::class.java) { value, _, _ ->
            TrimmingReferenceEdge(value)
        }
    }
}