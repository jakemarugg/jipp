package com.hp.jipp.util

import org.junit.Test

import org.junit.Assert.*

class AsyncTestKt {
    private val boom = RuntimeException("ha")

    @Test
    fun execute() {
        assertEquals(Integer.valueOf(5), Async.work { 5 }.get(DELAY))
    }

    @Test
    fun map() {
        assertEquals(Integer.valueOf(6), Async.work { 5 }.map { it + 1 }.get(DELAY))
    }

    @Test
    fun recover() {
        assertEquals(Integer.valueOf(5), Async.work<Int> { throw boom }.recover { _ -> 5 }.get(DELAY))
    }

    @Test
    fun recoverUnneeded() {
        assertEquals(Integer.valueOf(4), Async.work { 4 }.recover { _ -> 5 }.get(DELAY))
    }

    companion object {
        private val DELAY = 500L
    }
}