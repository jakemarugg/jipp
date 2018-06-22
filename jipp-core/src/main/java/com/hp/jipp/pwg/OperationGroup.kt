// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports
import com.hp.jipp.util.getStaticObjects

/**
 * Attribute types for the Operation group.
 */
object OperationGroup {

    /**
     * "attributes-charset" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val attributesCharset = StringType(Tag.charset, "attributes-charset")

    /**
     * "attributes-natural-language" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val attributesNaturalLanguage = StringType(Tag.naturalLanguage, "attributes-natural-language")

    /**
     * "charge-info-message" as defined in:
     * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf)
     */
    @JvmField val chargeInfoMessage = TextType("charge-info-message")

    /**
     * "compression" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val compression = Compression.Type("compression")

    /**
     * "compression-accepted" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val compressionAccepted = Compression.Type("compression-accepted")

    /**
     * "destination-accesses" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val destinationAccesses = CollectionType("destination-accesses")

    /**
     * "detailed-status-message" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val detailedStatusMessage = TextType("detailed-status-message")

    /**
     * "document-access" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val documentAccess = CollectionType("document-access")

    /**
     * "document-access-error" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val documentAccessError = TextType("document-access-error")

    /**
     * "document-charset" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentCharset = StringType(Tag.charset, "document-charset")

    /**
     * "document-data-get-interval" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val documentDataGetInterval = IntegerType("document-data-get-interval")

    /**
     * "document-data-wait" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val documentDataWait = BooleanType("document-data-wait")

    /**
     * "document-digital-signature" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentDigitalSignature = DocumentDigitalSignature.Type("document-digital-signature")

    /**
     * "document-format" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val documentFormat = StringType(Tag.mimeMediaType, "document-format")

    /**
     * "document-format-accepted" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val documentFormatAccepted = StringType(Tag.mimeMediaType, "document-format-accepted")

    /**
     * "document-format-details" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentFormatDetails = CollectionType("document-format-details")

    /**
     * "document-message" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentMessage = TextType("document-message")

    /**
     * "document-metadata" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val documentMetadata = OctetStringType("document-metadata")

    /**
     * "document-name" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val documentName = NameType("document-name")

    /**
     * "document-natural-language" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val documentNaturalLanguage = StringType(Tag.naturalLanguage, "document-natural-language")

    /**
     * "document-number" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentNumber = IntegerType("document-number")

    /**
     * "document-password" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val documentPassword = OctetStringType(1023, "document-password")

    /**
     * "document-preprocessed" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val documentPreprocessed = BooleanType("document-preprocessed")

    /**
     * "fetch-status-code" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val fetchStatusCode = Status.Type("fetch-status-code")

    /**
     * "fetch-status-message" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val fetchStatusMessage = TextType("fetch-status-message")

    /**
     * "first-index" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val firstIndex = IntegerType("first-index")

    /**
     * "identify-actions" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val identifyActions = IdentifyAction.Type("identify-actions")

    /**
     * "input-attributes" as defined in:
     * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf)
     */
    @JvmField val inputAttributes = CollectionType("input-attributes")

    /**
     * "ipp-attribute-fidelity" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val ippAttributeFidelity = BooleanType("ipp-attribute-fidelity")

    /**
     * "job-authorization-uri" as defined in:
     * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf)
     */
    @JvmField val jobAuthorizationUri = UriType("job-authorization-uri")

    /**
     * "job-hold-until" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobHoldUntil = JobHoldUntil.Type("job-hold-until")

    /**
     * "job-id" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobId = IntegerType("job-id")

    /**
     * "job-ids" as defined in:
     * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
     */
    @JvmField val jobIds = IntegerType("job-ids")

    /**
     * "job-impressions" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobImpressions = IntegerType("job-impressions")

    /**
     * "job-impressions-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val jobImpressionsCol = CollectionType("job-impressions-col")

    /**
     * "job-impressions-estimated" as defined in:
     * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf)
     */
    @JvmField val jobImpressionsEstimated = IntegerType("job-impressions-estimated")

    /**
     * "job-k-octets" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobKOctets = IntegerType("job-k-octets")

    /**
     * "job-media-sheets" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobMediaSheets = IntegerType("job-media-sheets")

    /**
     * "job-media-sheets-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val jobMediaSheetsCol = CollectionType("job-media-sheets-col")

    /**
     * "job-message-from-operator" as defined in:
     * [RFC3380](http://www.iana.org/go/rfc3380)
     */
    @JvmField val jobMessageFromOperator = TextType(127, "job-message-from-operator")

    /**
     * "job-name" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobName = NameType("job-name")

    /**
     * "job-pages" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val jobPages = IntegerType("job-pages")

    /**
     * "job-pages-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val jobPagesCol = CollectionType("job-pages-col")

    /**
     * "job-password" as defined in:
     * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
     */
    @JvmField val jobPassword = OctetStringType(255, "job-password")

    /**
     * "job-password-encryption" as defined in:
     * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
     */
    @JvmField val jobPasswordEncryption = JobPasswordEncryption.Type("job-password-encryption")

    /**
     * "job-state" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobState = JobState.Type("job-state")

    /**
     * "job-state-message" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobStateMessage = TextType("job-state-message")

    /**
     * "job-state-reasons" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobStateReasons = JobStateReason.Type("job-state-reasons")

    /**
     * "job-uri" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val jobUri = UriType("job-uri")

    /**
     * "last-document" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val lastDocument = BooleanType("last-document")

    /**
     * "limit" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val limit = IntegerType("limit")

    /**
     * "message" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val message = TextType(127, "message")

    /**
     * "my-jobs" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val myJobs = BooleanType("my-jobs")

    /**
     * "notify-get-interval" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996)
     */
    @JvmField val notifyGetInterval = IntegerType("notify-get-interval")

    /**
     * "notify-sequence-numbers" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996)
     */
    @JvmField val notifySequenceNumbers = IntegerType("notify-sequence-numbers")

    /**
     * "notify-subscription-ids" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996)
     */
    @JvmField val notifySubscriptionIds = IntegerType("notify-subscription-ids")

    /**
     * "notify-wait" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996)
     */
    @JvmField val notifyWait = BooleanType("notify-wait")

    /**
     * "original-requesting-user-name" as defined in:
     * [RFC3998](http://www.iana.org/go/rfc3998)
     */
    @JvmField val originalRequestingUserName = NameType("original-requesting-user-name")

    /**
     * "output-attributes" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val outputAttributes = CollectionType("output-attributes")

    /**
     * "output-device-job-states" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val outputDeviceJobStates = JobState.Type("output-device-job-states")

    /**
     * "output-device-uuid" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val outputDeviceUuid = UriType("output-device-uuid")

    /**
     * "preferred-attributes" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val preferredAttributes = CollectionType("preferred-attributes")

    /**
     * "printer-message-from-operator" as defined in:
     * [RFC3380](http://www.iana.org/go/rfc3380)
     */
    @JvmField val printerMessageFromOperator = TextType(127, "printer-message-from-operator")

    /**
     * "printer-up-time" as defined in:
     * [RFC3996](http://www.iana.org/go/rfc3996)
     */
    @JvmField val printerUpTime = IntegerType("printer-up-time")

    /**
     * "printer-uri" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val printerUri = UriType("printer-uri")

    /**
     * "profile-uri-actual" as defined in:
     * [PWG5100.16](http://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf)
     */
    @JvmField val profileUriActual = UriType("profile-uri-actual")

    /**
     * "requested-attributes" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val requestedAttributes = RequestedAttribute.Type("requested-attributes")

    /**
     * "requesting-user-name" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val requestingUserName = NameType("requesting-user-name")

    /**
     * "requesting-user-uri" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val requestingUserUri = UriType("requesting-user-uri")

    /**
     * "status-message" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val statusMessage = TextType(255, "status-message")

    /**
     * "which-jobs" as defined in:
     * [RFC8011](http://www.iana.org/go/rfc8011)
     */
    @JvmField val whichJobs = WhichJobs.Type("which-jobs")

    /** All known attributes */
    @JvmField
    val all = OperationGroup::class.java.getStaticObjects()
            .filter { it is AttributeType<*> }
            .map { it as AttributeType<*> }
}