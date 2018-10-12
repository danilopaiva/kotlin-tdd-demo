package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertTrue

class Topic8 {

    @Test
    fun `structural equality (equals)`() {
        val a = "opa"
        val b = "opa"

        //assertTrue(a.equals(b))
        assertTrue(a == b)
    }

    @Test
    fun `structural equality (not equals)`() {
        val a = "a"
        val b = "b"

        //assertTrue(!a.equals(b))
        assertTrue(a != b)
    }

    @Test
    fun `referential equality`() {
        val a = "a"
        var b = a

        assertTrue(a === b)

        b = "b"

        assertTrue(a !== b)
    }
}