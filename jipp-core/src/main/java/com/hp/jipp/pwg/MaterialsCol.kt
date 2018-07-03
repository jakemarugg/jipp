// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "materials-col" collection as defined in:
 *   * [PWG5100.21](http://ftp.pwg.org/pub/pwg/candidates/cs-ipp3d10-20170210-5100.21.pdf)
 */
data class MaterialsCol
@JvmOverloads constructor(
    val materialAmount: Int? = null,
    val materialAmountUnits: MaterialAmountUnit? = null,
    val materialColor: MediaColor? = null,
    val materialDiameter: Int? = null,
    val materialDiameterTolerance: Int? = null,
    val materialFillDensity: Int? = null,
    val materialKey: MaterialKey? = null,
    val materialName: String? = null,
    val materialPurpose: List<MaterialPurpose>? = null,
    val materialRate: Int? = null,
    val materialRateUnits: MaterialRateUnit? = null,
    val materialShellThickness: Int? = null,
    val materialTemperature: IntRangeOrInt? = null,
    val materialType: MaterialType? = null,
    val _extras: List<Attribute<*>> = listOf()
) : HasAttributeCollection {

    /** Generate attribute list */
    override val attributes: AttributeCollection by lazy {
        AttributeCollection(mutableListOf<Attribute<*>>().apply {
            materialAmount?.also {
                add(Members.materialAmount.of(it))
            }
            materialAmountUnits?.also {
                add(Members.materialAmountUnits.of(it))
            }
            materialColor?.also {
                add(Members.materialColor.of(it))
            }
            materialDiameter?.also {
                add(Members.materialDiameter.of(it))
            }
            materialDiameterTolerance?.also {
                add(Members.materialDiameterTolerance.of(it))
            }
            materialFillDensity?.also {
                add(Members.materialFillDensity.of(it))
            }
            materialKey?.also {
                add(Members.materialKey.of(it))
            }
            materialName?.also {
                add(Members.materialName.of(it))
            }
            materialPurpose?.also {
                add(Members.materialPurpose.of(it))
            }
            materialRate?.also {
                add(Members.materialRate.of(it))
            }
            materialRateUnits?.also {
                add(Members.materialRateUnits.of(it))
            }
            materialShellThickness?.also {
                add(Members.materialShellThickness.of(it))
            }
            materialTemperature?.also {
                add(Members.materialTemperature.of(it))
            }
            materialType?.also {
                add(Members.materialType.of(it))
            }
        } + _extras)
    }

    /** Type for attributes of this collection */
    class Type(name: String): TypedCollectionType<MaterialsCol>(Members, name)

    companion object Members : CollectionParser<MaterialsCol> {
        override val typeName = MaterialsCol::class.java.simpleName!!
        override fun fromAttributes(attributes: List<Attribute<*>>): MaterialsCol {
            val remain = attributes.toMutableList()
            return MaterialsCol(
                extractOne(remain, materialAmount),
                extractOne(remain, materialAmountUnits),
                extractOne(remain, materialColor),
                extractOne(remain, materialDiameter),
                extractOne(remain, materialDiameterTolerance),
                extractOne(remain, materialFillDensity),
                extractOne(remain, materialKey),
                extractOne(remain, materialName)?.value,
                extractAll(remain, materialPurpose),
                extractOne(remain, materialRate),
                extractOne(remain, materialRateUnits),
                extractOne(remain, materialShellThickness),
                extractOne(remain, materialTemperature),
                extractOne(remain, materialType),
                _extras = remain)
        }
        /** "material-amount" member type */
        @JvmField val materialAmount = IntegerType("material-amount")
        /** "material-amount-units" member type */
        @JvmField val materialAmountUnits = MaterialAmountUnit.Type("material-amount-units")
        /** "material-color" member type */
        @JvmField val materialColor = MediaColor.Type("material-color")
        /** "material-diameter" member type */
        @JvmField val materialDiameter = IntegerType("material-diameter")
        /** "material-diameter-tolerance" member type */
        @JvmField val materialDiameterTolerance = IntegerType("material-diameter-tolerance")
        /** "material-fill-density" member type */
        @JvmField val materialFillDensity = IntegerType("material-fill-density")
        /** "material-key" member type */
        @JvmField val materialKey = MaterialKey.Type("material-key")
        /** "material-name" member type */
        @JvmField val materialName = NameType("material-name")
        /** "material-purpose" member type */
        @JvmField val materialPurpose = MaterialPurpose.Type("material-purpose")
        /** "material-rate" member type */
        @JvmField val materialRate = IntegerType("material-rate")
        /** "material-rate-units" member type */
        @JvmField val materialRateUnits = MaterialRateUnit.Type("material-rate-units")
        /** "material-shell-thickness" member type */
        @JvmField val materialShellThickness = IntegerType("material-shell-thickness")
        /** "material-temperature" member type */
        @JvmField val materialTemperature = IntegerOrRangeOfIntegerType("material-temperature")
        /** "material-type" member type */
        @JvmField val materialType = MaterialType.Type("material-type")
    }

    /**
     * All allowed member names in keyword form.
     */
    data class Keywords(
        override val value: String
    ) : Keyword() {
        override fun toString() = value
        /** An attribute type for [MaterialsCol] member names as keywords */
        class Type(name: String) : KeywordType<Keywords>(Encoder, name)

        companion object {
            /** "material-amount" member type */
            @JvmField val materialAmount = Keywords(Members.materialAmount.name)
            /** "material-amount-units" member type */
            @JvmField val materialAmountUnits = Keywords(Members.materialAmountUnits.name)
            /** "material-color" member type */
            @JvmField val materialColor = Keywords(Members.materialColor.name)
            /** "material-diameter" member type */
            @JvmField val materialDiameter = Keywords(Members.materialDiameter.name)
            /** "material-diameter-tolerance" member type */
            @JvmField val materialDiameterTolerance = Keywords(Members.materialDiameterTolerance.name)
            /** "material-fill-density" member type */
            @JvmField val materialFillDensity = Keywords(Members.materialFillDensity.name)
            /** "material-key" member type */
            @JvmField val materialKey = Keywords(Members.materialKey.name)
            /** "material-name" member type */
            @JvmField val materialName = Keywords(Members.materialName.name)
            /** "material-purpose" member type */
            @JvmField val materialPurpose = Keywords(Members.materialPurpose.name)
            /** "material-rate" member type */
            @JvmField val materialRate = Keywords(Members.materialRate.name)
            /** "material-rate-units" member type */
            @JvmField val materialRateUnits = Keywords(Members.materialRateUnits.name)
            /** "material-shell-thickness" member type */
            @JvmField val materialShellThickness = Keywords(Members.materialShellThickness.name)
            /** "material-temperature" member type */
            @JvmField val materialTemperature = Keywords(Members.materialTemperature.name)
            /** "material-type" member type */
            @JvmField val materialType = Keywords(Members.materialType.name)

            @JvmField val Encoder = KeywordType.encoderOf(Keywords::class.java) { value, _, _ ->
                Keywords(value)
            }
        }
    }
}