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
 * "media-recycled" keyword as defined in
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 *
 * Also used by:
 *   * `media-recycled-supported`
 */
data class MediaRecycled(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    /** Construct a [Tag.keyword] form of this preset */
    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [MediaRecycled] attributes */
    class Type(name: String) : KeywordType<MediaRecycled>(Encoder, name)

    companion object {
        @JvmField val none = MediaRecycled("none")
        @JvmField val standard = MediaRecycled("standard")
        @JvmField val Encoder = KeywordType.encoderOf(MediaRecycled::class.java) { value, tag, language ->
            MediaRecycled(value, tag, language)
        }
    }
}
