// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/** A string, possibly encoded with language  */
data class LangString(val string: String, val lang: String?) {
    constructor(string: String) : this(string, null)

    override fun toString() = "\"$string\" of " + (lang ?: "?")
}
