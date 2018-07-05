// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.KeywordOrName
import com.hp.jipp.encoding.KeywordType
import com.hp.jipp.encoding.Tag

/**
 * "covering-name" keyword as defined in
 * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf).
 *
 * Also used by:
 *   * `covering-name-supported`
 */
data class CoveringName(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    /** Construct a [Tag.keyword] form of this preset */
    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [CoveringName] attributes */
    class Type(name: String) : KeywordType<CoveringName>(Encoder, name)

    companion object {
        @JvmField val plain = CoveringName("plain")
        @JvmField val preCut = CoveringName("pre-cut")
        @JvmField val prePrinted = CoveringName("pre-printed")
        @JvmField val Encoder = KeywordType.encoderOf(CoveringName::class.java) { value, tag, language ->
            CoveringName(value, tag, language)
        }
    }
}
