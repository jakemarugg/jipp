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
 * "document-format-details-supported" keyword as defined in:
 *   * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
 */
data class DocumentFormatDetailsSupported(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [DocumentFormatDetailsSupported] attributes */
    class Type(name: String) : KeywordType<DocumentFormatDetailsSupported>(Encoder, name)

    companion object {
        @JvmField val documentFormat = DocumentFormatDetailsSupported("document-format")
        @JvmField val documentFormatDeviceId = DocumentFormatDetailsSupported("document-format-device-id")
        @JvmField val documentFormatVersion = DocumentFormatDetailsSupported("document-format-version")
        @JvmField val documentNaturalLanguage = DocumentFormatDetailsSupported("document-natural-language")
        @JvmField val documentSourceApplicationName = DocumentFormatDetailsSupported("document-source-application-name")
        @JvmField val documentSourceApplicationVersion = DocumentFormatDetailsSupported("document-source-application-version")
        @JvmField val documentSourceOsName = DocumentFormatDetailsSupported("document-source-os-name")
        @JvmField val documentSourceOsVersion = DocumentFormatDetailsSupported("document-source-os-version")
        @JvmField val Encoder = KeywordType.encoderOf(DocumentFormatDetailsSupported::class.java) { value, _, _ ->
            DocumentFormatDetailsSupported(value)
        }
    }
}
