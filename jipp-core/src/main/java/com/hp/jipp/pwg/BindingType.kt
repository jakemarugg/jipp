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
 * "binding-type" keyword as defined in:
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *
 * Also used by:
 *   * `binding-type-supported`
 */
data class BindingType(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [BindingType] attributes */
    class Type(name: String) : KeywordType<BindingType>(Encoder, name)

    companion object {
        @JvmField val adhesive = BindingType("adhesive")
        @JvmField val comb = BindingType("comb")
        @JvmField val flat = BindingType("flat")
        @JvmField val padding = BindingType("padding")
        @JvmField val perfect = BindingType("perfect")
        @JvmField val spiral = BindingType("spiral")
        @JvmField val tape = BindingType("tape")
        @JvmField val velo = BindingType("velo")
        @JvmField val Encoder = KeywordType.encoderOf(BindingType::class.java) { value, tag, language ->
            BindingType(value, tag, language)
        }
    }
}