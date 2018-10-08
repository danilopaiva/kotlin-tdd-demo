package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class Topic3 {

    @Test
    fun `declare a variable as nullable`() {
        //val x: String = null //compilation error
        val x: String? = null
        assertNull(x)
    }

    @Test
    fun `checking for null in conditions`() {
        val a: String? = null
        val b = "something"

        val c = if (a == null) { b } else { null }

        assertEquals(b, c)
    }

    @Test
    fun `safe calls`() {
        val x: String? = null
        //println(x.toUpperCase()) //compilation error
        println(x?.toUpperCase())
    }

    @Test
    fun `elvis operator`() {
        val a: String? = null
        val b = "something"
        val c = a?.toUpperCase() ?: b

        assertEquals(b, c)
    }

    @Test(expected = NullPointerException::class)
    fun `the !! operator`() {
        val a: String? = null
        a!!.toUpperCase()
    }
}