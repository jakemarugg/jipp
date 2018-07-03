// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "finishings-col" collection as defined in:
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *   * [PWG5100.3](http://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf)
 */
data class FinishingsCol
@JvmOverloads constructor(
    val baling: Baling? = null,
    val binding: Binding? = null,
    val coating: Coating? = null,
    val covering: Covering? = null,
    val finishingTemplate: FinishingTemplate? = null,
    val folding: List<Folding>? = null,
    val impositionTemplate: ImpositionTemplate? = null,
    val laminating: Laminating? = null,
    val mediaSheetsSupported: IntRange? = null,
    val mediaSize: MediaSize? = null,
    val mediaSizeName: Media? = null,
    val punching: Punching? = null,
    val stitching: Stitching? = null,
    val trimming: List<Trimming>? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            baling?.also {
                add(Members.baling.of(it))
            }
            binding?.also {
                add(Members.binding.of(it))
            }
            coating?.also {
                add(Members.coating.of(it))
            }
            covering?.also {
                add(Members.covering.of(it))
            }
            finishingTemplate?.also {
                add(Members.finishingTemplate.of(it))
            }
            folding?.also {
                add(Members.folding.of(it))
            }
            impositionTemplate?.also {
                add(Members.impositionTemplate.of(it))
            }
            laminating?.also {
                add(Members.laminating.of(it))
            }
            mediaSheetsSupported?.also {
                add(Members.mediaSheetsSupported.of(it))
            }
            mediaSize?.also {
                add(Members.mediaSize.of(it))
            }
            mediaSizeName?.also {
                add(Members.mediaSizeName.of(it))
            }
            punching?.also {
                add(Members.punching.of(it))
            }
            stitching?.also {
                add(Members.stitching.of(it))
            }
            trimming?.also {
                add(Members.trimming.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<FinishingsCol>(Members, name)

    companion object Members : CollectionParser<FinishingsCol> {
        override val typeName = FinishingsCol::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): FinishingsCol {
            val remain = attributes.toMutableList()
            return FinishingsCol(
                extractOne(remain, baling),
                extractOne(remain, binding),
                extractOne(remain, coating),
                extractOne(remain, covering),
                extractOne(remain, finishingTemplate),
                extractAll(remain, folding),
                extractOne(remain, impositionTemplate),
                extractOne(remain, laminating),
                extractOne(remain, mediaSheetsSupported),
                extractOne(remain, mediaSize),
                extractOne(remain, mediaSizeName),
                extractOne(remain, punching),
                extractOne(remain, stitching),
                extractAll(remain, trimming),
                _extras = remain)
        }
        /** "baling" member type */
        @JvmField val baling = Baling.Type("baling")
        /** "binding" member type */
        @JvmField val binding = Binding.Type("binding")
        /** "coating" member type */
        @JvmField val coating = Coating.Type("coating")
        /** "covering" member type */
        @JvmField val covering = Covering.Type("covering")
        /** "finishing-template" member type */
        @JvmField val finishingTemplate = FinishingTemplate.Type("finishing-template")
        /** "folding" member type */
        @JvmField val folding = Folding.Type("folding")
        /** "imposition-template" member type */
        @JvmField val impositionTemplate = ImpositionTemplate.Type("imposition-template")
        /** "laminating" member type */
        @JvmField val laminating = Laminating.Type("laminating")
        /** "media-sheets-supported" member type */
        @JvmField val mediaSheetsSupported = RangeOfIntegerType("media-sheets-supported")
        /** "media-size" member type */
        @JvmField val mediaSize = MediaSize.Type("media-size")
        /** "media-size-name" member type */
        @JvmField val mediaSizeName = Media.Type("media-size-name")
        /** "punching" member type */
        @JvmField val punching = Punching.Type("punching")
        /** "stitching" member type */
        @JvmField val stitching = Stitching.Type("stitching")
        /** "trimming" member type */
        @JvmField val trimming = Trimming.Type("trimming")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [FinishingsCol] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "baling" member type */
            @JvmField val baling = Keywords(Members.baling.name)
            /** "binding" member type */
            @JvmField val binding = Keywords(Members.binding.name)
            /** "coating" member type */
            @JvmField val coating = Keywords(Members.coating.name)
            /** "covering" member type */
            @JvmField val covering = Keywords(Members.covering.name)
            /** "finishing-template" member type */
            @JvmField val finishingTemplate = Keywords(Members.finishingTemplate.name)
            /** "folding" member type */
            @JvmField val folding = Keywords(Members.folding.name)
            /** "imposition-template" member type */
            @JvmField val impositionTemplate = Keywords(Members.impositionTemplate.name)
            /** "laminating" member type */
            @JvmField val laminating = Keywords(Members.laminating.name)
            /** "media-sheets-supported" member type */
            @JvmField val mediaSheetsSupported = Keywords(Members.mediaSheetsSupported.name)
            /** "media-size" member type */
            @JvmField val mediaSize = Keywords(Members.mediaSize.name)
            /** "media-size-name" member type */
            @JvmField val mediaSizeName = Keywords(Members.mediaSizeName.name)
            /** "punching" member type */
            @JvmField val punching = Keywords(Members.punching.name)
            /** "stitching" member type */
            @JvmField val stitching = Keywords(Members.stitching.name)
            /** "trimming" member type */
            @JvmField val trimming = Keywords(Members.trimming.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }

    /**
     * Data object corresponding to a "baling" collection.
     */
    data class Baling
    @JvmOverloads constructor(
        val balingType: BalingType? = null,
        val balingWhen: BalingWhen? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                balingType?.also {
                    add(Members.balingType.of(it))
                }
                balingWhen?.also {
                    add(Members.balingWhen.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Baling>(Members, name)

        companion object Members : CollectionParser<Baling> {
            override val typeName = Baling::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Baling {
                val remain = attributes.toMutableList()
                return Baling(
                    extractOne(remain, balingType),
                    extractOne(remain, balingWhen),
                    _extras = remain)
            }
            /** "baling-type" member type */
            @JvmField val balingType = BalingType.Type("baling-type")
            /** "baling-when" member type */
            @JvmField val balingWhen = BalingWhen.Type("baling-when")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Baling] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "baling-type" member type */
                @JvmField val balingType = Keywords(Members.balingType.name)
                /** "baling-when" member type */
                @JvmField val balingWhen = Keywords(Members.balingWhen.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "binding" collection.
     */
    data class Binding
    @JvmOverloads constructor(
        val bindingReferenceEdge: BindingReferenceEdge? = null,
        val bindingType: BindingType? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                bindingReferenceEdge?.also {
                    add(Members.bindingReferenceEdge.of(it))
                }
                bindingType?.also {
                    add(Members.bindingType.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Binding>(Members, name)

        companion object Members : CollectionParser<Binding> {
            override val typeName = Binding::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Binding {
                val remain = attributes.toMutableList()
                return Binding(
                    extractOne(remain, bindingReferenceEdge),
                    extractOne(remain, bindingType),
                    _extras = remain)
            }
            /** "binding-reference-edge" member type */
            @JvmField val bindingReferenceEdge = BindingReferenceEdge.Type("binding-reference-edge")
            /** "binding-type" member type */
            @JvmField val bindingType = BindingType.Type("binding-type")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Binding] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "binding-reference-edge" member type */
                @JvmField val bindingReferenceEdge = Keywords(Members.bindingReferenceEdge.name)
                /** "binding-type" member type */
                @JvmField val bindingType = Keywords(Members.bindingType.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "coating" collection.
     */
    data class Coating
    @JvmOverloads constructor(
        val coatingSides: CoatingSides? = null,
        val coatingType: CoatingType? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                coatingSides?.also {
                    add(Members.coatingSides.of(it))
                }
                coatingType?.also {
                    add(Members.coatingType.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Coating>(Members, name)

        companion object Members : CollectionParser<Coating> {
            override val typeName = Coating::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Coating {
                val remain = attributes.toMutableList()
                return Coating(
                    extractOne(remain, coatingSides),
                    extractOne(remain, coatingType),
                    _extras = remain)
            }
            /** "coating-sides" member type */
            @JvmField val coatingSides = CoatingSides.Type("coating-sides")
            /** "coating-type" member type */
            @JvmField val coatingType = CoatingType.Type("coating-type")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Coating] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "coating-sides" member type */
                @JvmField val coatingSides = Keywords(Members.coatingSides.name)
                /** "coating-type" member type */
                @JvmField val coatingType = Keywords(Members.coatingType.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "covering" collection.
     */
    data class Covering
    @JvmOverloads constructor(
        val coveringName: CoveringName? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                coveringName?.also {
                    add(Members.coveringName.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Covering>(Members, name)

        companion object Members : CollectionParser<Covering> {
            override val typeName = Covering::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Covering {
                val remain = attributes.toMutableList()
                return Covering(
                    extractOne(remain, coveringName),
                    _extras = remain)
            }
            /** "covering-name" member type */
            @JvmField val coveringName = CoveringName.Type("covering-name")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Covering] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "covering-name" member type */
                @JvmField val coveringName = Keywords(Members.coveringName.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "folding" collection.
     */
    data class Folding
    @JvmOverloads constructor(
        val foldingDirection: FoldingDirection? = null,
        val foldingOffset: Int? = null,
        val foldingReferenceEdge: FoldingReferenceEdge? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                foldingDirection?.also {
                    add(Members.foldingDirection.of(it))
                }
                foldingOffset?.also {
                    add(Members.foldingOffset.of(it))
                }
                foldingReferenceEdge?.also {
                    add(Members.foldingReferenceEdge.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Folding>(Members, name)

        companion object Members : CollectionParser<Folding> {
            override val typeName = Folding::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Folding {
                val remain = attributes.toMutableList()
                return Folding(
                    extractOne(remain, foldingDirection),
                    extractOne(remain, foldingOffset),
                    extractOne(remain, foldingReferenceEdge),
                    _extras = remain)
            }
            /** "folding-direction" member type */
            @JvmField val foldingDirection = FoldingDirection.Type("folding-direction")
            /** "folding-offset" member type */
            @JvmField val foldingOffset = IntegerType("folding-offset")
            /** "folding-reference-edge" member type */
            @JvmField val foldingReferenceEdge = FoldingReferenceEdge.Type("folding-reference-edge")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Folding] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "folding-direction" member type */
                @JvmField val foldingDirection = Keywords(Members.foldingDirection.name)
                /** "folding-offset" member type */
                @JvmField val foldingOffset = Keywords(Members.foldingOffset.name)
                /** "folding-reference-edge" member type */
                @JvmField val foldingReferenceEdge = Keywords(Members.foldingReferenceEdge.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "laminating" collection.
     */
    data class Laminating
    @JvmOverloads constructor(
        val laminatingSides: LaminatingSides? = null,
        val laminatingType: LaminatingType? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                laminatingSides?.also {
                    add(Members.laminatingSides.of(it))
                }
                laminatingType?.also {
                    add(Members.laminatingType.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Laminating>(Members, name)

        companion object Members : CollectionParser<Laminating> {
            override val typeName = Laminating::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Laminating {
                val remain = attributes.toMutableList()
                return Laminating(
                    extractOne(remain, laminatingSides),
                    extractOne(remain, laminatingType),
                    _extras = remain)
            }
            /** "laminating-sides" member type */
            @JvmField val laminatingSides = LaminatingSides.Type("laminating-sides")
            /** "laminating-type" member type */
            @JvmField val laminatingType = LaminatingType.Type("laminating-type")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Laminating] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "laminating-sides" member type */
                @JvmField val laminatingSides = Keywords(Members.laminatingSides.name)
                /** "laminating-type" member type */
                @JvmField val laminatingType = Keywords(Members.laminatingType.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
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

    /**
     * Data object corresponding to a "punching" collection.
     */
    data class Punching
    @JvmOverloads constructor(
        val punchingLocations: List<Int>? = null,
        val punchingOffset: Int? = null,
        val punchingReferenceEdge: PunchingReferenceEdge? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                punchingLocations?.also {
                    add(Members.punchingLocations.of(it))
                }
                punchingOffset?.also {
                    add(Members.punchingOffset.of(it))
                }
                punchingReferenceEdge?.also {
                    add(Members.punchingReferenceEdge.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Punching>(Members, name)

        companion object Members : CollectionParser<Punching> {
            override val typeName = Punching::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Punching {
                val remain = attributes.toMutableList()
                return Punching(
                    extractAll(remain, punchingLocations),
                    extractOne(remain, punchingOffset),
                    extractOne(remain, punchingReferenceEdge),
                    _extras = remain)
            }
            /** "punching-locations" member type */
            @JvmField val punchingLocations = IntegerType("punching-locations")
            /** "punching-offset" member type */
            @JvmField val punchingOffset = IntegerType("punching-offset")
            /** "punching-reference-edge" member type */
            @JvmField val punchingReferenceEdge = PunchingReferenceEdge.Type("punching-reference-edge")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Punching] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "punching-locations" member type */
                @JvmField val punchingLocations = Keywords(Members.punchingLocations.name)
                /** "punching-offset" member type */
                @JvmField val punchingOffset = Keywords(Members.punchingOffset.name)
                /** "punching-reference-edge" member type */
                @JvmField val punchingReferenceEdge = Keywords(Members.punchingReferenceEdge.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "stitching" collection.
     */
    data class Stitching
    @JvmOverloads constructor(
        val stitchingAngle: Int? = null,
        val stitchingLocations: List<Int>? = null,
        val stitchingMethod: StitchingMethod? = null,
        val stitchingOffset: Int? = null,
        val stitchingReferenceEdge: StitchingReferenceEdge? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                stitchingAngle?.also {
                    add(Members.stitchingAngle.of(it))
                }
                stitchingLocations?.also {
                    add(Members.stitchingLocations.of(it))
                }
                stitchingMethod?.also {
                    add(Members.stitchingMethod.of(it))
                }
                stitchingOffset?.also {
                    add(Members.stitchingOffset.of(it))
                }
                stitchingReferenceEdge?.also {
                    add(Members.stitchingReferenceEdge.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Stitching>(Members, name)

        companion object Members : CollectionParser<Stitching> {
            override val typeName = Stitching::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Stitching {
                val remain = attributes.toMutableList()
                return Stitching(
                    extractOne(remain, stitchingAngle),
                    extractAll(remain, stitchingLocations),
                    extractOne(remain, stitchingMethod),
                    extractOne(remain, stitchingOffset),
                    extractOne(remain, stitchingReferenceEdge),
                    _extras = remain)
            }
            /** "stitching-angle" member type */
            @JvmField val stitchingAngle = IntegerType("stitching-angle")
            /** "stitching-locations" member type */
            @JvmField val stitchingLocations = IntegerType("stitching-locations")
            /** "stitching-method" member type */
            @JvmField val stitchingMethod = StitchingMethod.Type("stitching-method")
            /** "stitching-offset" member type */
            @JvmField val stitchingOffset = IntegerType("stitching-offset")
            /** "stitching-reference-edge" member type */
            @JvmField val stitchingReferenceEdge = StitchingReferenceEdge.Type("stitching-reference-edge")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Stitching] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "stitching-angle" member type */
                @JvmField val stitchingAngle = Keywords(Members.stitchingAngle.name)
                /** "stitching-locations" member type */
                @JvmField val stitchingLocations = Keywords(Members.stitchingLocations.name)
                /** "stitching-method" member type */
                @JvmField val stitchingMethod = Keywords(Members.stitchingMethod.name)
                /** "stitching-offset" member type */
                @JvmField val stitchingOffset = Keywords(Members.stitchingOffset.name)
                /** "stitching-reference-edge" member type */
                @JvmField val stitchingReferenceEdge = Keywords(Members.stitchingReferenceEdge.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }

    /**
     * Data object corresponding to a "trimming" collection.
     */
    data class Trimming
    @JvmOverloads constructor(
        val trimmingOffset: Int? = null,
        val trimmingReferenceEdge: TrimmingReferenceEdge? = null,
        val trimmingType: TrimmingType? = null,
        val trimmingWhen: TrimmingWhen? = null,
        val _extras: List<Attribute<*>> = listOf()
    ) : HasAttributeCollection {

        /** Generate attribute list */
        override val attributes: AttributeCollection by lazy {
            AttributeCollection(mutableListOf<Attribute<*>>().apply {
                trimmingOffset?.also {
                    add(Members.trimmingOffset.of(it))
                }
                trimmingReferenceEdge?.also {
                    add(Members.trimmingReferenceEdge.of(it))
                }
                trimmingType?.also {
                    add(Members.trimmingType.of(it))
                }
                trimmingWhen?.also {
                    add(Members.trimmingWhen.of(it))
                }
            } + _extras)
        }

        /** Type for attributes of this collection */
        class Type(name: String): TypedCollectionType<Trimming>(Members, name)

        companion object Members : CollectionParser<Trimming> {
            override val typeName = Trimming::class.java.simpleName!!
            override fun fromAttributes(attributes: List<Attribute<*>>): Trimming {
                val remain = attributes.toMutableList()
                return Trimming(
                    extractOne(remain, trimmingOffset),
                    extractOne(remain, trimmingReferenceEdge),
                    extractOne(remain, trimmingType),
                    extractOne(remain, trimmingWhen),
                    _extras = remain)
            }
            /** "trimming-offset" member type */
            @JvmField val trimmingOffset = IntegerType("trimming-offset")
            /** "trimming-reference-edge" member type */
            @JvmField val trimmingReferenceEdge = TrimmingReferenceEdge.Type("trimming-reference-edge")
            /** "trimming-type" member type */
            @JvmField val trimmingType = TrimmingType.Type("trimming-type")
            /** "trimming-when" member type */
            @JvmField val trimmingWhen = TrimmingWhen.Type("trimming-when")
        }

        /**
         * All allowed member names in keyword form.
         */
        data class Keywords(
            override val value: String
        ) : Keyword() {
            override fun toString() = value
            /** An attribute type for [Trimming] member names as keywords */
            class Type(name: String) : KeywordType<Keywords>(Encoder, name)

            companion object {
                /** "trimming-offset" member type */
                @JvmField val trimmingOffset = Keywords(Members.trimmingOffset.name)
                /** "trimming-reference-edge" member type */
                @JvmField val trimmingReferenceEdge = Keywords(Members.trimmingReferenceEdge.name)
                /** "trimming-type" member type */
                @JvmField val trimmingType = Keywords(Members.trimmingType.name)
                /** "trimming-when" member type */
                @JvmField val trimmingWhen = Keywords(Members.trimmingWhen.name)

                @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                    Keywords(value)
                }
            }
        }
    }
}