// Copyright 2017 HP Development Company, L.P.
// SPDX-License-Identifier: MIT

package com.hp.jipp.encoding

/**
 * Superclass for attribute values that may be either a [Keyword] or a name
 * ([Tag.nameWithLanguage] or [Tag.nameWithoutLanguage] as described in
 * [RFC8011 Section 5.1.3](https://tools.ietf.org/html/rfc8011#section-5.1.3).
 */
abstract class KeywordOrName {
    abstract val value: String
    abstract val tag: Tag
    abstract val language: String?

    /** A factory for keyword-or-name objects */
    interface Factory<out T : KeywordOrName> {
        /** Return a new Keyword instance */
        fun of(value: String, tag: Tag, language: String?): T
    }

    override fun toString() = value
}
