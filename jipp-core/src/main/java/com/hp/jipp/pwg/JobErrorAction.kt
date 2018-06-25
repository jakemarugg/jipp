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
 * "job-error-action" keyword as defined in:
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 *
 * Also used by:
 *   * `job-error-action-default`
 *   * `job-error-action-supported`
 */
data class JobErrorAction(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [JobErrorAction] attributes */
    class Type(name: String) : KeywordType<JobErrorAction>(Encoder, name)

    companion object {
        @JvmField val abortJob = JobErrorAction("abort-job")
        @JvmField val cancelJob = JobErrorAction("cancel-job")
        @JvmField val continueJob = JobErrorAction("continue-job")
        @JvmField val suspendJob = JobErrorAction("suspend-job")
        @JvmField val Encoder = KeywordType.encoderOf(JobErrorAction::class.java) { value, _, _ ->
            JobErrorAction(value)
        }
    }
}