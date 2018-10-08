package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Topic2 {

    @Test
    fun `type inference`() {
        val a: Int = 1 // it's not necessary
        val b = 2
        val c = "this is a string"

        assertTrue(a is Int)
        assertTrue(b is Int)
        assertTrue(c is String)
    }

    @Test
    fun `mutable and immutable variables`() {
        var a = 1 //mutable
        val b = 1 //immutable

        a += 1
        //b += 1 // val cannot be reassigned

        assertEquals(2, a)
        assertEquals(1, b)
    }
}