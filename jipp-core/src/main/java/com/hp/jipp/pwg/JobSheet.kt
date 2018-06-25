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
 * "job-sheets" keyword as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 *
 * Also used by:
 *   * `job-sheets-default`
 *   * `job-sheets-supported`
 */
data class JobSheet(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [JobSheet] attributes */
    class Type(name: String) : KeywordType<JobSheet>(Encoder, name)

    companion object {
        @JvmField val firstPrintStreamPage = JobSheet("first-print-stream-page")
        @JvmField val jobBothSheet = JobSheet("job-both-sheet")
        @JvmField val jobEndSheet = JobSheet("job-end-sheet")
        @JvmField val jobStartSheet = JobSheet("job-start-sheet")
        @JvmField val none = JobSheet("none")
        @JvmField val standard = JobSheet("standard")
        @JvmField val Encoder = KeywordType.encoderOf(JobSheet::class.java) { value, tag, language ->
            JobSheet(value, tag, language)
        }
    }
}