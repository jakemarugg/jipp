// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2018-04-06
@file:Suppress("MaxLineLength")

package com.hp.jipp.pwg

import com.hp.jipp.encoding.Enum
import com.hp.jipp.encoding.EnumType

/**
 * "finishings" enum as defined in:
 *   * [CANON-PUNCHING](http://www.pwg.org/pipermail/ipp/2016/018825.html)
 *   * [IPP-JOG-OFFSET](http://ftp.pwg.org/pub/pwg/ipp/minutes/ippv2-f2f-minutes-20170214.pdf)
 *   * [PWG5100.1](http://ftp.pwg.org/pub/pwg/candidates/cs-ippfinishings10-20010205-5100.1.pdf)
 *   * [PWG5100.13](http://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf)
 *   * [RFC8011](http://www.iana.org/go/rfc8011)
 *
 * Also used by:
 *   * `finishings-default`
 *   * `finishings-ready`
 *   * `finishings-supported`
 *   * `job-finishings`
 *   * `job-finishings-default`
 *   * `job-finishings-ready`
 *   * `job-finishings-supported`
 */
data class Finishings(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An attribute type for [Finishings] attributes */
    class Type(name: String) : EnumType<Finishings>(Encoder, name)

    object Code {
        const val none = 3
        const val staple = 4
        const val punch = 5
        const val cover = 6
        const val bind = 7
        const val saddleStitch = 8
        const val edgeStitch = 9
        const val fold = 10
        const val trim = 11
        const val bale = 12
        const val bookletMaker = 13
        const val jogOffset = 14
        const val coat = 15
        const val laminate = 16
        const val stapleTopLeft = 20
        const val stapleBottomLeft = 21
        const val stapleTopRight = 22
        const val stapleBottomRight = 23
        const val edgeStitchLeft = 24
        const val edgeStitchTop = 25
        const val edgeStitchRight = 26
        const val edgeStitchBottom = 27
        const val stapleDualLeft = 28
        const val stapleDualTop = 29
        const val stapleDualRight = 30
        const val stapleDualBottom = 31
        const val stapleTripleLeft = 32
        const val stapleTripleTop = 33
        const val stapleTripleRight = 34
        const val stapleTripleBottom = 35
        const val bindLeft = 50
        const val bindTop = 51
        const val bindRight = 52
        const val bindBottom = 53
        const val trimAfterPages = 60
        const val trimAfterDocuments = 61
        const val trimAfterCopies = 62
        const val trimAfterJob = 63
        const val punchTopLeft = 70
        const val punchBottomLeft = 71
        const val punchTopRight = 72
        const val punchBottomRight = 73
        const val punchDualLeft = 74
        const val punchDualTop = 75
        const val punchDualRight = 76
        const val punchDualBottom = 77
        const val punchTripleLeft = 78
        const val punchTripleTop = 79
        const val punchTripleRight = 80
        const val punchTripleBottom = 81
        const val punchQuadLeft = 82
        const val punchQuadTop = 83
        const val punchQuadRight = 84
        const val punchQuadBottom = 85
        const val punchMultipleLeft = 86
        const val punchMultipleTop = 87
        const val punchMultipleRight = 88
        const val punchMultipleBottom = 89
        const val foldAccordion = 90
        const val foldDoubleGate = 91
        const val foldGate = 92
        const val foldHalf = 93
        const val foldHalfZ = 94
        const val foldLeftGate = 95
        const val foldLetter = 96
        const val foldParallel = 97
        const val foldPoster = 98
        const val foldRightGate = 99
        const val foldZ = 100
        const val foldEngineeringZ = 101
    }

    companion object {
        @JvmField val none = Finishings(Code.none, "none")
        @JvmField val staple = Finishings(Code.staple, "staple")
        @JvmField val punch = Finishings(Code.punch, "punch")
        @JvmField val cover = Finishings(Code.cover, "cover")
        @JvmField val bind = Finishings(Code.bind, "bind")
        @JvmField val saddleStitch = Finishings(Code.saddleStitch, "saddle-stitch")
        @JvmField val edgeStitch = Finishings(Code.edgeStitch, "edge-stitch")
        @JvmField val fold = Finishings(Code.fold, "fold")
        @JvmField val trim = Finishings(Code.trim, "trim")
        @JvmField val bale = Finishings(Code.bale, "bale")
        @JvmField val bookletMaker = Finishings(Code.bookletMaker, "booklet-maker")
        @JvmField val jogOffset = Finishings(Code.jogOffset, "jog-offset")
        @JvmField val coat = Finishings(Code.coat, "coat")
        @JvmField val laminate = Finishings(Code.laminate, "laminate")
        @JvmField val stapleTopLeft = Finishings(Code.stapleTopLeft, "staple-top-left")
        @JvmField val stapleBottomLeft = Finishings(Code.stapleBottomLeft, "staple-bottom-left")
        @JvmField val stapleTopRight = Finishings(Code.stapleTopRight, "staple-top-right")
        @JvmField val stapleBottomRight = Finishings(Code.stapleBottomRight, "staple-bottom-right")
        @JvmField val edgeStitchLeft = Finishings(Code.edgeStitchLeft, "edge-stitch-left")
        @JvmField val edgeStitchTop = Finishings(Code.edgeStitchTop, "edge-stitch-top")
        @JvmField val edgeStitchRight = Finishings(Code.edgeStitchRight, "edge-stitch-right")
        @JvmField val edgeStitchBottom = Finishings(Code.edgeStitchBottom, "edge-stitch-bottom")
        @JvmField val stapleDualLeft = Finishings(Code.stapleDualLeft, "staple-dual-left")
        @JvmField val stapleDualTop = Finishings(Code.stapleDualTop, "staple-dual-top")
        @JvmField val stapleDualRight = Finishings(Code.stapleDualRight, "staple-dual-right")
        @JvmField val stapleDualBottom = Finishings(Code.stapleDualBottom, "staple-dual-bottom")
        @JvmField val stapleTripleLeft = Finishings(Code.stapleTripleLeft, "staple-triple-left")
        @JvmField val stapleTripleTop = Finishings(Code.stapleTripleTop, "staple-triple-top")
        @JvmField val stapleTripleRight = Finishings(Code.stapleTripleRight, "staple-triple-right")
        @JvmField val stapleTripleBottom = Finishings(Code.stapleTripleBottom, "staple-triple-bottom")
        @JvmField val bindLeft = Finishings(Code.bindLeft, "bind-left")
        @JvmField val bindTop = Finishings(Code.bindTop, "bind-top")
        @JvmField val bindRight = Finishings(Code.bindRight, "bind-right")
        @JvmField val bindBottom = Finishings(Code.bindBottom, "bind-bottom")
        @JvmField val trimAfterPages = Finishings(Code.trimAfterPages, "trim-after-pages")
        @JvmField val trimAfterDocuments = Finishings(Code.trimAfterDocuments, "trim-after-documents")
        @JvmField val trimAfterCopies = Finishings(Code.trimAfterCopies, "trim-after-copies")
        @JvmField val trimAfterJob = Finishings(Code.trimAfterJob, "trim-after-job")
        @JvmField val punchTopLeft = Finishings(Code.punchTopLeft, "punch-top-left")
        @JvmField val punchBottomLeft = Finishings(Code.punchBottomLeft, "punch-bottom-left")
        @JvmField val punchTopRight = Finishings(Code.punchTopRight, "punch-top-right")
        @JvmField val punchBottomRight = Finishings(Code.punchBottomRight, "punch-bottom-right")
        @JvmField val punchDualLeft = Finishings(Code.punchDualLeft, "punch-dual-left")
        @JvmField val punchDualTop = Finishings(Code.punchDualTop, "punch-dual-top")
        @JvmField val punchDualRight = Finishings(Code.punchDualRight, "punch-dual-right")
        @JvmField val punchDualBottom = Finishings(Code.punchDualBottom, "punch-dual-bottom")
        @JvmField val punchTripleLeft = Finishings(Code.punchTripleLeft, "punch-triple-left")
        @JvmField val punchTripleTop = Finishings(Code.punchTripleTop, "punch-triple-top")
        @JvmField val punchTripleRight = Finishings(Code.punchTripleRight, "punch-triple-right")
        @JvmField val punchTripleBottom = Finishings(Code.punchTripleBottom, "punch-triple-bottom")
        @JvmField val punchQuadLeft = Finishings(Code.punchQuadLeft, "punch-quad-left")
        @JvmField val punchQuadTop = Finishings(Code.punchQuadTop, "punch-quad-top")
        @JvmField val punchQuadRight = Finishings(Code.punchQuadRight, "punch-quad-right")
        @JvmField val punchQuadBottom = Finishings(Code.punchQuadBottom, "punch-quad-bottom")
        @JvmField val punchMultipleLeft = Finishings(Code.punchMultipleLeft, "punch-multiple-left")
        @JvmField val punchMultipleTop = Finishings(Code.punchMultipleTop, "punch-multiple-top")
        @JvmField val punchMultipleRight = Finishings(Code.punchMultipleRight, "punch-multiple-right")
        @JvmField val punchMultipleBottom = Finishings(Code.punchMultipleBottom, "punch-multiple-bottom")
        @JvmField val foldAccordion = Finishings(Code.foldAccordion, "fold-accordion")
        @JvmField val foldDoubleGate = Finishings(Code.foldDoubleGate, "fold-double-gate")
        @JvmField val foldGate = Finishings(Code.foldGate, "fold-gate")
        @JvmField val foldHalf = Finishings(Code.foldHalf, "fold-half")
        @JvmField val foldHalfZ = Finishings(Code.foldHalfZ, "fold-half-z")
        @JvmField val foldLeftGate = Finishings(Code.foldLeftGate, "fold-left-gate")
        @JvmField val foldLetter = Finishings(Code.foldLetter, "fold-letter")
        @JvmField val foldParallel = Finishings(Code.foldParallel, "fold-parallel")
        @JvmField val foldPoster = Finishings(Code.foldPoster, "fold-poster")
        @JvmField val foldRightGate = Finishings(Code.foldRightGate, "fold-right-gate")
        @JvmField val foldZ = Finishings(Code.foldZ, "fold-z")
        @JvmField val foldEngineeringZ = Finishings(Code.foldEngineeringZ, "fold-engineering-z")

        @JvmField val Encoder = EnumType.Encoder(Finishings::class.java) { code, name ->
            Finishings(code, name)
        }
    }
}