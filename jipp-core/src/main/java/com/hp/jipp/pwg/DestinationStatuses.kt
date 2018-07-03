// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-statuses" collection as defined in:
 *   * [PWG5100.15](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf)
 */
data class DestinationStatuses
@JvmOverloads constructor(
    val destinationUri: java.net.URI? = null,
    val imagesCompleted: Int? = null,
    val transmissionStatus: TransmissionStatus? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            destinationUri?.also {
                add(Members.destinationUri.of(it))
            }
            imagesCompleted?.also {
                add(Members.imagesCompleted.of(it))
            }
            transmissionStatus?.also {
                add(Members.transmissionStatus.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<DestinationStatuses>(Members, name)

    companion object Members : CollectionParser<DestinationStatuses> {
        override val typeName = DestinationStatuses::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): DestinationStatuses {
            val remain = attributes.toMutableList()
            return DestinationStatuses(
                extractOne(remain, destinationUri),
                extractOne(remain, imagesCompleted),
                extractOne(remain, transmissionStatus),
                _extras = remain)
        }
        /** "destination-uri" member type */
        @JvmField val destinationUri = UriType("destination-uri")
        /** "images-completed" member type */
        @JvmField val imagesCompleted = IntegerType("images-completed")
        /** "transmission-status" member type */
        @JvmField val transmissionStatus = TransmissionStatus.Type("transmission-status")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [DestinationStatuses] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "destination-uri" member type */
            @JvmField val destinationUri = Keywords(Members.destinationUri.name)
            /** "images-completed" member type */
            @JvmField val imagesCompleted = Keywords(Members.imagesCompleted.name)
            /** "transmission-status" member type */
            @JvmField val transmissionStatus = Keywords(Members.transmissionStatus.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}