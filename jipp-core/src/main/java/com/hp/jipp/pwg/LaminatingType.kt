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
 * "laminating-type" keyword as defined in
 * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf).
 *
 * Also used by:
 *   * `laminating-type-supported`
 */
data class LaminatingType(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    /** Construct a [Tag.keyword] form of this preset */
    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [LaminatingType] attributes */
    class Type(name: String) : KeywordType<LaminatingType>(Encoder, name)

    companion object {
        @JvmField val archival = LaminatingType("archival")
        @JvmField val glossy = LaminatingType("glossy")
        @JvmField val highGloss = LaminatingType("high-gloss")
        @JvmField val matte = LaminatingType("matte")
        @JvmField val semiGloss = LaminatingType("semi-gloss")
        @JvmField val translucent = LaminatingType("translucent")
        @JvmField val Encoder = KeywordType.encoderOf(LaminatingType::class.java) { value, tag, language ->
            LaminatingType(value, tag, language)
        }
    }
}
