// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.BuildError

/**
 * Associates a specific tag and name such that an attribute can be safely created or retrieved from a group
 */
abstract class AttributeType<T>(val encoder: Encoder<T>, val tag: Tag) {
    abstract val name: String

    init {
        if (!encoder.valid(tag)) {
            throw BuildError("Invalid tag $tag for encoder $encoder")
        }
    }

    /** Return an empty attribute (containing no values) for this type but substituting a tag*/
    fun empty(tag: Tag) = Attribute(tag, name, emptyList(), encoder)

    /** Return an empty attribute (containing no values) for this type */
    fun empty() = empty(tag)

    /** Return a "no-value" attribute of this type */
    fun noValue() = empty(Tag.noValue)

    /** Return an "unknown" attribute of this type */
    fun unknown() = empty(Tag.unknown)

    /** Return an "unsupported" attribute of this type */
    fun unsupported() = empty(Tag.unsupported)

    /** Create an attribute of this attribute type with supplied values. */
    open fun of(values: List<T>) = Attribute(tag, name, values, encoder)

    /** Create an attribute of this attribute type with supplied values. */
    operator fun invoke(values: List<T>) = of(values)

    /** Create an attribute of this attribute type with supplied values. */
    operator fun invoke(value: T, vararg values: T): Attribute<T> =
            if (values.isEmpty()) of(value) else of(listOf(value) + values)

    /** Create an attribute of this attribute type with supplied values. */
    operator fun invoke(value: T) = of(listOf(value))

    /** Create an attribute of this attribute type with supplied values. */
    fun of(values: Array<T>) = of(values.toList())

    // Note: this is open for values of T which are themselves generic
    /** Create an attribute of this attribute type with supplied values. */
    open fun of(value: T, vararg values: T): Attribute<T> = if (values.isEmpty()) {
        of(listOf(value))
    } else {
        of(listOf(value) + values)
    }

    /** If possible, convert the supplied attribute into an attribute of this type. */
    open fun convert(attribute: Attribute<*>): Attribute<T>? =
        if (attribute.encoder === encoder) {
            of(attribute.values.map {
                @Suppress("UNCHECKED_CAST")
                it as T
            })
        } else {
            null
        }

    /** Return true if the attribute has a matching encoder */
    fun isValid(attribute: Attribute<*>): Boolean {
        return attribute.encoder == encoder
    }
}
