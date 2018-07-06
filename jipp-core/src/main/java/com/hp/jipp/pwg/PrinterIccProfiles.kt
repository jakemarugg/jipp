// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-icc-profiles" collection as defined in:
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterIccProfiles
@JvmOverloads constructor(
    val profileName: String? = null,
    val profileUrl: java.net.URI? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            profileName?.also {
                add(Members.profileName.of(it))
            }
            profileUrl?.also {
                add(Members.profileUrl.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<PrinterIccProfiles>(Members, name)

    companion object Members : CollectionParser<PrinterIccProfiles> {
        override val typeName = PrinterIccProfiles::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): PrinterIccProfiles {
            val remain = attributes.toMutableList()
            return PrinterIccProfiles(
                extractOne(remain, profileName)?.value,
                extractOne(remain, profileUrl),
                _extras = remain)
        }
        /** "profile-name" member type */
        @JvmField val profileName = NameType("profile-name")
        /** "profile-url" member type */
        @JvmField val profileUrl = UriType("profile-url")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [PrinterIccProfiles] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "profile-name" member type */
            @JvmField val profileName = Keywords(Members.profileName.name)
            /** "profile-url" member type */
            @JvmField val profileUrl = Keywords(Members.profileUrl.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}