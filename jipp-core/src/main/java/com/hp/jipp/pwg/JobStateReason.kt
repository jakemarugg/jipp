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
 * "job-state-reasons" keyword as defined in
 * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf),
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf),
 * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf),
 * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf),
 * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf),
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf),
 * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf),
 * [RFC3998](http://www.iana.org/go/rfc3998),
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class JobStateReason(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [JobStateReason] attributes */
    class Type(name: String) : KeywordType<JobStateReason>(Encoder, name)

    companion object {
        @JvmField val abortedBySystem = JobStateReason("aborted-by-system")
        @JvmField val accountAuthorizationFailed = JobStateReason("account-authorization-failed")
        @JvmField val accountClosed = JobStateReason("account-closed")
        @JvmField val accountInfoNeeded = JobStateReason("account-info-needed")
        @JvmField val accountLimitReached = JobStateReason("account-limit-reached")
        @JvmField val compressionError = JobStateReason("compression-error")
        @JvmField val conflictingAttributes = JobStateReason("conflicting-attributes")
        @JvmField val connectedToDestination = JobStateReason("connected-to-destination")
        @JvmField val connectingToDestination = JobStateReason("connecting-to-destination")
        @JvmField val destinationUriFailed = JobStateReason("destination-uri-failed")
        @JvmField val digitalSignatureDidNotVerify = JobStateReason("digital-signature-did-not-verify")
        @JvmField val digitalSignatureTypeNotSupported = JobStateReason("digital-signature-type-not-supported")
        @JvmField val documentAccessError = JobStateReason("document-access-error")
        @JvmField val documentFormatError = JobStateReason("document-format-error")
        @JvmField val documentPasswordError = JobStateReason("document-password-error")
        @JvmField val documentPermissionError = JobStateReason("document-permission-error")
        @JvmField val documentSecurityError = JobStateReason("document-security-error")
        @JvmField val documentUnprintableError = JobStateReason("document-unprintable-error")
        @JvmField val errorsDetected = JobStateReason("errors-detected")
        @JvmField val jobCanceledAtDevice = JobStateReason("job-canceled-at-device")
        @JvmField val jobCanceledByOperator = JobStateReason("job-canceled-by-operator")
        @JvmField val jobCanceledByUser = JobStateReason("job-canceled-by-user")
        @JvmField val jobCompletedSuccessfully = JobStateReason("job-completed-successfully")
        @JvmField val jobCompletedWithErrors = JobStateReason("job-completed-with-errors")
        @JvmField val jobCompletedWithWarnings = JobStateReason("job-completed-with-warnings")
        @JvmField val jobDataInsufficient = JobStateReason("job-data-insufficient")
        @JvmField val jobDelayOutputUntilSpecified = JobStateReason("job-delay-output-until-specified")
        @JvmField val jobDigitalSignatureWait = JobStateReason("job-digital-signature-wait")
        @JvmField val jobFetchable = JobStateReason("job-fetchable")
        @JvmField val jobHeldForReview = JobStateReason("job-held-for-review")
        @JvmField val jobHoldUntilSpecified = JobStateReason("job-hold-until-specified")
        @JvmField val jobIncoming = JobStateReason("job-incoming")
        @JvmField val jobInterpreting = JobStateReason("job-interpreting")
        @JvmField val jobOutgoing = JobStateReason("job-outgoing")
        @JvmField val jobPasswordWait = JobStateReason("job-password-wait")
        @JvmField val jobPrintedSuccessfully = JobStateReason("job-printed-successfully")
        @JvmField val jobPrintedWithErrors = JobStateReason("job-printed-with-errors")
        @JvmField val jobPrintedWithWarnings = JobStateReason("job-printed-with-warnings")
        @JvmField val jobPrinting = JobStateReason("job-printing")
        @JvmField val jobQueued = JobStateReason("job-queued")
        @JvmField val jobQueuedForMarker = JobStateReason("job-queued-for-marker")
        @JvmField val jobReleaseWait = JobStateReason("job-release-wait")
        @JvmField val jobRestartable = JobStateReason("job-restartable")
        @JvmField val jobResuming = JobStateReason("job-resuming")
        @JvmField val jobSavedSuccessfully = JobStateReason("job-saved-successfully")
        @JvmField val jobSavedWithErrors = JobStateReason("job-saved-with-errors")
        @JvmField val jobSavedWithWarnings = JobStateReason("job-saved-with-warnings")
        @JvmField val jobSaving = JobStateReason("job-saving")
        @JvmField val jobSpooling = JobStateReason("job-spooling")
        @JvmField val jobStreaming = JobStateReason("job-streaming")
        @JvmField val jobSuspended = JobStateReason("job-suspended")
        @JvmField val jobSuspendedByOperator = JobStateReason("job-suspended-by-operator")
        @JvmField val jobSuspendedBySystem = JobStateReason("job-suspended-by-system")
        @JvmField val jobSuspendedByUser = JobStateReason("job-suspended-by-user")
        @JvmField val jobSuspending = JobStateReason("job-suspending")
        @JvmField val jobTransferring = JobStateReason("job-transferring")
        @JvmField val jobTransforming = JobStateReason("job-transforming")
        @JvmField val none = JobStateReason("none")
        @JvmField val printerStopped = JobStateReason("printer-stopped")
        @JvmField val printerStoppedPartly = JobStateReason("printer-stopped-partly")
        @JvmField val processingToStopPoint = JobStateReason("processing-to-stop-point")
        @JvmField val queuedInDevice = JobStateReason("queued-in-device")
        @JvmField val resourcesAreNotReady = JobStateReason("resources-are-not-ready")
        @JvmField val resourcesAreNotSupported = JobStateReason("resources-are-not-supported")
        @JvmField val serviceOffLine = JobStateReason("service-off-line")
        @JvmField val submissionInterrupted = JobStateReason("submission-interrupted")
        @JvmField val unsupportedAttributesOrValues = JobStateReason("unsupported-attributes-or-values")
        @JvmField val unsupportedCompression = JobStateReason("unsupported-compression")
        @JvmField val unsupportedDocumentFormat = JobStateReason("unsupported-document-format")
        @JvmField val waitingForUserAction = JobStateReason("waiting-for-user-action")
        @JvmField val warningsDetected = JobStateReason("warnings-detected")
        @JvmField val Encoder = KeywordType.encoderOf(JobStateReason::class.java) { value, _, _ ->
            JobStateReason(value)
        }
    }
}
