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
 * "document-state-reasons" keyword as defined in:
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 *   * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
 *   * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
 */
data class DocumentStateReason(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [DocumentStateReason] attributes */
    class Type(name: String) : KeywordType<DocumentStateReason>(Encoder, name)

    companion object {
        @JvmField val abortedBySystem = DocumentStateReason("aborted-by-system")
        @JvmField val canceledAtDevice = DocumentStateReason("canceled-at-device")
        @JvmField val canceledByOperator = DocumentStateReason("canceled-by-operator")
        @JvmField val canceledByUser = DocumentStateReason("canceled-by-user")
        @JvmField val completedSuccessfully = DocumentStateReason("completed-successfully")
        @JvmField val completedWithErrors = DocumentStateReason("completed-with-errors")
        @JvmField val completedWithWarnings = DocumentStateReason("completed-with-warnings")
        @JvmField val compressionError = DocumentStateReason("compression-error")
        @JvmField val dataInsufficient = DocumentStateReason("data-insufficient")
        @JvmField val digitalSignatureDidNotVerify = DocumentStateReason("digital-signature-did-not-verify")
        @JvmField val digitalSignatureTypeNotSupported = DocumentStateReason("digital-signature-type-not-supported")
        @JvmField val digitalSignatureWait = DocumentStateReason("digital-signature-wait")
        @JvmField val documentAccessError = DocumentStateReason("document-access-error")
        @JvmField val documentFetchable = DocumentStateReason("document-fetchable")
        @JvmField val documentFormatError = DocumentStateReason("document-format-error")
        @JvmField val documentPasswordError = DocumentStateReason("document-password-error")
        @JvmField val documentPermissionError = DocumentStateReason("document-permission-error")
        @JvmField val documentSecurityError = DocumentStateReason("document-security-error")
        @JvmField val documentUnprintableError = DocumentStateReason("document-unprintable-error")
        @JvmField val errorsDetected = DocumentStateReason("errors-detected")
        @JvmField val incoming = DocumentStateReason("incoming")
        @JvmField val interpreting = DocumentStateReason("interpreting")
        @JvmField val none = DocumentStateReason("none")
        @JvmField val outgoing = DocumentStateReason("outgoing")
        @JvmField val printing = DocumentStateReason("printing")
        @JvmField val processingToStopPoint = DocumentStateReason("processing-to-stop-point")
        @JvmField val queued = DocumentStateReason("queued")
        @JvmField val queuedForMarker = DocumentStateReason("queued-for-marker")
        @JvmField val queuedInDevice = DocumentStateReason("queued-in-device")
        @JvmField val resourcesAreNotReady = DocumentStateReason("resources-are-not-ready")
        @JvmField val resourcesAreNotSupported = DocumentStateReason("resources-are-not-supported")
        @JvmField val submissionInterrupted = DocumentStateReason("submission-interrupted")
        @JvmField val transforming = DocumentStateReason("transforming")
        @JvmField val unsupportedCompression = DocumentStateReason("unsupported-compression")
        @JvmField val unsupportedDocumentFormat = DocumentStateReason("unsupported-document-format")
        @JvmField val warningsDetected = DocumentStateReason("warnings-detected")
        @JvmField val Encoder = KeywordType.encoderOf(DocumentStateReason::class.java) { value, _, _ ->
            DocumentStateReason(value)
        }
    }
}
