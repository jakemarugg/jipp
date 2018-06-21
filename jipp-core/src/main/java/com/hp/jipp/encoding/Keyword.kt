// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/**
 * A known sequence of characters.
 *
 * See [RFC2911 Section 4.1.3](https://tools.ietf.org/html/rfc2911.section-4.1.3).
 */
abstract class Keyword: KeywordOrName() {
    override val tag = Tag.keyword
    override val language: String? = null
}
