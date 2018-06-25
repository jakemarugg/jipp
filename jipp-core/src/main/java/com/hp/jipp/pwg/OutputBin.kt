// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.KeywordOrName
import com.hp.jipp.encoding.KeywordType
import com.hp.jipp.encoding.Tag

/**
 * "output-bin" keyword as defined in:
 *   * [APPLE-OUTPUT-BIN](http://www.pwg.org/pipermail/ipp/2016/018950.html)
 *   * [PWG5100.2](http://ftp.pwg.org/pub/pwg/candidates/cs-ippoutputbin10-20010207-5100.2.pdf)
 *
 * Also used by:
 *   * `job-accounting-output-bin`
 *   * `output-bin-default`
 *   * `output-bin-supported`
 */
data class OutputBin(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [OutputBin] attributes */
    class Type(name: String) : KeywordType<OutputBin>(Encoder, name)

    companion object {
        @JvmField val auto = OutputBin("auto")
        @JvmField val bottom = OutputBin("bottom")
        @JvmField val center = OutputBin("center")
        @JvmField val faceDown = OutputBin("face-down")
        @JvmField val faceUp = OutputBin("face-up")
        @JvmField val largeCapacity = OutputBin("large-capacity")
        @JvmField val left = OutputBin("left")
        @JvmField val mailbox1 = OutputBin("mailbox-1")
        @JvmField val mailbox10 = OutputBin("mailbox-10")
        @JvmField val mailbox2 = OutputBin("mailbox-2")
        @JvmField val mailbox3 = OutputBin("mailbox-3")
        @JvmField val mailbox4 = OutputBin("mailbox-4")
        @JvmField val mailbox5 = OutputBin("mailbox-5")
        @JvmField val mailbox6 = OutputBin("mailbox-6")
        @JvmField val mailbox7 = OutputBin("mailbox-7")
        @JvmField val mailbox8 = OutputBin("mailbox-8")
        @JvmField val mailbox9 = OutputBin("mailbox-9")
        @JvmField val middle = OutputBin("middle")
        @JvmField val myMailbox = OutputBin("my-mailbox")
        @JvmField val rear = OutputBin("rear")
        @JvmField val right = OutputBin("right")
        @JvmField val side = OutputBin("side")
        @JvmField val stacker1 = OutputBin("stacker-1")
        @JvmField val stacker10 = OutputBin("stacker-10")
        @JvmField val stacker2 = OutputBin("stacker-2")
        @JvmField val stacker3 = OutputBin("stacker-3")
        @JvmField val stacker4 = OutputBin("stacker-4")
        @JvmField val stacker5 = OutputBin("stacker-5")
        @JvmField val stacker6 = OutputBin("stacker-6")
        @JvmField val stacker7 = OutputBin("stacker-7")
        @JvmField val stacker8 = OutputBin("stacker-8")
        @JvmField val stacker9 = OutputBin("stacker-9")
        @JvmField val top = OutputBin("top")
        @JvmField val tray1 = OutputBin("tray-1")
        @JvmField val tray10 = OutputBin("tray-10")
        @JvmField val tray2 = OutputBin("tray-2")
        @JvmField val tray3 = OutputBin("tray-3")
        @JvmField val tray4 = OutputBin("tray-4")
        @JvmField val tray5 = OutputBin("tray-5")
        @JvmField val tray6 = OutputBin("tray-6")
        @JvmField val tray7 = OutputBin("tray-7")
        @JvmField val tray8 = OutputBin("tray-8")
        @JvmField val tray9 = OutputBin("tray-9")
        @JvmField val Encoder = KeywordType.encoderOf(OutputBin::class.java) { value, tag, language ->
            OutputBin(value, tag, language)
        }
    }
}