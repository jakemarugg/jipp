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
 * "job-destination-spooling-supported" keyword as defined in
 * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
data class JobDestinationSpoolingSupported(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [JobDestinationSpoolingSupported] attributes */
    class Type(name: String) : KeywordType<JobDestinationSpoolingSupported>(Encoder, name)

    companion object {
        @JvmField val automatic = JobDestinationSpoolingSupported("automatic")
        @JvmField val spool = JobDestinationSpoolingSupported("spool")
        @JvmField val stream = JobDestinationSpoolingSupported("stream")
        @JvmField val Encoder = KeywordType.encoderOf(JobDestinationSpoolingSupported::class.java) { value, _, _ ->
            JobDestinationSpoolingSupported(value)
        }
    }
}