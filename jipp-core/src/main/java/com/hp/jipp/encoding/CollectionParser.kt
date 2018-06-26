// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/**
 * An object that can parse a collection of attributes into an object.
 */
interface CollectionParser<T> {
    /** Describes type [T] */
    val typeName: String

    /** Parses a list of attributes into a collection type */
    fun fromAttributes(attributes: List<Attribute<*>>): T

    /**
     * Consumes the first value of attribute [type] from [attributes], removing it (and the attribute if empty).
     */
    fun <T: Any> extractOne(attributes: MutableList<Attribute<*>>, type: AttributeType<T>): T? {
        // TODO: Will it cause a ParseError if the wrong-type attribute is received for a name?
        @Suppress("UNCHECKED_CAST")
        val attribute = attributes.find { it.name == type.name } as Attribute<T>? ?: return null
        attributes.remove(attribute)
        return when (attribute.values.size) {
            0 -> null
            1 -> attribute.value
            else -> {
                val remain = Attribute(attribute.valueTag, attribute.name, attribute.values.drop(1), attribute.encoder)
                attributes.add(remain)
                attribute.value
            }
        }
    }

    /**
     * Consumes an attribute of [type] from [attributes], returning all of its values if present.
     */
    fun <T: Any> extractAll(attributes: MutableList<Attribute<*>>, type: AttributeType<T>): List<T>? {
        @Suppress("UNCHECKED_CAST")
        val attribute = (attributes.find { it.name == type.name }  ?: return null) as Attribute<T>
        attributes.remove(attribute)
        return attribute.values
    }
}
