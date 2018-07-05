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
 * "document-format-varying-attributes" keyword as defined in
 * [RFC3380](http://www.iana.org/go/rfc3380).
 */
data class DocumentFormatVaryingAttribute(
    override val value: String
) : Keyword() {

    override fun toString() = value

    /** An attribute type for [DocumentFormatVaryingAttribute] attributes */
    class Type(name: String) : KeywordType<DocumentFormatVaryingAttribute>(Encoder, name)

    companion object {
        @JvmField val accuracyUnitsSupported = DocumentFormatVaryingAttribute("accuracy-units-supported")
        @JvmField val balingTypeSupported = DocumentFormatVaryingAttribute("baling-type-supported")
        @JvmField val balingWhenSupported = DocumentFormatVaryingAttribute("baling-when-supported")
        @JvmField val bindingReferenceEdgeSupported = DocumentFormatVaryingAttribute("binding-reference-edge-supported")
        @JvmField val bindingTypeSupported = DocumentFormatVaryingAttribute("binding-type-supported")
        @JvmField val charsetConfigured = DocumentFormatVaryingAttribute("charset-configured")
        @JvmField val charsetSupported = DocumentFormatVaryingAttribute("charset-supported")
        @JvmField val coatingSidesSupported = DocumentFormatVaryingAttribute("coating-sides-supported")
        @JvmField val coatingTypeSupported = DocumentFormatVaryingAttribute("coating-type-supported")
        @JvmField val colorSupported = DocumentFormatVaryingAttribute("color-supported")
        @JvmField val compressionSupported = DocumentFormatVaryingAttribute("compression-supported")
        @JvmField val confirmationSheetPrintDefault = DocumentFormatVaryingAttribute("confirmation-sheet-print-default")
        @JvmField val copiesDefault = DocumentFormatVaryingAttribute("copies-default")
        @JvmField val copiesSupported = DocumentFormatVaryingAttribute("copies-supported")
        @JvmField val coverBackDefault = DocumentFormatVaryingAttribute("cover-back-default")
        @JvmField val coverBackSupported = DocumentFormatVaryingAttribute("cover-back-supported")
        @JvmField val coverFrontDefault = DocumentFormatVaryingAttribute("cover-front-default")
        @JvmField val coverFrontSupported = DocumentFormatVaryingAttribute("cover-front-supported")
        @JvmField val coverSheetInfoDefault = DocumentFormatVaryingAttribute("cover-sheet-info-default")
        @JvmField val coverSheetInfoSupported = DocumentFormatVaryingAttribute("cover-sheet-info-supported")
        @JvmField val coveringNameSupported = DocumentFormatVaryingAttribute("covering-name-supported")
        @JvmField val destinationAccessesSupported = DocumentFormatVaryingAttribute("destination-accesses-supported")
        @JvmField val destinationUriReady = DocumentFormatVaryingAttribute("destination-uri-ready")
        @JvmField val destinationUriSchemesSupported = DocumentFormatVaryingAttribute("destination-uri-schemes-supported")
        @JvmField val destinationUrisSupported = DocumentFormatVaryingAttribute("destination-uris-supported")
        @JvmField val documentAccessSupported = DocumentFormatVaryingAttribute("document-access-supported")
        @JvmField val documentCharsetDefault = DocumentFormatVaryingAttribute("document-charset-default")
        @JvmField val documentCharsetSupported = DocumentFormatVaryingAttribute("document-charset-supported")
        @JvmField val documentCreationAttributesSupported = DocumentFormatVaryingAttribute("document-creation-attributes-supported")
        @JvmField val documentDigitalSignatureDefault = DocumentFormatVaryingAttribute("document-digital-signature-default")
        @JvmField val documentDigitalSignatureSupported = DocumentFormatVaryingAttribute("document-digital-signature-supported")
        @JvmField val documentFormatDefault = DocumentFormatVaryingAttribute("document-format-default")
        @JvmField val documentFormatDetailsDefault = DocumentFormatVaryingAttribute("document-format-details-default")
        @JvmField val documentFormatDetailsSupported = DocumentFormatVaryingAttribute("document-format-details-supported")
        @JvmField val documentFormatSupported = DocumentFormatVaryingAttribute("document-format-supported")
        @JvmField val documentFormatVersionDefault = DocumentFormatVaryingAttribute("document-format-version-default")
        @JvmField val documentFormatVersionSupported = DocumentFormatVaryingAttribute("document-format-version-supported")
        @JvmField val documentNaturalLanguageDefault = DocumentFormatVaryingAttribute("document-natural-language-default")
        @JvmField val documentNaturalLanguageSupported = DocumentFormatVaryingAttribute("document-natural-language-supported")
        @JvmField val documentPasswordSupported = DocumentFormatVaryingAttribute("document-password-supported")
        @JvmField val feedOrientationDefault = DocumentFormatVaryingAttribute("feed-orientation-default")
        @JvmField val feedOrientationSupported = DocumentFormatVaryingAttribute("feed-orientation-supported")
        @JvmField val fetchDocumentAttributesSupported = DocumentFormatVaryingAttribute("fetch-document-attributes-supported")
        @JvmField val finishingTemplateSupported = DocumentFormatVaryingAttribute("finishing-template-supported")
        @JvmField val finishingsColDatabase = DocumentFormatVaryingAttribute("finishings-col-database")
        @JvmField val finishingsColDefault = DocumentFormatVaryingAttribute("finishings-col-default")
        @JvmField val finishingsColReady = DocumentFormatVaryingAttribute("finishings-col-ready")
        @JvmField val finishingsColSupported = DocumentFormatVaryingAttribute("finishings-col-supported")
        @JvmField val finishingsDefault = DocumentFormatVaryingAttribute("finishings-default")
        @JvmField val finishingsReady = DocumentFormatVaryingAttribute("finishings-ready")
        @JvmField val finishingsSupported = DocumentFormatVaryingAttribute("finishings-supported")
        @JvmField val foldingDirectionSupported = DocumentFormatVaryingAttribute("folding-direction-supported")
        @JvmField val foldingOffsetSupported = DocumentFormatVaryingAttribute("folding-offset-supported")
        @JvmField val foldingReferenceEdgeSupported = DocumentFormatVaryingAttribute("folding-reference-edge-supported")
        @JvmField val fontNameRequestedDefault = DocumentFormatVaryingAttribute("font-name-requested-default")
        @JvmField val fontNameRequestedSupported = DocumentFormatVaryingAttribute("font-name-requested-supported")
        @JvmField val fontSizeRequestedDefault = DocumentFormatVaryingAttribute("font-size-requested-default")
        @JvmField val fontSizeRequestedSupported = DocumentFormatVaryingAttribute("font-size-requested-supported")
        @JvmField val fromNameSupported = DocumentFormatVaryingAttribute("from-name-supported")
        @JvmField val generatedNaturalLanguageSupported = DocumentFormatVaryingAttribute("generated-natural-language-supported")
        @JvmField val identifyActionsDefault = DocumentFormatVaryingAttribute("identify-actions-default")
        @JvmField val identifyActionsSupported = DocumentFormatVaryingAttribute("identify-actions-supported")
        @JvmField val impositionTemplateDefault = DocumentFormatVaryingAttribute("imposition-template-default")
        @JvmField val impositionTemplateSupported = DocumentFormatVaryingAttribute("imposition-template-supported")
        @JvmField val inputAttributesDefault = DocumentFormatVaryingAttribute("input-attributes-default")
        @JvmField val inputAttributesSupported = DocumentFormatVaryingAttribute("input-attributes-supported")
        @JvmField val inputColorModeSupported = DocumentFormatVaryingAttribute("input-color-mode-supported")
        @JvmField val inputContentTypeSupported = DocumentFormatVaryingAttribute("input-content-type-supported")
        @JvmField val inputFilmScanModeSupported = DocumentFormatVaryingAttribute("input-film-scan-mode-supported")
        @JvmField val inputMediaSupported = DocumentFormatVaryingAttribute("input-media-supported")
        @JvmField val inputOrientationRequestedSupported = DocumentFormatVaryingAttribute("input-orientation-requested-supported")
        @JvmField val inputQualitySupported = DocumentFormatVaryingAttribute("input-quality-supported")
        @JvmField val inputResolutionSupported = DocumentFormatVaryingAttribute("input-resolution-supported")
        @JvmField val inputScanRegionsSupported = DocumentFormatVaryingAttribute("input-scan-regions-supported")
        @JvmField val inputSidesSupported = DocumentFormatVaryingAttribute("input-sides-supported")
        @JvmField val inputSourceSupported = DocumentFormatVaryingAttribute("input-source-supported")
        @JvmField val insertAfterPageNumberSupported = DocumentFormatVaryingAttribute("insert-after-page-number-supported")
        @JvmField val insertCountSupported = DocumentFormatVaryingAttribute("insert-count-supported")
        @JvmField val insertSheetDefault = DocumentFormatVaryingAttribute("insert-sheet-default")
        @JvmField val insertSheetSupported = DocumentFormatVaryingAttribute("insert-sheet-supported")
        @JvmField val ippFeaturesSupported = DocumentFormatVaryingAttribute("ipp-features-supported")
        @JvmField val ippVersionsSupported = DocumentFormatVaryingAttribute("ipp-versions-supported")
        @JvmField val ippgetEventLife = DocumentFormatVaryingAttribute("ippget-event-life")
        @JvmField val jobAccountIdDefault = DocumentFormatVaryingAttribute("job-account-id-default")
        @JvmField val jobAccountIdSupported = DocumentFormatVaryingAttribute("job-account-id-supported")
        @JvmField val jobAccountTypeDefault = DocumentFormatVaryingAttribute("job-account-type-default")
        @JvmField val jobAccountTypeSupported = DocumentFormatVaryingAttribute("job-account-type-supported")
        @JvmField val jobAccountingSheetsDefault = DocumentFormatVaryingAttribute("job-accounting-sheets-default")
        @JvmField val jobAccountingSheetsSupported = DocumentFormatVaryingAttribute("job-accounting-sheets-supported")
        @JvmField val jobAccountingUserIdDefault = DocumentFormatVaryingAttribute("job-accounting-user-id-default")
        @JvmField val jobAccountingUserIdSupported = DocumentFormatVaryingAttribute("job-accounting-user-id-supported")
        @JvmField val jobAuthorizationUriSupported = DocumentFormatVaryingAttribute("job-authorization-uri-supported")
        @JvmField val jobConstraintsSupported = DocumentFormatVaryingAttribute("job-constraints-supported")
        @JvmField val jobCopiesDefault = DocumentFormatVaryingAttribute("job-copies-default")
        @JvmField val jobCopiesSupported = DocumentFormatVaryingAttribute("job-copies-supported")
        @JvmField val jobCoverBackDefault = DocumentFormatVaryingAttribute("job-cover-back-default")
        @JvmField val jobCoverBackSupported = DocumentFormatVaryingAttribute("job-cover-back-supported")
        @JvmField val jobCoverFrontDefault = DocumentFormatVaryingAttribute("job-cover-front-default")
        @JvmField val jobCoverFrontSupported = DocumentFormatVaryingAttribute("job-cover-front-supported")
        @JvmField val jobCreationAttributesSupported = DocumentFormatVaryingAttribute("job-creation-attributes-supported")
        @JvmField val jobDelayOutputUntilDefault = DocumentFormatVaryingAttribute("job-delay-output-until-default")
        @JvmField val jobDelayOutputUntilSupported = DocumentFormatVaryingAttribute("job-delay-output-until-supported")
        @JvmField val jobDelayOutputUntilTimeSupported = DocumentFormatVaryingAttribute("job-delay-output-until-time-supported")
        @JvmField val jobDestinationSpoolingSupported = DocumentFormatVaryingAttribute("job-destination-spooling-supported")
        @JvmField val jobErrorActionDefault = DocumentFormatVaryingAttribute("job-error-action-default")
        @JvmField val jobErrorActionSupported = DocumentFormatVaryingAttribute("job-error-action-supported")
        @JvmField val jobErrorSheetDefault = DocumentFormatVaryingAttribute("job-error-sheet-default")
        @JvmField val jobErrorSheetSupported = DocumentFormatVaryingAttribute("job-error-sheet-supported")
        @JvmField val jobFinishingsColDefault = DocumentFormatVaryingAttribute("job-finishings-col-default")
        @JvmField val jobFinishingsColReady = DocumentFormatVaryingAttribute("job-finishings-col-ready")
        @JvmField val jobFinishingsColSupported = DocumentFormatVaryingAttribute("job-finishings-col-supported")
        @JvmField val jobFinishingsDefault = DocumentFormatVaryingAttribute("job-finishings-default")
        @JvmField val jobFinishingsReady = DocumentFormatVaryingAttribute("job-finishings-ready")
        @JvmField val jobFinishingsSupported = DocumentFormatVaryingAttribute("job-finishings-supported")
        @JvmField val jobHoldUntilDefault = DocumentFormatVaryingAttribute("job-hold-until-default")
        @JvmField val jobHoldUntilSupported = DocumentFormatVaryingAttribute("job-hold-until-supported")
        @JvmField val jobHoldUntilTimeSupported = DocumentFormatVaryingAttribute("job-hold-until-time-supported")
        @JvmField val jobIdsSupported = DocumentFormatVaryingAttribute("job-ids-supported")
        @JvmField val jobImpressionsSupported = DocumentFormatVaryingAttribute("job-impressions-supported")
        @JvmField val jobKOctetsSupported = DocumentFormatVaryingAttribute("job-k-octets-supported")
        @JvmField val jobMediaSheetsSupported = DocumentFormatVaryingAttribute("job-media-sheets-supported")
        @JvmField val jobMessageToOperatorDefault = DocumentFormatVaryingAttribute("job-message-to-operator-default")
        @JvmField val jobMessageToOperatorSupported = DocumentFormatVaryingAttribute("job-message-to-operator-supported")
        @JvmField val jobPagesPerSetSupported = DocumentFormatVaryingAttribute("job-pages-per-set-supported")
        @JvmField val jobPasswordEncryptionSupported = DocumentFormatVaryingAttribute("job-password-encryption-supported")
        @JvmField val jobPasswordLengthSupported = DocumentFormatVaryingAttribute("job-password-length-supported")
        @JvmField val jobPasswordRepertoireConfigured = DocumentFormatVaryingAttribute("job-password-repertoire-configured")
        @JvmField val jobPasswordRepertoireSupported = DocumentFormatVaryingAttribute("job-password-repertoire-supported")
        @JvmField val jobPasswordSupported = DocumentFormatVaryingAttribute("job-password-supported")
        @JvmField val jobPhoneNumberDefault = DocumentFormatVaryingAttribute("job-phone-number-default")
        @JvmField val jobPhoneNumberSupported = DocumentFormatVaryingAttribute("job-phone-number-supported")
        @JvmField val jobPresetsSupported = DocumentFormatVaryingAttribute("job-presets-supported")
        @JvmField val jobPriorityDefault = DocumentFormatVaryingAttribute("job-priority-default")
        @JvmField val jobPrioritySupported = DocumentFormatVaryingAttribute("job-priority-supported")
        @JvmField val jobRecipientNameDefault = DocumentFormatVaryingAttribute("job-recipient-name-default")
        @JvmField val jobRecipientNameSupported = DocumentFormatVaryingAttribute("job-recipient-name-supported")
        @JvmField val jobResolversSupported = DocumentFormatVaryingAttribute("job-resolvers-supported")
        @JvmField val jobSheetMessageDefault = DocumentFormatVaryingAttribute("job-sheet-message-default")
        @JvmField val jobSheetMessageSupported = DocumentFormatVaryingAttribute("job-sheet-message-supported")
        @JvmField val jobSheetsColDefault = DocumentFormatVaryingAttribute("job-sheets-col-default")
        @JvmField val jobSheetsColSupported = DocumentFormatVaryingAttribute("job-sheets-col-supported")
        @JvmField val jobSheetsDefault = DocumentFormatVaryingAttribute("job-sheets-default")
        @JvmField val jobSheetsSupported = DocumentFormatVaryingAttribute("job-sheets-supported")
        @JvmField val jobSpoolingSupported = DocumentFormatVaryingAttribute("job-spooling-supported")
        @JvmField val jobTriggersSupported = DocumentFormatVaryingAttribute("job-triggers-supported")
        @JvmField val jpegFeaturesSupported = DocumentFormatVaryingAttribute("jpeg-features-supported")
        @JvmField val jpegKOctetsSupported = DocumentFormatVaryingAttribute("jpeg-k-octets-supported")
        @JvmField val jpegXDimensionSupported = DocumentFormatVaryingAttribute("jpeg-x-dimension-supported")
        @JvmField val jpegYDimensionSupported = DocumentFormatVaryingAttribute("jpeg-y-dimension-supported")
        @JvmField val laminatingSidesSupported = DocumentFormatVaryingAttribute("laminating-sides-supported")
        @JvmField val laminatingTypeSupported = DocumentFormatVaryingAttribute("laminating-type-supported")
        @JvmField val logoUriFormatsSupported = DocumentFormatVaryingAttribute("logo-uri-formats-supported")
        @JvmField val logoUriSchemesSupported = DocumentFormatVaryingAttribute("logo-uri-schemes-supported")
        @JvmField val materialAmountUnitsSupported = DocumentFormatVaryingAttribute("material-amount-units-supported")
        @JvmField val materialDiameterSupported = DocumentFormatVaryingAttribute("material-diameter-supported")
        @JvmField val materialPurposeSupported = DocumentFormatVaryingAttribute("material-purpose-supported")
        @JvmField val materialRateSupported = DocumentFormatVaryingAttribute("material-rate-supported")
        @JvmField val materialRateUnitsSupported = DocumentFormatVaryingAttribute("material-rate-units-supported")
        @JvmField val materialShellThicknessSupported = DocumentFormatVaryingAttribute("material-shell-thickness-supported")
        @JvmField val materialTemperatureSupported = DocumentFormatVaryingAttribute("material-temperature-supported")
        @JvmField val materialTypeSupported = DocumentFormatVaryingAttribute("material-type-supported")
        @JvmField val materialsColDatabase = DocumentFormatVaryingAttribute("materials-col-database")
        @JvmField val materialsColDefault = DocumentFormatVaryingAttribute("materials-col-default")
        @JvmField val materialsColReady = DocumentFormatVaryingAttribute("materials-col-ready")
        @JvmField val materialsColSupported = DocumentFormatVaryingAttribute("materials-col-supported")
        @JvmField val maxMaterialsColSupported = DocumentFormatVaryingAttribute("max-materials-col-supported")
        @JvmField val maxSaveInfoSupported = DocumentFormatVaryingAttribute("max-save-info-supported")
        @JvmField val maxStitchingLocationsSupported = DocumentFormatVaryingAttribute("max-stitching-locations-supported")
        @JvmField val mediaBackCoatingSupported = DocumentFormatVaryingAttribute("media-back-coating-supported")
        @JvmField val mediaBottomMarginSupported = DocumentFormatVaryingAttribute("media-bottom-margin-supported")
        @JvmField val mediaColDatabase = DocumentFormatVaryingAttribute("media-col-database")
        @JvmField val mediaColDefault = DocumentFormatVaryingAttribute("media-col-default")
        @JvmField val mediaColReady = DocumentFormatVaryingAttribute("media-col-ready")
        @JvmField val mediaColSupported = DocumentFormatVaryingAttribute("media-col-supported")
        @JvmField val mediaColorSupported = DocumentFormatVaryingAttribute("media-color-supported")
        @JvmField val mediaDefault = DocumentFormatVaryingAttribute("media-default")
        @JvmField val mediaFrontCoatingSupported = DocumentFormatVaryingAttribute("media-front-coating-supported")
        @JvmField val mediaGrainSupported = DocumentFormatVaryingAttribute("media-grain-supported")
        @JvmField val mediaHoleCountSupported = DocumentFormatVaryingAttribute("media-hole-count-supported")
        @JvmField val mediaInfoSupported = DocumentFormatVaryingAttribute("media-info-supported")
        @JvmField val mediaKeySupported = DocumentFormatVaryingAttribute("media-key-supported")
        @JvmField val mediaLeftMarginSupported = DocumentFormatVaryingAttribute("media-left-margin-supported")
        @JvmField val mediaOrderCountSupported = DocumentFormatVaryingAttribute("media-order-count-supported")
        @JvmField val mediaPrePrintedSupported = DocumentFormatVaryingAttribute("media-pre-printed-supported")
        @JvmField val mediaReady = DocumentFormatVaryingAttribute("media-ready")
        @JvmField val mediaRecycledSupported = DocumentFormatVaryingAttribute("media-recycled-supported")
        @JvmField val mediaRightMarginSupported = DocumentFormatVaryingAttribute("media-right-margin-supported")
        @JvmField val mediaSizeSupported = DocumentFormatVaryingAttribute("media-size-supported")
        @JvmField val mediaSourceSupported = DocumentFormatVaryingAttribute("media-source-supported")
        @JvmField val mediaSupported = DocumentFormatVaryingAttribute("media-supported")
        @JvmField val mediaThicknessSupported = DocumentFormatVaryingAttribute("media-thickness-supported")
        @JvmField val mediaToothSupported = DocumentFormatVaryingAttribute("media-tooth-supported")
        @JvmField val mediaTopMarginSupported = DocumentFormatVaryingAttribute("media-top-margin-supported")
        @JvmField val mediaTypeSupported = DocumentFormatVaryingAttribute("media-type-supported")
        @JvmField val mediaWeightMetricSupported = DocumentFormatVaryingAttribute("media-weight-metric-supported")
        @JvmField val messageSupported = DocumentFormatVaryingAttribute("message-supported")
        @JvmField val multipleDestinationUrisSupported = DocumentFormatVaryingAttribute("multiple-destination-uris-supported")
        @JvmField val multipleDocumentHandlingDefault = DocumentFormatVaryingAttribute("multiple-document-handling-default")
        @JvmField val multipleDocumentHandlingSupported = DocumentFormatVaryingAttribute("multiple-document-handling-supported")
        @JvmField val multipleDocumentJobsSupported = DocumentFormatVaryingAttribute("multiple-document-jobs-supported")
        @JvmField val multipleObjectHandlingDefault = DocumentFormatVaryingAttribute("multiple-object-handling-default")
        @JvmField val multipleObjectHandlingSupported = DocumentFormatVaryingAttribute("multiple-object-handling-supported")
        @JvmField val multipleOperationTimeOut = DocumentFormatVaryingAttribute("multiple-operation-time-out")
        @JvmField val multipleOperationTimeOutAction = DocumentFormatVaryingAttribute("multiple-operation-time-out-action")
        @JvmField val naturalLanguageConfigured = DocumentFormatVaryingAttribute("natural-language-configured")
        @JvmField val notifyAttributesSupported = DocumentFormatVaryingAttribute("notify-attributes-supported")
        @JvmField val notifyEventsDefault = DocumentFormatVaryingAttribute("notify-events-default")
        @JvmField val notifyEventsSupported = DocumentFormatVaryingAttribute("notify-events-supported")
        @JvmField val notifyLeaseDurationDefault = DocumentFormatVaryingAttribute("notify-lease-duration-default")
        @JvmField val notifyLeaseDurationSupported = DocumentFormatVaryingAttribute("notify-lease-duration-supported")
        @JvmField val notifyPullMethodSupported = DocumentFormatVaryingAttribute("notify-pull-method-supported")
        @JvmField val notifySchemesSupported = DocumentFormatVaryingAttribute("notify-schemes-supported")
        @JvmField val numberOfRetriesDefault = DocumentFormatVaryingAttribute("number-of-retries-default")
        @JvmField val numberOfRetriesSupported = DocumentFormatVaryingAttribute("number-of-retries-supported")
        @JvmField val numberUpDefault = DocumentFormatVaryingAttribute("number-up-default")
        @JvmField val numberUpSupported = DocumentFormatVaryingAttribute("number-up-supported")
        @JvmField val oauthAuthorizationServerUri = DocumentFormatVaryingAttribute("oauth-authorization-server-uri")
        @JvmField val operationsSupported = DocumentFormatVaryingAttribute("operations-supported")
        @JvmField val organizationNameSupported = DocumentFormatVaryingAttribute("organization-name-supported")
        @JvmField val orientationRequestedDefault = DocumentFormatVaryingAttribute("orientation-requested-default")
        @JvmField val orientationRequestedSupported = DocumentFormatVaryingAttribute("orientation-requested-supported")
        @JvmField val outputAttributesDefault = DocumentFormatVaryingAttribute("output-attributes-default")
        @JvmField val outputAttributesSupported = DocumentFormatVaryingAttribute("output-attributes-supported")
        @JvmField val outputBinDefault = DocumentFormatVaryingAttribute("output-bin-default")
        @JvmField val outputBinSupported = DocumentFormatVaryingAttribute("output-bin-supported")
        @JvmField val outputDeviceSupported = DocumentFormatVaryingAttribute("output-device-supported")
        @JvmField val outputDeviceUuidSupported = DocumentFormatVaryingAttribute("output-device-uuid-supported")
        @JvmField val overridesSupported = DocumentFormatVaryingAttribute("overrides-supported")
        @JvmField val pageDeliveryDefault = DocumentFormatVaryingAttribute("page-delivery-default")
        @JvmField val pageDeliverySupported = DocumentFormatVaryingAttribute("page-delivery-supported")
        @JvmField val pageOrderReceivedDefault = DocumentFormatVaryingAttribute("page-order-received-default")
        @JvmField val pageOrderReceivedSupported = DocumentFormatVaryingAttribute("page-order-received-supported")
        @JvmField val pageRangesSupported = DocumentFormatVaryingAttribute("page-ranges-supported")
        @JvmField val pagesPerSubsetSupported = DocumentFormatVaryingAttribute("pages-per-subset-supported")
        @JvmField val parentPrintersSupported = DocumentFormatVaryingAttribute("parent-printers-supported")
        @JvmField val pdfFeaturesSupported = DocumentFormatVaryingAttribute("pdf-features-supported")
        @JvmField val pdfKOctetsSupported = DocumentFormatVaryingAttribute("pdf-k-octets-supported")
        @JvmField val pdfVersionsSupported = DocumentFormatVaryingAttribute("pdf-versions-supported")
        @JvmField val pdlInitFileDefault = DocumentFormatVaryingAttribute("pdl-init-file-default")
        @JvmField val pdlInitFileEntrySupported = DocumentFormatVaryingAttribute("pdl-init-file-entry-supported")
        @JvmField val pdlInitFileLocationSupported = DocumentFormatVaryingAttribute("pdl-init-file-location-supported")
        @JvmField val pdlInitFileNameSubdirectorySupported = DocumentFormatVaryingAttribute("pdl-init-file-name-subdirectory-supported")
        @JvmField val pdlInitFileNameSupported = DocumentFormatVaryingAttribute("pdl-init-file-name-supported")
        @JvmField val pdlInitFileSupported = DocumentFormatVaryingAttribute("pdl-init-file-supported")
        @JvmField val pdlOverrideGuaranteedSupported = DocumentFormatVaryingAttribute("pdl-override-guaranteed-supported")
        @JvmField val pdlOverrideSupported = DocumentFormatVaryingAttribute("pdl-override-supported")
        @JvmField val platformShape = DocumentFormatVaryingAttribute("platform-shape")
        @JvmField val platformTemperatureDefault = DocumentFormatVaryingAttribute("platform-temperature-default")
        @JvmField val platformTemperatureSupported = DocumentFormatVaryingAttribute("platform-temperature-supported")
        @JvmField val preferredAttributesSupported = DocumentFormatVaryingAttribute("preferred-attributes-supported")
        @JvmField val presentationDirectionNumberUpDefault = DocumentFormatVaryingAttribute("presentation-direction-number-up-default")
        @JvmField val presentationDirectionNumberUpSupported = DocumentFormatVaryingAttribute("presentation-direction-number-up-supported")
        @JvmField val printAccuracySupported = DocumentFormatVaryingAttribute("print-accuracy-supported")
        @JvmField val printBaseDefault = DocumentFormatVaryingAttribute("print-base-default")
        @JvmField val printBaseSupported = DocumentFormatVaryingAttribute("print-base-supported")
        @JvmField val printColorModeDefault = DocumentFormatVaryingAttribute("print-color-mode-default")
        @JvmField val printColorModeSupported = DocumentFormatVaryingAttribute("print-color-mode-supported")
        @JvmField val printContentOptimizeDefault = DocumentFormatVaryingAttribute("print-content-optimize-default")
        @JvmField val printContentOptimizeSupported = DocumentFormatVaryingAttribute("print-content-optimize-supported")
        @JvmField val printObjectsSupported = DocumentFormatVaryingAttribute("print-objects-supported")
        @JvmField val printQualityDefault = DocumentFormatVaryingAttribute("print-quality-default")
        @JvmField val printQualitySupported = DocumentFormatVaryingAttribute("print-quality-supported")
        @JvmField val printRenderingIntentDefault = DocumentFormatVaryingAttribute("print-rendering-intent-default")
        @JvmField val printRenderingIntentSupported = DocumentFormatVaryingAttribute("print-rendering-intent-supported")
        @JvmField val printScalingDefault = DocumentFormatVaryingAttribute("print-scaling-default")
        @JvmField val printScalingSupported = DocumentFormatVaryingAttribute("print-scaling-supported")
        @JvmField val printSupportsDefault = DocumentFormatVaryingAttribute("print-supports-default")
        @JvmField val printSupportsSupported = DocumentFormatVaryingAttribute("print-supports-supported")
        @JvmField val printerCameraImageUri = DocumentFormatVaryingAttribute("printer-camera-image-uri")
        @JvmField val printerChargeInfo = DocumentFormatVaryingAttribute("printer-charge-info")
        @JvmField val printerChargeInfoUri = DocumentFormatVaryingAttribute("printer-charge-info-uri")
        @JvmField val printerCurrentTime = DocumentFormatVaryingAttribute("printer-current-time")
        @JvmField val printerDeviceId = DocumentFormatVaryingAttribute("printer-device-id")
        @JvmField val printerDnsSdName = DocumentFormatVaryingAttribute("printer-dns-sd-name")
        @JvmField val printerDriverInstaller = DocumentFormatVaryingAttribute("printer-driver-installer")
        @JvmField val printerFaxLogUri = DocumentFormatVaryingAttribute("printer-fax-log-uri")
        @JvmField val printerFaxModemInfo = DocumentFormatVaryingAttribute("printer-fax-modem-info")
        @JvmField val printerFaxModemName = DocumentFormatVaryingAttribute("printer-fax-modem-name")
        @JvmField val printerFaxModemNumber = DocumentFormatVaryingAttribute("printer-fax-modem-number")
        @JvmField val printerGeoLocation = DocumentFormatVaryingAttribute("printer-geo-location")
        @JvmField val printerGetAttributesSupported = DocumentFormatVaryingAttribute("printer-get-attributes-supported")
        @JvmField val printerIccProfiles = DocumentFormatVaryingAttribute("printer-icc-profiles")
        @JvmField val printerIcons = DocumentFormatVaryingAttribute("printer-icons")
        @JvmField val printerInfo = DocumentFormatVaryingAttribute("printer-info")
        @JvmField val printerKind = DocumentFormatVaryingAttribute("printer-kind")
        @JvmField val printerLocation = DocumentFormatVaryingAttribute("printer-location")
        @JvmField val printerMakeAndModel = DocumentFormatVaryingAttribute("printer-make-and-model")
        @JvmField val printerMandatoryJobAttributes = DocumentFormatVaryingAttribute("printer-mandatory-job-attributes")
        @JvmField val printerMoreInfoManufacturer = DocumentFormatVaryingAttribute("printer-more-info-manufacturer")
        @JvmField val printerName = DocumentFormatVaryingAttribute("printer-name")
        @JvmField val printerOrganization = DocumentFormatVaryingAttribute("printer-organization")
        @JvmField val printerOrganizationalUnit = DocumentFormatVaryingAttribute("printer-organizational-unit")
        @JvmField val printerResolutionDefault = DocumentFormatVaryingAttribute("printer-resolution-default")
        @JvmField val printerResolutionSupported = DocumentFormatVaryingAttribute("printer-resolution-supported")
        @JvmField val printerStaticResourceDirectoryUri = DocumentFormatVaryingAttribute("printer-static-resource-directory-uri")
        @JvmField val printerStaticResourceKOctetsSupported = DocumentFormatVaryingAttribute("printer-static-resource-k-octets-supported")
        @JvmField val printerStringsLanguagesSupported = DocumentFormatVaryingAttribute("printer-strings-languages-supported")
        @JvmField val printerStringsUri = DocumentFormatVaryingAttribute("printer-strings-uri")
        @JvmField val printerVolumeSupported = DocumentFormatVaryingAttribute("printer-volume-supported")
        @JvmField val printerXriSupported = DocumentFormatVaryingAttribute("printer-xri-supported")
        @JvmField val proofPrintDefault = DocumentFormatVaryingAttribute("proof-print-default")
        @JvmField val proofPrintSupported = DocumentFormatVaryingAttribute("proof-print-supported")
        @JvmField val punchingHoleDiameterConfigured = DocumentFormatVaryingAttribute("punching-hole-diameter-configured")
        @JvmField val punchingLocationsSupported = DocumentFormatVaryingAttribute("punching-locations-supported")
        @JvmField val punchingOffsetSupported = DocumentFormatVaryingAttribute("punching-offset-supported")
        @JvmField val punchingReferenceEdgeSupported = DocumentFormatVaryingAttribute("punching-reference-edge-supported")
        @JvmField val pwgRasterDocumentResolutionSupported = DocumentFormatVaryingAttribute("pwg-raster-document-resolution-supported")
        @JvmField val pwgRasterDocumentSheetBack = DocumentFormatVaryingAttribute("pwg-raster-document-sheet-back")
        @JvmField val pwgRasterDocumentTypeSupported = DocumentFormatVaryingAttribute("pwg-raster-document-type-supported")
        @JvmField val referenceUriSchemesSupported = DocumentFormatVaryingAttribute("reference-uri-schemes-supported")
        @JvmField val repertoireSupported = DocumentFormatVaryingAttribute("repertoire-supported")
        @JvmField val requestingUserUriSupported = DocumentFormatVaryingAttribute("requesting-user-uri-supported")
        @JvmField val retryIntervalDefault = DocumentFormatVaryingAttribute("retry-interval-default")
        @JvmField val retryIntervalSupported = DocumentFormatVaryingAttribute("retry-interval-supported")
        @JvmField val retryTimeOutDefault = DocumentFormatVaryingAttribute("retry-time-out-default")
        @JvmField val retryTimeOutSupported = DocumentFormatVaryingAttribute("retry-time-out-supported")
        @JvmField val saveDispositionSupported = DocumentFormatVaryingAttribute("save-disposition-supported")
        @JvmField val saveDocumentFormatDefault = DocumentFormatVaryingAttribute("save-document-format-default")
        @JvmField val saveDocumentFormatSupported = DocumentFormatVaryingAttribute("save-document-format-supported")
        @JvmField val saveLocationDefault = DocumentFormatVaryingAttribute("save-location-default")
        @JvmField val saveLocationSupported = DocumentFormatVaryingAttribute("save-location-supported")
        @JvmField val saveNameSubdirectorySupported = DocumentFormatVaryingAttribute("save-name-subdirectory-supported")
        @JvmField val saveNameSupported = DocumentFormatVaryingAttribute("save-name-supported")
        @JvmField val separatorSheetsDefault = DocumentFormatVaryingAttribute("separator-sheets-default")
        @JvmField val separatorSheetsSupported = DocumentFormatVaryingAttribute("separator-sheets-supported")
        @JvmField val sheetCollateDefault = DocumentFormatVaryingAttribute("sheet-collate-default")
        @JvmField val sheetCollateSupported = DocumentFormatVaryingAttribute("sheet-collate-supported")
        @JvmField val sidesDefault = DocumentFormatVaryingAttribute("sides-default")
        @JvmField val sidesSupported = DocumentFormatVaryingAttribute("sides-supported")
        @JvmField val stitchingAngleSupported = DocumentFormatVaryingAttribute("stitching-angle-supported")
        @JvmField val stitchingLocationsSupported = DocumentFormatVaryingAttribute("stitching-locations-supported")
        @JvmField val stitchingMethodSupported = DocumentFormatVaryingAttribute("stitching-method-supported")
        @JvmField val stitchingOffsetSupported = DocumentFormatVaryingAttribute("stitching-offset-supported")
        @JvmField val stitchingReferenceEdgeSupported = DocumentFormatVaryingAttribute("stitching-reference-edge-supported")
        @JvmField val subjectSupported = DocumentFormatVaryingAttribute("subject-supported")
        @JvmField val subordinatePrintersSupported = DocumentFormatVaryingAttribute("subordinate-printers-supported")
        @JvmField val toNameSupported = DocumentFormatVaryingAttribute("to-name-supported")
        @JvmField val trimmingOffsetSupported = DocumentFormatVaryingAttribute("trimming-offset-supported")
        @JvmField val trimmingReferenceEdgeSupported = DocumentFormatVaryingAttribute("trimming-reference-edge-supported")
        @JvmField val trimmingTypeSupported = DocumentFormatVaryingAttribute("trimming-type-supported")
        @JvmField val trimmingWhenSupported = DocumentFormatVaryingAttribute("trimming-when-supported")
        @JvmField val uriAuthenticationSupported = DocumentFormatVaryingAttribute("uri-authentication-supported")
        @JvmField val uriSecuritySupported = DocumentFormatVaryingAttribute("uri-security-supported")
        @JvmField val userDefinedValuesSupported = DocumentFormatVaryingAttribute("user-defined-values-supported")
        @JvmField val whichJobsSupported = DocumentFormatVaryingAttribute("which-jobs-supported")
        @JvmField val xImagePositionDefault = DocumentFormatVaryingAttribute("x-image-position-default")
        @JvmField val xImagePositionSupported = DocumentFormatVaryingAttribute("x-image-position-supported")
        @JvmField val xImageShiftDefault = DocumentFormatVaryingAttribute("x-image-shift-default")
        @JvmField val xImageShiftSupported = DocumentFormatVaryingAttribute("x-image-shift-supported")
        @JvmField val xSide1ImageShiftDefault = DocumentFormatVaryingAttribute("x-side1-image-shift-default")
        @JvmField val xSide1ImageShiftSupported = DocumentFormatVaryingAttribute("x-side1-image-shift-supported")
        @JvmField val xSide2ImageShiftDefault = DocumentFormatVaryingAttribute("x-side2-image-shift-default")
        @JvmField val xSide2ImageShiftSupported = DocumentFormatVaryingAttribute("x-side2-image-shift-supported")
        @JvmField val yImagePositionDefault = DocumentFormatVaryingAttribute("y-image-position-default")
        @JvmField val yImagePositionSupported = DocumentFormatVaryingAttribute("y-image-position-supported")
        @JvmField val yImageShiftDefault = DocumentFormatVaryingAttribute("y-image-shift-default")
        @JvmField val yImageShiftSupported = DocumentFormatVaryingAttribute("y-image-shift-supported")
        @JvmField val ySide1ImageShiftDefault = DocumentFormatVaryingAttribute("y-side1-image-shift-default")
        @JvmField val ySide1ImageShiftSupported = DocumentFormatVaryingAttribute("y-side1-image-shift-supported")
        @JvmField val ySide2ImageShiftDefault = DocumentFormatVaryingAttribute("y-side2-image-shift-default")
        @JvmField val ySide2ImageShiftSupported = DocumentFormatVaryingAttribute("y-side2-image-shift-supported")
        @JvmField val Encoder = KeywordType.encoderOf(DocumentFormatVaryingAttribute::class.java) { value, _, _ ->
            DocumentFormatVaryingAttribute(value)
        }
    }
}
