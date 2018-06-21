// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

import com.hp.jipp.util.BuildError
import java.io.IOException

/** An [AttributeType] for octet string values (binary data) */
class OctetStringType(
    tag: Tag = Tag.octetString,
    val maxSize: Int = DEFAULT_MAX,
    override val name: String
) : AttributeType<ByteArray>(Encoder, tag) {

    constructor(tag: Tag, name: String): this(tag, DEFAULT_MAX, name)

    constructor(maxSize: Int, name: String): this(Tag.octetString, maxSize, name)

    constructor(name: String): this(Tag.octetString, DEFAULT_MAX, name)

    companion object Encoder : SimpleEncoder<ByteArray>("octetString") {
        const val DEFAULT_MAX = 1023
        @Throws(IOException::class)
        override fun writeValue(out: IppOutputStream, value: ByteArray) {
            out.writeValueBytes(value)
        }

        @Throws(IOException::class)
        override fun readValue(input: IppInputStream, valueTag: Tag): ByteArray {
            return input.readValueBytes()
        }

        override fun valid(valueTag: Tag): Boolean {
            // octetString is a fallback for all types we don't otherwise understand
            return true
        }
    }

    override fun of(values: List<ByteArray>): Attribute<ByteArray> {
        values.forEach {
            if (it.size > maxSize) {
                throw BuildError("Octet string size of ${it.size} must be less than $maxSize")
            }
        }
        return super.of(values)
    }
}
