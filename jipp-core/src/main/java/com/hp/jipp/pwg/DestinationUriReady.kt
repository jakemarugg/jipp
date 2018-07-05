// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-uri-ready" collection as defined in:
 * [PWG5100.17](http://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DestinationUriReady
@JvmOverloads constructor(
    val destinationAttributes: List<AttributeCollection>? = null,
    val destinationAttributesSupported: List<DestinationAttributesSupported>? = null,
    val destinationInfo: String? = null,
    val destinationIsDirectory: Boolean? = null,
    val destinationMandatoryAccessAttributes: List<DestinationAccesses.Keywords>? = null,
    val destinationName: String? = null,
    val destinationOauthScope: List<ByteArray>? = null,
    val destinationOauthToken: List<ByteArray>? = null,
    val destinationOauthUri: java.net.URI? = null,
    val destinationUri: java.net.URI? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            destinationAttributes?.also {
                add(Members.destinationAttributes.of(it))
            }
            destinationAttributesSupported?.also {
                add(Members.destinationAttributesSupported.of(it))
            }
            destinationInfo?.also {
                add(Members.destinationInfo.of(it))
            }
            destinationIsDirectory?.also {
                add(Members.destinationIsDirectory.of(it))
            }
            destinationMandatoryAccessAttributes?.also {
                add(Members.destinationMandatoryAccessAttributes.of(it))
            }
            destinationName?.also {
                add(Members.destinationName.of(it))
            }
            destinationOauthScope?.also {
                add(Members.destinationOauthScope.of(it))
            }
            destinationOauthToken?.also {
                add(Members.destinationOauthToken.of(it))
            }
            destinationOauthUri?.also {
                add(Members.destinationOauthUri.of(it))
            }
            destinationUri?.also {
                add(Members.destinationUri.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<DestinationUriReady>(Members, name)

    companion object Members : CollectionParser<DestinationUriReady> {
        override val typeName = DestinationUriReady::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): DestinationUriReady {
            val remain = attributes.toMutableList()
            return DestinationUriReady(
                extractAll(remain, destinationAttributes),
                extractAll(remain, destinationAttributesSupported),
                extractOne(remain, destinationInfo)?.value,
                extractOne(remain, destinationIsDirectory),
                extractAll(remain, destinationMandatoryAccessAttributes),
                extractOne(remain, destinationName)?.value,
                extractAll(remain, destinationOauthScope),
                extractAll(remain, destinationOauthToken),
                extractOne(remain, destinationOauthUri),
                extractOne(remain, destinationUri),
                _extras = remain)
        }
        /** "destination-attributes" member type */
        @JvmField val destinationAttributes = CollectionType("destination-attributes")
        /** "destination-attributes-supported" member type */
        @JvmField val destinationAttributesSupported = DestinationAttributesSupported.Type("destination-attributes-supported")
        /** "destination-info" member type */
        @JvmField val destinationInfo = TextType("destination-info")
        /** "destination-is-directory" member type */
        @JvmField val destinationIsDirectory = BooleanType("destination-is-directory")
        /** "destination-mandatory-access-attributes" member type */
        @JvmField val destinationMandatoryAccessAttributes = DestinationAccesses.Keywords.Type("destination-mandatory-access-attributes")
        /** "destination-name" member type */
        @JvmField val destinationName = NameType("destination-name")
        /** "destination-oauth-scope" member type */
        @JvmField val destinationOauthScope = OctetStringType("destination-oauth-scope")
        /** "destination-oauth-token" member type */
        @JvmField val destinationOauthToken = OctetStringType("destination-oauth-token")
        /** "destination-oauth-uri" member type */
        @JvmField val destinationOauthUri = UriType("destination-oauth-uri")
        /** "destination-uri" member type */
        @JvmField val destinationUri = UriType("destination-uri")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [DestinationUriReady] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "destination-attributes" member type */
            @JvmField val destinationAttributes = Keywords(Members.destinationAttributes.name)
            /** "destination-attributes-supported" member type */
            @JvmField val destinationAttributesSupported = Keywords(Members.destinationAttributesSupported.name)
            /** "destination-info" member type */
            @JvmField val destinationInfo = Keywords(Members.destinationInfo.name)
            /** "destination-is-directory" member type */
            @JvmField val destinationIsDirectory = Keywords(Members.destinationIsDirectory.name)
            /** "destination-mandatory-access-attributes" member type */
            @JvmField val destinationMandatoryAccessAttributes = Keywords(Members.destinationMandatoryAccessAttributes.name)
            /** "destination-name" member type */
            @JvmField val destinationName = Keywords(Members.destinationName.name)
            /** "destination-oauth-scope" member type */
            @JvmField val destinationOauthScope = Keywords(Members.destinationOauthScope.name)
            /** "destination-oauth-token" member type */
            @JvmField val destinationOauthToken = Keywords(Members.destinationOauthToken.name)
            /** "destination-oauth-uri" member type */
            @JvmField val destinationOauthUri = Keywords(Members.destinationOauthUri.name)
            /** "destination-uri" member type */
            @JvmField val destinationUri = Keywords(Members.destinationUri.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}
