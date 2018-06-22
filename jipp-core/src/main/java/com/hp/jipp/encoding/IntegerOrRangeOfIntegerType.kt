// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.encoding.IntegerType.Encoder.INT_LENGTH
import com.hp.jipp.util.BuildError
import java.io.IOException

/** Attribute type for attributes whose values are either integers or [IntRange] objects */
class IntegerOrRangeOfIntegerType(
    override val name: String
) : AttributeType<IntRangeOrInt>(Encoder, Tag.rangeOfInteger) {

    override fun of(values: List<IntRangeOrInt>): Attribute<IntRangeOrInt> {
        return if (null == values.find { !it.simpleInt }) {
            // Ints only
            Attribute(Tag.integerValue, name, values, encoder)
        } else {
            // If one or more ranges, all must be interpreted as ranges
            val coerced = values.map {
                if (it.simpleInt) IntRangeOrInt(it.start, it.endInclusive) else it
            }
            Attribute(Tag.rangeOfInteger, name, coerced, encoder)
        }
    }

    /** Return an attribute containing the supplied integer value(s) */
    fun ofIntegers(integers: List<Int>) = invoke(integers.map { IntRangeOrInt(it) })

    /** Return an attribute containing the supplied integer value(s) */
    fun of(vararg integers: Int) = ofIntegers(integers.toList())

    /** Return an attribute containing the supplied integer value(s) */
    operator fun invoke(vararg integers: Int) = ofIntegers(integers.toList())

    /** Return an attribute containing the supplied range(s) */
    fun ofRanges(ranges: List<IntRange>) = invoke(ranges.map { IntRangeOrInt(it) })

    /** Return an attribute containing the supplied range(s) */
    operator fun invoke(vararg ranges: IntRange) = ofRanges(ranges.toList())

    /** Return an attribute containing the supplied range(s) */
    fun of(vararg ranges: IntRange) = ofRanges(ranges.toList())

    companion object Encoder : SimpleEncoder<IntRangeOrInt>("integer | rangeOfInteger") {
        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): IntRangeOrInt {
            return if (valueTag == Tag.integerValue) {
                input.takeLength(INT_LENGTH)
                IntRangeOrInt(input.readInt())
            } else {
                input.takeLength(INT_LENGTH + INT_LENGTH)
                val low = input.readInt()
                val high = input.readInt()
                // end is inclusive
                IntRangeOrInt(low, high)
            }
        }

        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: IntRangeOrInt) {
            if (value.simpleInt) {
                out.writeShort(INT_LENGTH)
                out.writeInt(value.start)
            } else {
                out.writeShort(INT_LENGTH + INT_LENGTH)
                out.writeInt(value.start)
                out.writeInt(value.endInclusive)
            }
        }
        override fun valid(valueTag: Tag) = valueTag == Tag.rangeOfInteger || valueTag == Tag.integerValue
    }
}
