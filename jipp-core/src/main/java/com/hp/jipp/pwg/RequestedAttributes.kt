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
 * "requested-attributes" keyword as defined in:
 *   * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
 *   * [PWG5100.8](http://ftp.pwg.org/pub/pwg/candidates/cs-ippactuals10-20030313-5100.8.pdf)
 *   * [RFC3995](http://www.iana.org/go/rfc3995)
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 */
data class RequestedAttributes(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [RequestedAttributes] attributes */
    class Type(name: String) : KeywordType<RequestedAttributes>(Encoder, name)

    companion object {
        @JvmField val all = RequestedAttributes("all")
        @JvmField val documentDescription = RequestedAttributes("document-description")
        @JvmField val documentTemplate = RequestedAttributes("document-template")
        @JvmField val jobActuals = RequestedAttributes("job-actuals")
        @JvmField val jobDescription = RequestedAttributes("job-description")
        @JvmField val jobTemplate = RequestedAttributes("job-template")
        @JvmField val printerDescription = RequestedAttributes("printer-description")
        @JvmField val subscriptionDescription = RequestedAttributes("subscription-description")
        @JvmField val subscriptionTemplate = RequestedAttributes("subscription-template")
        @JvmField val Encoder = KeywordType.encoderOf(RequestedAttributes::class.java) { value, _, _ ->
            RequestedAttributes(value)
        }
    }
}
