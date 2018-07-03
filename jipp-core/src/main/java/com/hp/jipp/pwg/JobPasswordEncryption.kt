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
 * "job-password-encryption" keyword as defined in:
 *   * [IPPWG20140616](http://www.pwg.org/archives/ipp/2014/018054.html)
 *   * [IPPWG20151009](http://www.pwg.org/pipermail/ipp/2015/018621.html)
 *   * [IPPWG20160229-1](http://ftp.pwg.org/pub/pwg/ipp/wd/wp-job-password-repertoire-20160101.pdf)
 *   * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
 *
 * Also used by:
 *   * `job-password-encryption-supported`
 */
data class JobPasswordEncryption(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [JobPasswordEncryption] attributes */
    class Type(name: String) : KeywordType<JobPasswordEncryption>(Encoder, name)

    companion object {
        @JvmField val md2 = JobPasswordEncryption("md2")
        @JvmField val md4 = JobPasswordEncryption("md4")
        @JvmField val md5 = JobPasswordEncryption("md5")
        @JvmField val none = JobPasswordEncryption("none")
        @JvmField val sha = JobPasswordEncryption("sha")
        @JvmField val sha2224 = JobPasswordEncryption("sha2-224")
        @JvmField val sha2256 = JobPasswordEncryption("sha2-256")
        @JvmField val sha2384 = JobPasswordEncryption("sha2-384")
        @JvmField val sha2512 = JobPasswordEncryption("sha2-512")
        @JvmField val sha2512224 = JobPasswordEncryption("sha2-512_224")
        @JvmField val sha2512256 = JobPasswordEncryption("sha2-512_256")
        @JvmField val sha3224 = JobPasswordEncryption("sha3-224")
        @JvmField val sha3256 = JobPasswordEncryption("sha3-256")
        @JvmField val sha3384 = JobPasswordEncryption("sha3-384")
        @JvmField val sha3512 = JobPasswordEncryption("sha3-512")
        @JvmField val sha3512224 = JobPasswordEncryption("sha3-512_224")
        @JvmField val sha3512256 = JobPasswordEncryption("sha3-512_256")
        @JvmField val shake128 = JobPasswordEncryption("shake-128")
        @JvmField val shake256 = JobPasswordEncryption("shake-256")
        @JvmField val Encoder = KeywordType.encoderOf(JobPasswordEncryption::class.java) { value, _, _ ->
            JobPasswordEncryption(value)
        }
    }
}
