// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "cover-sheet-info" collection as defined in:
 * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class CoverSheetInfo
@JvmOverloads constructor(
    val fromName: String? = null,
    val logo: java.net.URI? = null,
    val message: String? = null,
    val organizationName: String? = null,
    val subject: String? = null,
    val toName: String? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            fromName?.also {
                add(Members.fromName.of(it))
            }
            logo?.also {
                add(Members.logo.of(it))
            }
            message?.also {
                add(Members.message.of(it))
            }
            organizationName?.also {
                add(Members.organizationName.of(it))
            }
            subject?.also {
                add(Members.subject.of(it))
            }
            toName?.also {
                add(Members.toName.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<CoverSheetInfo>(Members, name)

    companion object Members : CollectionParser<CoverSheetInfo> {
        override val typeName = CoverSheetInfo::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): CoverSheetInfo {
            val remain = attributes.toMutableList()
            return CoverSheetInfo(
                extractOne(remain, fromName)?.value,
                extractOne(remain, logo),
                extractOne(remain, message)?.value,
                extractOne(remain, organizationName)?.value,
                extractOne(remain, subject)?.value,
                extractOne(remain, toName)?.value,
                _extras = remain)
        }
        /** "from-name" member type */
        @JvmField val fromName = TextType("from-name")
        /** "logo" member type */
        @JvmField val logo = UriType("logo")
        /** "message" member type */
        @JvmField val message = TextType("message")
        /** "organization-name" member type */
        @JvmField val organizationName = TextType("organization-name")
        /** "subject" member type */
        @JvmField val subject = TextType("subject")
        /** "to-name" member type */
        @JvmField val toName = TextType("to-name")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [CoverSheetInfo] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "from-name" member type */
            @JvmField val fromName = Keywords(Members.fromName.name)
            /** "logo" member type */
            @JvmField val logo = Keywords(Members.logo.name)
            /** "message" member type */
            @JvmField val message = Keywords(Members.message.name)
            /** "organization-name" member type */
            @JvmField val organizationName = Keywords(Members.organizationName.name)
            /** "subject" member type */
            @JvmField val subject = Keywords(Members.subject.name)
            /** "to-name" member type */
            @JvmField val toName = Keywords(Members.toName.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}
