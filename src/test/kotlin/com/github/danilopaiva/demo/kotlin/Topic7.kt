package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class Topic7 {

    @Test
    fun `declare a variable as nullable`() {
//        val x: String = null //compilation error
        val x: String? = null
        assertNull(x)
    }

    @Test
    fun `checking for null in conditions`() {
        val a: String? = null
        //a.toUpperCase() //compilation error

        val b = if (a == null) {
            "a is null"
        } else {
            a.toUpperCase()
        }

        assertEquals("a is null", b)
    }

    @Test
    fun `safe calls`() {
        val x: String? = null
        //println(x.toUpperCase())
        println(x?.toUpperCase())
    }

    @Test
    fun `elvis operator`() {
        val a: String? = null
        val b = a?.toUpperCase() ?: "a is null"

        assertEquals("a is null", b)
    }

    @Test
    fun `the !! operator`() {
        val a: String? = null

        assertFailsWith<NullPointerException> {
            a!!.toUpperCase()
        }
    }
}