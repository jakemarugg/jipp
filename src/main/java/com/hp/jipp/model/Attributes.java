package com.hp.jipp.model;

import com.google.common.collect.ImmutableList;
import com.hp.jipp.encoding.AttributeType;
import com.hp.jipp.encoding.EnumType;
import com.hp.jipp.encoding.ResolutionType;
import com.hp.jipp.encoding.StringType;
import com.hp.jipp.encoding.Tag;
import com.hp.jipp.encoding.UriType;

import java.util.List;

/** A library of attribute types as defined by RFC2911 */
public final class Attributes {

    // RFC2911 3.1.4.1 Request Operation Attributes
    // RFC2911 3.1.4.2 Response Operation Attributes

    public static final StringType AttributesCharset =
            new StringType(Tag.Charset, "attributes-charset");

    public static final StringType AttributesNaturalLanguage =
            new StringType(Tag.NaturalLanguage, "attributes-natural-language");

    // RFC2911 3.1.6 Operation Response Status Codes and Status Messages
    public static final StringType StatusMessage =
            new StringType(Tag.TextWithoutLanguage, "status-message");

    public static final StringType DetailedStatusMessage =
            new StringType(Tag.TextWithoutLanguage, "detailed-status-message");

    public static final StringType DocumentAccessError =
            new StringType(Tag.TextWithoutLanguage, "document-access-error");

    // Get-Printer-Attributes request fields

    public static final StringType RequestingUserName =
            new StringType(Tag.TextWithoutLanguage, "requesting-user-name");

    public static final UriType PrinterUri =
            new UriType(Tag.Uri, "printer-uri");

    public static final EnumType<Operation> OperationsSupported =
            Operation.createType("operations-supported");

    public static final StringType RequestedAttributes =
            new StringType(Tag.Keyword, "requested-attributes");


    // Get-Printer-Attributes response fields

    public static final StringType PrinterInfo =
            new StringType(Tag.TextWithoutLanguage, "printer-info");

    public static final EnumType<PrinterState> PrinterState =
            EnumType.type(com.hp.jipp.model.PrinterState.ENCODER, "printer-state");

    // 3.2.1.1 Print-Job Request

    public static StringType DocumentFormat =
            new StringType(Tag.MimeMediaType, "document-format");

    // 3.2.1.1 Print-Job Response
    public static EnumType<JobState> JobState =
            EnumType.type(com.hp.jipp.model.JobState.ENCODER, "job-state");

    // Others

    public static final StringType JobName =
            new StringType(Tag.TextWithoutLanguage, "job-name");

    public static final StringType DocumentName =
            new StringType(Tag.TextWithoutLanguage, "document-name");

    public static final ResolutionType PrinterResolutionDefault =
            new ResolutionType(Tag.Resolution, "printer-resolution-default");

    /** All attributes, useful when printing contents */
    public static final List<AttributeType<?>> All = ImmutableList.of(
            AttributesCharset,
            AttributesNaturalLanguage,
            DetailedStatusMessage,
            DocumentAccessError,
            DocumentName,
            JobName,
            OperationsSupported,
            PrinterInfo,
            PrinterState,
            PrinterUri,
            RequestedAttributes,
            RequestingUserName,
            StatusMessage,
            DocumentFormat,
            JobState,
            PrinterResolutionDefault
    );
}