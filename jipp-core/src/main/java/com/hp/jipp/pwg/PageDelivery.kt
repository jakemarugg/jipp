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
 * "page-delivery" keyword as defined in:
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 *
 * Also used by:
 *   * `page-delivery-default`
 *   * `page-delivery-supported`
 */
data class PageDelivery(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [PageDelivery] attributes */
    class Type(name: String) : KeywordType<PageDelivery>(Encoder, name)

    companion object {
        @JvmField val reverseOrderFaceDown = PageDelivery("reverse-order-face-down")
        @JvmField val reverseOrderFaceUp = PageDelivery("reverse-order-face-up")
        @JvmField val sameOrderFaceDown = PageDelivery("same-order-face-down")
        @JvmField val sameOrderFaceUp = PageDelivery("same-order-face-up")
        @JvmField val systemSpecified = PageDelivery("system-specified")
        @JvmField val Encoder = KeywordType.encoderOf(PageDelivery::class.java) { value, _, _ ->
            PageDelivery(value)
        }
    }
}
