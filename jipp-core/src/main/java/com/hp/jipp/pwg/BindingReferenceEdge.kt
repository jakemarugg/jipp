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
 * "binding-reference-edge" keyword as defined in:
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *
 * Also used by:
 *   * `binding-reference-edge-supported`
 */
data class BindingReferenceEdge(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [BindingReferenceEdge] attributes */
    class Type(name: String) : KeywordType<BindingReferenceEdge>(Encoder, name)

    companion object {
        @JvmField val bottom = BindingReferenceEdge("bottom")
        @JvmField val left = BindingReferenceEdge("left")
        @JvmField val right = BindingReferenceEdge("right")
        @JvmField val top = BindingReferenceEdge("top")
        @JvmField val Encoder = KeywordType.encoderOf(BindingReferenceEdge::class.java) { value, _, _ ->
            BindingReferenceEdge(value)
        }
    }
}