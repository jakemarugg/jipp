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
 * "job-hold-until" keyword as defined in
 * [RFC8011](http://www.iana.org/go/rfc8011).
 *
 * Also used by:
 *   * `job-hold-until-default`
 *   * `job-hold-until-supported`
 */
data class JobHoldUntil(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    /** Construct a [Tag.keyword] form of this preset */
    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [JobHoldUntil] attributes */
    class Type(name: String) : KeywordType<JobHoldUntil>(Encoder, name)

    companion object {
        @JvmField val dayTime = JobHoldUntil("day-time")
        @JvmField val evening = JobHoldUntil("evening")
        @JvmField val indefinite = JobHoldUntil("indefinite")
        @JvmField val night = JobHoldUntil("night")
        @JvmField val noHold = JobHoldUntil("no-hold")
        @JvmField val secondShift = JobHoldUntil("second-shift")
        @JvmField val thirdShift = JobHoldUntil("third-shift")
        @JvmField val weekend = JobHoldUntil("weekend")
        @JvmField val Encoder = KeywordType.encoderOf(JobHoldUntil::class.java) { value, tag, language ->
            JobHoldUntil(value, tag, language)
        }
    }
}
