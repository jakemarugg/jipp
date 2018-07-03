// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "job-constraints-supported" collection as defined in:
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 */
data class JobConstraintsSupported
@JvmOverloads constructor(
    val resolverName: String? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            resolverName?.also {
                add(Members.resolverName.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<JobConstraintsSupported>(Members, name)

    companion object Members : CollectionParser<JobConstraintsSupported> {
        override val typeName = JobConstraintsSupported::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): JobConstraintsSupported {
            val remain = attributes.toMutableList()
            return JobConstraintsSupported(
                extractOne(remain, resolverName)?.value,
                _extras = remain)
        }
        /** "resolver-name" member type */
        @JvmField val resolverName = NameType("resolver-name")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [JobConstraintsSupported] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "resolver-name" member type */
            @JvmField val resolverName = Keywords(Members.resolverName.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}