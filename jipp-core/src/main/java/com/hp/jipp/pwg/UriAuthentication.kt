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
 * "uri-authentication-supported" keyword as defined in:
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 *   * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 */
data class UriAuthentication(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [UriAuthentication] attributes */
    class Type(name: String) : KeywordType<UriAuthentication>(Encoder, name)

    companion object {
        @JvmField val basic = UriAuthentication("basic")
        @JvmField val certificate = UriAuthentication("certificate")
        @JvmField val digest = UriAuthentication("digest")
        @JvmField val negotiate = UriAuthentication("negotiate")
        @JvmField val none = UriAuthentication("none")
        @JvmField val oauth = UriAuthentication("oauth")
        @JvmField val requestingUserName = UriAuthentication("requesting-user-name")
        @JvmField val Encoder = KeywordType.encoderOf(UriAuthentication::class.java) { value, _, _ ->
            UriAuthentication(value)
        }
    }
}
