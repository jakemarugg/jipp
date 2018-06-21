// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/**
 * Describes a name object, which may or may not have a language string.
 */
data class Name(val value: String, val lang: String?) {
    constructor(value: String) : this(value, null)
}