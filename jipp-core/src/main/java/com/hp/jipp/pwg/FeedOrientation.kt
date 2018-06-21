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
 * "feed-orientation" keyword as defined in:
 *   * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
 *
 * Also used by:
 *   * `feed-orientation-supported`
 *   * `media-source-feed-direction`
 */
data class FeedOrientation(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [FeedOrientation] attributes */
    class Type(name: String) : KeywordType<FeedOrientation>(Encoder, name)

    companion object {
        @JvmField val longEdgeFirst = FeedOrientation("long-edge-first")
        @JvmField val shortEdgeFirst = FeedOrientation("short-edge-first")
        @JvmField val Encoder = KeywordType.encoderOf(FeedOrientation::class.java) { value, _, _ ->
            FeedOrientation(value)
        }
    }
}
