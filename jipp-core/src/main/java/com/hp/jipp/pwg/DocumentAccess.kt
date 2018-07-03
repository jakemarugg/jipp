// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "document-access" collection as defined in:
 *   * [PWG5100.18](http://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf)
 */
data class DocumentAccess
@JvmOverloads constructor(
    val accessOauthToken: List<ByteArray>? = null,
    val accessOauthUri: java.net.URI? = null,
    val accessPassword: String? = null,
    val accessPin: String? = null,
    val accessUserName: String? = null,
    val accessX509Certificate: List<ByteArray>? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            accessOauthToken?.also {
                add(Members.accessOauthToken.of(it))
            }
            accessOauthUri?.also {
                add(Members.accessOauthUri.of(it))
            }
            accessPassword?.also {
                add(Members.accessPassword.of(it))
            }
            accessPin?.also {
                add(Members.accessPin.of(it))
            }
            accessUserName?.also {
                add(Members.accessUserName.of(it))
            }
            accessX509Certificate?.also {
                add(Members.accessX509Certificate.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<DocumentAccess>(Members, name)

    companion object Members : CollectionParser<DocumentAccess> {
        override val typeName = DocumentAccess::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): DocumentAccess {
            val remain = attributes.toMutableList()
            return DocumentAccess(
                extractAll(remain, accessOauthToken),
                extractOne(remain, accessOauthUri),
                extractOne(remain, accessPassword)?.value,
                extractOne(remain, accessPin)?.value,
                extractOne(remain, accessUserName)?.value,
                extractAll(remain, accessX509Certificate),
                _extras = remain)
        }
        /** "access-oauth-token" member type */
        @JvmField val accessOauthToken = OctetStringType("access-oauth-token")
        /** "access-oauth-uri" member type */
        @JvmField val accessOauthUri = UriType("access-oauth-uri")
        /** "access-password" member type */
        @JvmField val accessPassword = TextType("access-password")
        /** "access-pin" member type */
        @JvmField val accessPin = TextType("access-pin")
        /** "access-user-name" member type */
        @JvmField val accessUserName = TextType("access-user-name")
        /** "access-x509-certificate" member type */
        @JvmField val accessX509Certificate = OctetStringType("access-x509-certificate")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [DocumentAccess] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "access-oauth-token" member type */
            @JvmField val accessOauthToken = Keywords(Members.accessOauthToken.name)
            /** "access-oauth-uri" member type */
            @JvmField val accessOauthUri = Keywords(Members.accessOauthUri.name)
            /** "access-password" member type */
            @JvmField val accessPassword = Keywords(Members.accessPassword.name)
            /** "access-pin" member type */
            @JvmField val accessPin = Keywords(Members.accessPin.name)
            /** "access-user-name" member type */
            @JvmField val accessUserName = Keywords(Members.accessUserName.name)
            /** "access-x509-certificate" member type */
            @JvmField val accessX509Certificate = Keywords(Members.accessX509Certificate.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}