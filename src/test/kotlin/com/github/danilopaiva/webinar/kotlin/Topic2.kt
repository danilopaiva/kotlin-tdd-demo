package com.github.danilopaiva.webinar.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
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
        val b = 1

        a += 1
        //b += 1 // val cannot be reassigned

        assertEquals(2, a)
        assertEquals(1, b)
    }

    @Test
    fun `nullable variable`() {
        val x: String? = null
        assertNull(x)
    }

    @Test
    fun `check null`() {
        val a: String? = null
        val b = "something"
        val c: String?

        c = if (a == null) {
            b
        } else {
            null
        }

        assertEquals(b, c)
    }

    @Test
    fun `elvis operator`() {
        val a: String? = null
        val b = "something"
        val c = a?.toUpperCase() ?: b

        assertEquals(b, c)
    }

    @Test(expected = NullPointerException::class)
    fun `throw exception when null`() {
        val a: String? = null
        a!!.toUpperCase()
    }
}