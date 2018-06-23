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
 * Attribute types for the Document Status group.
 */
object DocumentStatusGroup {

    /**
     * "attributes-charset" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val attributesCharset = StringType(Tag.charset, "attributes-charset")

    /**
     * "attributes-natural-language" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val attributesNaturalLanguage = StringType(Tag.naturalLanguage, "attributes-natural-language")

    /**
     * "compression" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val compression = Compression.Type("compression")

    /**
     * "copies-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val copiesActual = IntegerType("copies-actual")

    /**
     * "cover-back-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val coverBackActual = CollectionType("cover-back-actual")

    /**
     * "cover-front-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val coverFrontActual = CollectionType("cover-front-actual")

    /**
     * "current-page-order" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val currentPageOrder = PageOrderReceived.Type("current-page-order")

    /**
     * "date-time-at-completed" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val dateTimeAtCompleted = DateTimeType("date-time-at-completed")

    /**
     * "date-time-at-creation" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val dateTimeAtCreation = DateTimeType("date-time-at-creation")

    /**
     * "date-time-at-processing" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val dateTimeAtProcessing = DateTimeType("date-time-at-processing")

    /**
     * "detailed-status-messages" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val detailedStatusMessages = TextType("detailed-status-messages")

    /**
     * "document-access-errors" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentAccessErrors = TextType("document-access-errors")

    /**
     * "document-charset" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentCharset = StringType(Tag.charset, "document-charset")

    /**
     * "document-digital-signature" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentDigitalSignature = DocumentDigitalSignature.Type("document-digital-signature")

    /**
     * "document-format" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormat = StringType(Tag.mimeMediaType, "document-format")

    /**
     * "document-format-details" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormatDetails = CollectionType("document-format-details")

    /**
     * "document-format-details-detected" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormatDetailsDetected = CollectionType("document-format-details-detected")

    /**
     * "document-format-detected" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormatDetected = StringType(Tag.mimeMediaType, "document-format-detected")

    /**
     * "document-format-ready" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val documentFormatReady = StringType(Tag.mimeMediaType, "document-format-ready")

    /**
     * "document-format-supplied" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentFormatSupplied = StringType(Tag.mimeMediaType, "document-format-supplied")

    /**
     * "document-format-version" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormatVersion = TextType(127, "document-format-version")

    /**
     * "document-format-version-detected" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentFormatVersionDetected = TextType(127, "document-format-version-detected")

    /**
     * "document-job-id" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentJobId = IntegerType("document-job-id")

    /**
     * "document-job-uri" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentJobUri = UriType("document-job-uri")

    /**
     * "document-message" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentMessage = TextType("document-message")

    /**
     * "document-message-supplied" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentMessageSupplied = TextType("document-message-supplied")

    /**
     * "document-name-supplied" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val documentNameSupplied = NameType("document-name-supplied")

    /**
     * "document-natural-language" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentNaturalLanguage = StringType(Tag.naturalLanguage, "document-natural-language")

    /**
     * "document-number" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentNumber = IntegerType("document-number")

    /**
     * "document-printer-uri" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentPrinterUri = UriType("document-printer-uri")

    /**
     * "document-state" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentState = DocumentState.Type("document-state")

    /**
     * "document-state-message" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentStateMessage = TextType("document-state-message")

    /**
     * "document-state-reasons" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentStateReasons = DocumentStateReason.Type("document-state-reasons")

    /**
     * "document-uri" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val documentUri = UriType("document-uri")

    /**
     * "document-uuid" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val documentUuid = UriType("document-uuid")

    /**
     * "errors-count" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val errorsCount = IntegerType("errors-count")

    /**
     * "finishings-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val finishingsActual = Finishing.Type("finishings-actual")

    /**
     * "finishings-col-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val finishingsColActual = CollectionType("finishings-col-actual")

    /**
     * "force-front-side-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val forceFrontSideActual = IntegerType("force-front-side-actual")

    /**
     * "imposition-template-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val impositionTemplateActual = ImpositionTemplate.Type("imposition-template-actual")

    /**
     * "impressions-completed" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val impressionsCompleted = IntegerType("impressions-completed")

    /**
     * "impressions-completed-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val impressionsCompletedCol = CollectionType("impressions-completed-col")

    /**
     * "impressions-completed-current-copy" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val impressionsCompletedCurrentCopy = IntegerType("impressions-completed-current-copy")

    /**
     * "input-attributes-actual" as defined in:
     * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf)
     */
    @JvmField val inputAttributesActual = CollectionType("input-attributes-actual")

    /**
     * "insert-sheet-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val insertSheetActual = CollectionType("insert-sheet-actual")

    /**
     * "k-octets-processed" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val kOctetsProcessed = IntegerType("k-octets-processed")

    /**
     * "last-document" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val lastDocument = BooleanType("last-document")

    /**
     * "materials-col-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val materialsColActual = CollectionType("materials-col-actual")

    /**
     * "media-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val mediaActual = Media.Type("media-actual")

    /**
     * "media-col-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val mediaColActual = CollectionType("media-col-actual")

    /**
     * "media-input-tray-check-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val mediaInputTrayCheckActual = Media.Type("media-input-tray-check-actual")

    /**
     * "media-sheets-completed" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val mediaSheetsCompleted = IntegerType("media-sheets-completed")

    /**
     * "media-sheets-completed-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val mediaSheetsCompletedCol = CollectionType("media-sheets-completed-col")

    /**
     * "more-info" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val moreInfo = UriType("more-info")

    /**
     * "multiple-object-handling-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val multipleObjectHandlingActual = MultipleObjectHandling.Type("multiple-object-handling-actual")

    /**
     * "number-up-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val numberUpActual = IntegerType("number-up-actual")

    /**
     * "orientation-requested-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val orientationRequestedActual = Orientation.Type("orientation-requested-actual")

    /**
     * "output-attributes-actual" as defined in:
     * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf)
     */
    @JvmField val outputAttributesActual = CollectionType("output-attributes-actual")

    /**
     * "output-bin-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val outputBinActual = NameType("output-bin-actual")

    /**
     * "output-device-assigned" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val outputDeviceAssigned = NameType(127, "output-device-assigned")

    /**
     * "output-device-document-state" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val outputDeviceDocumentState = DocumentState.Type("output-device-document-state")

    /**
     * "output-device-document-state-message" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val outputDeviceDocumentStateMessage = TextType("output-device-document-state-message")

    /**
     * "output-device-document-state-reasons" as defined in:
     * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
     */
    @JvmField val outputDeviceDocumentStateReasons = DocumentStateReason.Type("output-device-document-state-reasons")

    /**
     * "overrides-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val overridesActual = CollectionType("overrides-actual")

    /**
     * "page-delivery-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val pageDeliveryActual = PageDelivery.Type("page-delivery-actual")

    /**
     * "page-order-received-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val pageOrderReceivedActual = PageOrderReceived.Type("page-order-received-actual")

    /**
     * "page-ranges-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val pageRangesActual = RangeOfIntegerType("page-ranges-actual")

    /**
     * "pages-completed" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val pagesCompleted = IntegerType("pages-completed")

    /**
     * "pages-completed-col" as defined in:
     * [APRIL2015F2F](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20150429.pdf)
     */
    @JvmField val pagesCompletedCol = CollectionType("pages-completed-col")

    /**
     * "pages-completed-current-copy" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val pagesCompletedCurrentCopy = IntegerType("pages-completed-current-copy")

    /**
     * "platform-temperature-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val platformTemperatureActual = IntegerType("platform-temperature-actual")

    /**
     * "presentation-direction-number-up-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val presentationDirectionNumberUpActual = PresentationDirectionNumberUp.Type("presentation-direction-number-up-actual")

    /**
     * "print-accuracy-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val printAccuracyActual = CollectionType("print-accuracy-actual")

    /**
     * "print-base-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val printBaseActual = PrintBase.Type("print-base-actual")

    /**
     * "print-color-mode-actual" as defined in:
     * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
     */
    @JvmField val printColorModeActual = PrintColorMode.Type("print-color-mode-actual")

    /**
     * "print-content-optimize-actual" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val printContentOptimizeActual = PrintContentOptimize.Type("print-content-optimize-actual")

    /**
     * "print-objects-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val printObjectsActual = CollectionType("print-objects-actual")

    /**
     * "print-quality-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val printQualityActual = PrintQuality.Type("print-quality-actual")

    /**
     * "print-rendering-intent-actual" as defined in:
     * [PWG5100.7](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext10-20031031-5100.7.pdf)
     */
    @JvmField val printRenderingIntentActual = PrintRenderingIntent.Type("print-rendering-intent-actual")

    /**
     * "print-supports-actual" as defined in:
     * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
     */
    @JvmField val printSupportsActual = PrintSupports.Type("print-supports-actual")

    /**
     * "printer-resolution-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val printerResolutionActual = ResolutionType("printer-resolution-actual")

    /**
     * "printer-up-time" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val printerUpTime = IntegerType("printer-up-time")

    /**
     * "separator-sheets-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val separatorSheetsActual = CollectionType("separator-sheets-actual")

    /**
     * "sheet-completed-copy-number" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val sheetCompletedCopyNumber = IntegerType("sheet-completed-copy-number")

    /**
     * "sides-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val sidesActual = Sides.Type("sides-actual")

    /**
     * "time-at-completed" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val timeAtCompleted = IntegerType("time-at-completed")

    /**
     * "time-at-creation" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val timeAtCreation = IntegerType("time-at-creation")

    /**
     * "time-at-processing" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val timeAtProcessing = IntegerType("time-at-processing")

    /**
     * "warnings-count" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val warningsCount = IntegerType("warnings-count")

    /**
     * "x-image-position-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val xImagePositionActual = XImagePosition.Type("x-image-position-actual")

    /**
     * "x-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val xImageShiftActual = IntegerType("x-image-shift-actual")

    /**
     * "x-side1-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val xSide1ImageShiftActual = IntegerType("x-side1-image-shift-actual")

    /**
     * "x-side2-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val xSide2ImageShiftActual = IntegerType("x-side2-image-shift-actual")

    /**
     * "y-image-position-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val yImagePositionActual = YImagePosition.Type("y-image-position-actual")

    /**
     * "y-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val yImageShiftActual = IntegerType("y-image-shift-actual")

    /**
     * "y-side1-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val ySide1ImageShiftActual = IntegerType("y-side1-image-shift-actual")

    /**
     * "y-side2-image-shift-actual" as defined in:
     * [PWG5100.5](http://ftp.pwg.org/pub/pwg/candidates/cs-ippdocobject10-20031031-5100.5.pdf)
     */
    @JvmField val ySide2ImageShiftActual = IntegerType("y-side2-image-shift-actual")

    /** All known attributes */
    @JvmField
    val all = DocumentStatusGroup::class.java.getStaticObjects()
            .filter { it is AttributeType<*> }
            .map { it as AttributeType<*> }
}
