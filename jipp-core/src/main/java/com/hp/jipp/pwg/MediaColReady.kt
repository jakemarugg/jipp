// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-col-ready" collection as defined in:
 * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf),
 * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class MediaColReady
@JvmOverloads constructor(
    val mediaSourceProperties: MediaSourceProperties? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            mediaSourceProperties?.also {
                add(Members.mediaSourceProperties.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<MediaColReady>(Members, name)

    companion object Members : CollectionParser<MediaColReady> {
        override val typeName = MediaColReady::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): MediaColReady {
            val remain = attributes.toMutableList()
            return MediaColReady(
                extractOne(remain, mediaSourceProperties),
                _extras = remain)
        }
        /** "media-source-properties" member type */
        @JvmField val mediaSourceProperties = MediaSourceProperties.Type("media-source-properties")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [MediaColReady] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "media-source-properties" member type */
            @JvmField val mediaSourceProperties = Keywords(Members.mediaSourceProperties.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }

    /**
     * Data object corresponding to a "media-source-properties" collection.
     */
    @Suppress("RedundantCompanionReference", "unused")
    data class MediaSourceProperties
    @JvmOverloads constructor(
        val mediaSourceFeedDirection: FeedOrientation? = null,
        val mediaSourceFeedOrientation: Orientation? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {
    
        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                mediaSourceFeedDirection?.also {
                    add(Members.mediaSourceFeedDirection.of(it))
                }
                mediaSourceFeedOrientation?.also {
                    add(Members.mediaSourceFeedOrientation.of(it))
                }
            } + _extras)
        }
    
        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<MediaSourceProperties>(Members, name)
    
        companion object Members : CollectionParser<MediaSourceProperties> {
            override val typeName = MediaSourceProperties::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): MediaSourceProperties {
                val remain = attributes.toMutableList()
                return MediaSourceProperties(
                    extractOne(remain, mediaSourceFeedDirection),
                    extractOne(remain, mediaSourceFeedOrientation),
                    _extras = remain)
            }
            /** "media-source-feed-direction" member type */
            @JvmField val mediaSourceFeedDirection = FeedOrientation.Type("media-source-feed-direction")
            /** "media-source-feed-orientation" member type */
            @JvmField val mediaSourceFeedOrientation = Orientation.Type("media-source-feed-orientation")
        }
    
        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [MediaSourceProperties] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)
    
            companion object {
                /** "media-source-feed-direction" member type */
                @JvmField val mediaSourceFeedDirection = Keywords(Members.mediaSourceFeedDirection.name)
                /** "media-source-feed-orientation" member type */
                @JvmField val mediaSourceFeedOrientation = Keywords(Members.mediaSourceFeedOrientation.name)
    
                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }
}