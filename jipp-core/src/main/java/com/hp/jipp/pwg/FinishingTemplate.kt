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
 * "finishing-template" keyword as defined in:
 *   * [CANON-PUNCHING](http://www.pwg.org/pipermail/ipp/2016/018825.html)
 *   * [IPP-JOG-OFFSET](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20170214.pdf)
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *
 * Also used by:
 *   * `finishing-template-supported`
 */
data class FinishingTemplate(
    override val value: String,
    override val tag: Tag = Tag.keyword,
    override val language: String? = null
) : KeywordOrName() {

    constructor(value: String): this(value, Tag.keyword)

    override fun toString() = value

    /** An attribute type for [FinishingTemplate] attributes */
    class Type(name: String) : KeywordType<FinishingTemplate>(Encoder, name)

    companion object {
        @JvmField val bale = FinishingTemplate("bale")
        @JvmField val bind = FinishingTemplate("bind")
        @JvmField val bindBottom = FinishingTemplate("bind-bottom")
        @JvmField val bindLeft = FinishingTemplate("bind-left")
        @JvmField val bindRight = FinishingTemplate("bind-right")
        @JvmField val bindTop = FinishingTemplate("bind-top")
        @JvmField val bookletMaker = FinishingTemplate("booklet-maker")
        @JvmField val coat = FinishingTemplate("coat")
        @JvmField val cover = FinishingTemplate("cover")
        @JvmField val edgeStitch = FinishingTemplate("edge-stitch")
        @JvmField val edgeStitchBottom = FinishingTemplate("edge-stitch-bottom")
        @JvmField val edgeStitchLeft = FinishingTemplate("edge-stitch-left")
        @JvmField val edgeStitchRight = FinishingTemplate("edge-stitch-right")
        @JvmField val edgeStitchTop = FinishingTemplate("edge-stitch-top")
        @JvmField val fold = FinishingTemplate("fold")
        @JvmField val foldAccordion = FinishingTemplate("fold-accordion")
        @JvmField val foldDoubleGate = FinishingTemplate("fold-double-gate")
        @JvmField val foldEngineeringZ = FinishingTemplate("fold-engineering-z")
        @JvmField val foldGate = FinishingTemplate("fold-gate")
        @JvmField val foldHalf = FinishingTemplate("fold-half")
        @JvmField val foldHalfZ = FinishingTemplate("fold-half-z")
        @JvmField val foldLeftGate = FinishingTemplate("fold-left-gate")
        @JvmField val foldLetter = FinishingTemplate("fold-letter")
        @JvmField val foldParallel = FinishingTemplate("fold-parallel")
        @JvmField val foldPoster = FinishingTemplate("fold-poster")
        @JvmField val foldRightGate = FinishingTemplate("fold-right-gate")
        @JvmField val foldZ = FinishingTemplate("fold-z")
        @JvmField val jdfF101 = FinishingTemplate("jdf-f10-1")
        @JvmField val jdfF102 = FinishingTemplate("jdf-f10-2")
        @JvmField val jdfF103 = FinishingTemplate("jdf-f10-3")
        @JvmField val jdfF121 = FinishingTemplate("jdf-f12-1")
        @JvmField val jdfF1210 = FinishingTemplate("jdf-f12-10")
        @JvmField val jdfF1211 = FinishingTemplate("jdf-f12-11")
        @JvmField val jdfF1212 = FinishingTemplate("jdf-f12-12")
        @JvmField val jdfF1213 = FinishingTemplate("jdf-f12-13")
        @JvmField val jdfF1214 = FinishingTemplate("jdf-f12-14")
        @JvmField val jdfF122 = FinishingTemplate("jdf-f12-2")
        @JvmField val jdfF123 = FinishingTemplate("jdf-f12-3")
        @JvmField val jdfF124 = FinishingTemplate("jdf-f12-4")
        @JvmField val jdfF125 = FinishingTemplate("jdf-f12-5")
        @JvmField val jdfF126 = FinishingTemplate("jdf-f12-6")
        @JvmField val jdfF127 = FinishingTemplate("jdf-f12-7")
        @JvmField val jdfF128 = FinishingTemplate("jdf-f12-8")
        @JvmField val jdfF129 = FinishingTemplate("jdf-f12-9")
        @JvmField val jdfF141 = FinishingTemplate("jdf-f14-1")
        @JvmField val jdfF161 = FinishingTemplate("jdf-f16-1")
        @JvmField val jdfF1610 = FinishingTemplate("jdf-f16-10")
        @JvmField val jdfF1611 = FinishingTemplate("jdf-f16-11")
        @JvmField val jdfF1612 = FinishingTemplate("jdf-f16-12")
        @JvmField val jdfF1613 = FinishingTemplate("jdf-f16-13")
        @JvmField val jdfF1614 = FinishingTemplate("jdf-f16-14")
        @JvmField val jdfF162 = FinishingTemplate("jdf-f16-2")
        @JvmField val jdfF163 = FinishingTemplate("jdf-f16-3")
        @JvmField val jdfF164 = FinishingTemplate("jdf-f16-4")
        @JvmField val jdfF165 = FinishingTemplate("jdf-f16-5")
        @JvmField val jdfF166 = FinishingTemplate("jdf-f16-6")
        @JvmField val jdfF167 = FinishingTemplate("jdf-f16-7")
        @JvmField val jdfF168 = FinishingTemplate("jdf-f16-8")
        @JvmField val jdfF169 = FinishingTemplate("jdf-f16-9")
        @JvmField val jdfF181 = FinishingTemplate("jdf-f18-1")
        @JvmField val jdfF182 = FinishingTemplate("jdf-f18-2")
        @JvmField val jdfF183 = FinishingTemplate("jdf-f18-3")
        @JvmField val jdfF184 = FinishingTemplate("jdf-f18-4")
        @JvmField val jdfF185 = FinishingTemplate("jdf-f18-5")
        @JvmField val jdfF186 = FinishingTemplate("jdf-f18-6")
        @JvmField val jdfF187 = FinishingTemplate("jdf-f18-7")
        @JvmField val jdfF188 = FinishingTemplate("jdf-f18-8")
        @JvmField val jdfF189 = FinishingTemplate("jdf-f18-9")
        @JvmField val jdfF21 = FinishingTemplate("jdf-f2-1")
        @JvmField val jdfF201 = FinishingTemplate("jdf-f20-1")
        @JvmField val jdfF202 = FinishingTemplate("jdf-f20-2")
        @JvmField val jdfF241 = FinishingTemplate("jdf-f24-1")
        @JvmField val jdfF2410 = FinishingTemplate("jdf-f24-10")
        @JvmField val jdfF2411 = FinishingTemplate("jdf-f24-11")
        @JvmField val jdfF242 = FinishingTemplate("jdf-f24-2")
        @JvmField val jdfF243 = FinishingTemplate("jdf-f24-3")
        @JvmField val jdfF244 = FinishingTemplate("jdf-f24-4")
        @JvmField val jdfF245 = FinishingTemplate("jdf-f24-5")
        @JvmField val jdfF246 = FinishingTemplate("jdf-f24-6")
        @JvmField val jdfF247 = FinishingTemplate("jdf-f24-7")
        @JvmField val jdfF248 = FinishingTemplate("jdf-f24-8")
        @JvmField val jdfF249 = FinishingTemplate("jdf-f24-9")
        @JvmField val jdfF281 = FinishingTemplate("jdf-f28-1")
        @JvmField val jdfF321 = FinishingTemplate("jdf-f32-1")
        @JvmField val jdfF322 = FinishingTemplate("jdf-f32-2")
        @JvmField val jdfF323 = FinishingTemplate("jdf-f32-3")
        @JvmField val jdfF324 = FinishingTemplate("jdf-f32-4")
        @JvmField val jdfF325 = FinishingTemplate("jdf-f32-5")
        @JvmField val jdfF326 = FinishingTemplate("jdf-f32-6")
        @JvmField val jdfF327 = FinishingTemplate("jdf-f32-7")
        @JvmField val jdfF328 = FinishingTemplate("jdf-f32-8")
        @JvmField val jdfF329 = FinishingTemplate("jdf-f32-9")
        @JvmField val jdfF361 = FinishingTemplate("jdf-f36-1")
        @JvmField val jdfF362 = FinishingTemplate("jdf-f36-2")
        @JvmField val jdfF41 = FinishingTemplate("jdf-f4-1")
        @JvmField val jdfF42 = FinishingTemplate("jdf-f4-2")
        @JvmField val jdfF401 = FinishingTemplate("jdf-f40-1")
        @JvmField val jdfF481 = FinishingTemplate("jdf-f48-1")
        @JvmField val jdfF482 = FinishingTemplate("jdf-f48-2")
        @JvmField val jdfF61 = FinishingTemplate("jdf-f6-1")
        @JvmField val jdfF62 = FinishingTemplate("jdf-f6-2")
        @JvmField val jdfF63 = FinishingTemplate("jdf-f6-3")
        @JvmField val jdfF64 = FinishingTemplate("jdf-f6-4")
        @JvmField val jdfF65 = FinishingTemplate("jdf-f6-5")
        @JvmField val jdfF66 = FinishingTemplate("jdf-f6-6")
        @JvmField val jdfF67 = FinishingTemplate("jdf-f6-7")
        @JvmField val jdfF68 = FinishingTemplate("jdf-f6-8")
        @JvmField val jdfF641 = FinishingTemplate("jdf-f64-1")
        @JvmField val jdfF642 = FinishingTemplate("jdf-f64-2")
        @JvmField val jdfF81 = FinishingTemplate("jdf-f8-1")
        @JvmField val jdfF82 = FinishingTemplate("jdf-f8-2")
        @JvmField val jdfF83 = FinishingTemplate("jdf-f8-3")
        @JvmField val jdfF84 = FinishingTemplate("jdf-f8-4")
        @JvmField val jdfF85 = FinishingTemplate("jdf-f8-5")
        @JvmField val jdfF86 = FinishingTemplate("jdf-f8-6")
        @JvmField val jdfF87 = FinishingTemplate("jdf-f8-7")
        @JvmField val jogOffset = FinishingTemplate("jog-offset")
        @JvmField val laminate = FinishingTemplate("laminate")
        @JvmField val punch = FinishingTemplate("punch")
        @JvmField val punchBottomLeft = FinishingTemplate("punch-bottom-left")
        @JvmField val punchBottomRight = FinishingTemplate("punch-bottom-right")
        @JvmField val punchDualBottom = FinishingTemplate("punch-dual-bottom")
        @JvmField val punchDualLeft = FinishingTemplate("punch-dual-left")
        @JvmField val punchDualRight = FinishingTemplate("punch-dual-right")
        @JvmField val punchDualTop = FinishingTemplate("punch-dual-top")
        @JvmField val punchMultipleBottom = FinishingTemplate("punch-multiple-bottom")
        @JvmField val punchMultipleLeft = FinishingTemplate("punch-multiple-left")
        @JvmField val punchMultipleRight = FinishingTemplate("punch-multiple-right")
        @JvmField val punchMultipleTop = FinishingTemplate("punch-multiple-top")
        @JvmField val punchQuadBottom = FinishingTemplate("punch-quad-bottom")
        @JvmField val punchQuadLeft = FinishingTemplate("punch-quad-left")
        @JvmField val punchQuadRight = FinishingTemplate("punch-quad-right")
        @JvmField val punchQuadTop = FinishingTemplate("punch-quad-top")
        @JvmField val punchTopLeft = FinishingTemplate("punch-top-left")
        @JvmField val punchTopRight = FinishingTemplate("punch-top-right")
        @JvmField val punchTripleBottom = FinishingTemplate("punch-triple-bottom")
        @JvmField val punchTripleLeft = FinishingTemplate("punch-triple-left")
        @JvmField val punchTripleRight = FinishingTemplate("punch-triple-right")
        @JvmField val punchTripleTop = FinishingTemplate("punch-triple-top")
        @JvmField val saddleStitch = FinishingTemplate("saddle-stitch")
        @JvmField val staple = FinishingTemplate("staple")
        @JvmField val stapleBottomLeft = FinishingTemplate("staple-bottom-left")
        @JvmField val stapleBottomRight = FinishingTemplate("staple-bottom-right")
        @JvmField val stapleDualBottom = FinishingTemplate("staple-dual-bottom")
        @JvmField val stapleDualLeft = FinishingTemplate("staple-dual-left")
        @JvmField val stapleDualRight = FinishingTemplate("staple-dual-right")
        @JvmField val stapleDualTop = FinishingTemplate("staple-dual-top")
        @JvmField val stapleTopLeft = FinishingTemplate("staple-top-left")
        @JvmField val stapleTopRight = FinishingTemplate("staple-top-right")
        @JvmField val stapleTripleBottom = FinishingTemplate("staple-triple-bottom")
        @JvmField val stapleTripleLeft = FinishingTemplate("staple-triple-left")
        @JvmField val stapleTripleRight = FinishingTemplate("staple-triple-right")
        @JvmField val stapleTripleTop = FinishingTemplate("staple-triple-top")
        @JvmField val trim = FinishingTemplate("trim")
        @JvmField val trimAfterCopies = FinishingTemplate("trim-after-copies")
        @JvmField val trimAfterDocuments = FinishingTemplate("trim-after-documents")
        @JvmField val trimAfterJob = FinishingTemplate("trim-after-job")
        @JvmField val trimAfterPages = FinishingTemplate("trim-after-pages")
        @JvmField val Encoder = KeywordType.encoderOf(FinishingTemplate::class.java) { value, tag, language ->
            FinishingTemplate(value, tag, language)
        }
    }
}
