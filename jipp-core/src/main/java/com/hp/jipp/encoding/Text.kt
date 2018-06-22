// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/**
 * Describes a text object, which may or may not have a language string.
 */
data class Text(val value: String, val lang: String?) {
    constructor(value: String) : this(value, null)

    override fun toString() =
        if (lang == null) {
            "\"$value\""
        } else {
            "\"$value\" ($lang)"
        }
}