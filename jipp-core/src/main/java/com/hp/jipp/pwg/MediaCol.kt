// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "media-col" collection as defined in:
 *   * [PWG5100.11](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf)
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 */
data class MediaCol
@JvmOverloads constructor(
    val mediaBackCoating: MediaBackCoating? = null,
    val mediaBottomMargin: Int? = null,
    val mediaColor: MediaColor? = null,
    val mediaFrontCoating: MediaBackCoating? = null,
    val mediaGrain: MediaGrain? = null,
    val mediaHoleCount: Int? = null,
    val mediaInfo: String? = null,
    val mediaKey: Media? = null,
    val mediaLeftMargin: Int? = null,
    val mediaOrderCount: Int? = null,
    val mediaPrePrinted: MediaPrePrinted? = null,
    val mediaRecycled: MediaRecycled? = null,
    val mediaRightMargin: Int? = null,
    val mediaSize: MediaSize? = null,
    val mediaSizeName: Media? = null,
    val mediaSource: MediaSource? = null,
    val mediaThickness: Int? = null,
    val mediaTooth: MediaTooth? = null,
    val mediaTopMargin: Int? = null,
    val mediaType: MediaType? = null,
    val mediaWeightMetric: Int? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            mediaBackCoating?.also {
                add(Members.mediaBackCoating.of(it))
            }
            mediaBottomMargin?.also {
                add(Members.mediaBottomMargin.of(it))
            }
            mediaColor?.also {
                add(Members.mediaColor.of(it))
            }
            mediaFrontCoating?.also {
                add(Members.mediaFrontCoating.of(it))
            }
            mediaGrain?.also {
                add(Members.mediaGrain.of(it))
            }
            mediaHoleCount?.also {
                add(Members.mediaHoleCount.of(it))
            }
            mediaInfo?.also {
                add(Members.mediaInfo.of(it))
            }
            mediaKey?.also {
                add(Members.mediaKey.of(it))
            }
            mediaLeftMargin?.also {
                add(Members.mediaLeftMargin.of(it))
            }
            mediaOrderCount?.also {
                add(Members.mediaOrderCount.of(it))
            }
            mediaPrePrinted?.also {
                add(Members.mediaPrePrinted.of(it))
            }
            mediaRecycled?.also {
                add(Members.mediaRecycled.of(it))
            }
            mediaRightMargin?.also {
                add(Members.mediaRightMargin.of(it))
            }
            mediaSize?.also {
                add(Members.mediaSize.of(it))
            }
            mediaSizeName?.also {
                add(Members.mediaSizeName.of(it))
            }
            mediaSource?.also {
                add(Members.mediaSource.of(it))
            }
            mediaThickness?.also {
                add(Members.mediaThickness.of(it))
            }
            mediaTooth?.also {
                add(Members.mediaTooth.of(it))
            }
            mediaTopMargin?.also {
                add(Members.mediaTopMargin.of(it))
            }
            mediaType?.also {
                add(Members.mediaType.of(it))
            }
            mediaWeightMetric?.also {
                add(Members.mediaWeightMetric.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<MediaCol>(Members, name)

    companion object Members : CollectionParser<MediaCol> {
        override val typeName = MediaCol::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): MediaCol {
            val remain = attributes.toMutableList()
            return MediaCol(
                extractOne(remain, mediaBackCoating),
                extractOne(remain, mediaBottomMargin),
                extractOne(remain, mediaColor),
                extractOne(remain, mediaFrontCoating),
                extractOne(remain, mediaGrain),
                extractOne(remain, mediaHoleCount),
                extractOne(remain, mediaInfo)?.value,
                extractOne(remain, mediaKey),
                extractOne(remain, mediaLeftMargin),
                extractOne(remain, mediaOrderCount),
                extractOne(remain, mediaPrePrinted),
                extractOne(remain, mediaRecycled),
                extractOne(remain, mediaRightMargin),
                extractOne(remain, mediaSize),
                extractOne(remain, mediaSizeName),
                extractOne(remain, mediaSource),
                extractOne(remain, mediaThickness),
                extractOne(remain, mediaTooth),
                extractOne(remain, mediaTopMargin),
                extractOne(remain, mediaType),
                extractOne(remain, mediaWeightMetric),
                _extras = remain)
        }
        /** "media-back-coating" member type */
        @JvmField val mediaBackCoating = MediaBackCoating.Type("media-back-coating")
        /** "media-bottom-margin" member type */
        @JvmField val mediaBottomMargin = IntegerType("media-bottom-margin")
        /** "media-color" member type */
        @JvmField val mediaColor = MediaColor.Type("media-color")
        /** "media-front-coating" member type */
        @JvmField val mediaFrontCoating = MediaBackCoating.Type("media-front-coating")
        /** "media-grain" member type */
        @JvmField val mediaGrain = MediaGrain.Type("media-grain")
        /** "media-hole-count" member type */
        @JvmField val mediaHoleCount = IntegerType("media-hole-count")
        /** "media-info" member type */
        @JvmField val mediaInfo = TextType(255, "media-info")
        /** "media-key" member type */
        @JvmField val mediaKey = Media.Type("media-key")
        /** "media-left-margin" member type */
        @JvmField val mediaLeftMargin = IntegerType("media-left-margin")
        /** "media-order-count" member type */
        @JvmField val mediaOrderCount = IntegerType("media-order-count")
        /** "media-pre-printed" member type */
        @JvmField val mediaPrePrinted = MediaPrePrinted.Type("media-pre-printed")
        /** "media-recycled" member type */
        @JvmField val mediaRecycled = MediaRecycled.Type("media-recycled")
        /** "media-right-margin" member type */
        @JvmField val mediaRightMargin = IntegerType("media-right-margin")
        /** "media-size" member type */
        @JvmField val mediaSize = MediaSize.Type("media-size")
        /** "media-size-name" member type */
        @JvmField val mediaSizeName = Media.Type("media-size-name")
        /** "media-source" member type */
        @JvmField val mediaSource = MediaSource.Type("media-source")
        /** "media-thickness" member type */
        @JvmField val mediaThickness = IntegerType("media-thickness")
        /** "media-tooth" member type */
        @JvmField val mediaTooth = MediaTooth.Type("media-tooth")
        /** "media-top-margin" member type */
        @JvmField val mediaTopMargin = IntegerType("media-top-margin")
        /** "media-type" member type */
        @JvmField val mediaType = MediaType.Type("media-type")
        /** "media-weight-metric" member type */
        @JvmField val mediaWeightMetric = IntegerType("media-weight-metric")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [MediaCol] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "media-back-coating" member type */
            @JvmField val mediaBackCoating = Keywords(Members.mediaBackCoating.name)
            /** "media-bottom-margin" member type */
            @JvmField val mediaBottomMargin = Keywords(Members.mediaBottomMargin.name)
            /** "media-color" member type */
            @JvmField val mediaColor = Keywords(Members.mediaColor.name)
            /** "media-front-coating" member type */
            @JvmField val mediaFrontCoating = Keywords(Members.mediaFrontCoating.name)
            /** "media-grain" member type */
            @JvmField val mediaGrain = Keywords(Members.mediaGrain.name)
            /** "media-hole-count" member type */
            @JvmField val mediaHoleCount = Keywords(Members.mediaHoleCount.name)
            /** "media-info" member type */
            @JvmField val mediaInfo = Keywords(Members.mediaInfo.name)
            /** "media-key" member type */
            @JvmField val mediaKey = Keywords(Members.mediaKey.name)
            /** "media-left-margin" member type */
            @JvmField val mediaLeftMargin = Keywords(Members.mediaLeftMargin.name)
            /** "media-order-count" member type */
            @JvmField val mediaOrderCount = Keywords(Members.mediaOrderCount.name)
            /** "media-pre-printed" member type */
            @JvmField val mediaPrePrinted = Keywords(Members.mediaPrePrinted.name)
            /** "media-recycled" member type */
            @JvmField val mediaRecycled = Keywords(Members.mediaRecycled.name)
            /** "media-right-margin" member type */
            @JvmField val mediaRightMargin = Keywords(Members.mediaRightMargin.name)
            /** "media-size" member type */
            @JvmField val mediaSize = Keywords(Members.mediaSize.name)
            /** "media-size-name" member type */
            @JvmField val mediaSizeName = Keywords(Members.mediaSizeName.name)
            /** "media-source" member type */
            @JvmField val mediaSource = Keywords(Members.mediaSource.name)
            /** "media-thickness" member type */
            @JvmField val mediaThickness = Keywords(Members.mediaThickness.name)
            /** "media-tooth" member type */
            @JvmField val mediaTooth = Keywords(Members.mediaTooth.name)
            /** "media-top-margin" member type */
            @JvmField val mediaTopMargin = Keywords(Members.mediaTopMargin.name)
            /** "media-type" member type */
            @JvmField val mediaType = Keywords(Members.mediaType.name)
            /** "media-weight-metric" member type */
            @JvmField val mediaWeightMetric = Keywords(Members.mediaWeightMetric.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }

    /**
     * Data object corresponding to a "media-size" collection.
     */
    data class MediaSize
    @JvmOverloads constructor(
        val xDimension: Int? = null,
        val yDimension: Int? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {
    
        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                xDimension?.also {
                    add(Members.xDimension.of(it))
                }
                yDimension?.also {
                    add(Members.yDimension.of(it))
                }
            } + _extras)
        }
    
        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<MediaSize>(Members, name)
    
        companion object Members : CollectionParser<MediaSize> {
            override val typeName = MediaSize::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): MediaSize {
                val remain = attributes.toMutableList()
                return MediaSize(
                    extractOne(remain, xDimension),
                    extractOne(remain, yDimension),
                    _extras = remain)
            }
            /** "x-dimension" member type */
            @JvmField val xDimension = IntegerType("x-dimension")
            /** "y-dimension" member type */
            @JvmField val yDimension = IntegerType("y-dimension")
        }
    
        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [MediaSize] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)
    
            companion object {
                /** "x-dimension" member type */
                @JvmField val xDimension = Keywords(Members.xDimension.name)
                /** "y-dimension" member type */
                @JvmField val yDimension = Keywords(Members.yDimension.name)
    
                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }
}