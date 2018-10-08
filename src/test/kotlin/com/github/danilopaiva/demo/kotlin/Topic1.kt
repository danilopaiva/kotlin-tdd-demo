package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class Topic1 {

    /*private fun sum(a: Int, b: Int): Int {
        return a + b
    }*/

    private fun sum(a: Int, b: Int) = a + b

    @Test
    fun `one plus one equals two`() {
        val result = sum(a = 1, b = 1)
        assertEquals(2, result)
    }
}