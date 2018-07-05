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
 * "baling-type" keyword as defined in
 * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf).
 *
 * Also used by:
 *   * `baling-type-supported`
 */
data class BalingType(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    /** Construct a [Tag.keyword] form of this preset */
    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [BalingType] attributes */
    class Type(name: String) : KeywordType<BalingType>(Encoder, name)

    companion object {
        @JvmField val band = BalingType("band")
        @JvmField val shrinkWrap = BalingType("shrink-wrap")
        @JvmField val wrap = BalingType("wrap")
        @JvmField val Encoder = KeywordType.encoderOf(BalingType::class.java) { value, tag, language ->
            BalingType(value, tag, language)
        }
    }
}
