package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Topic10 {

    @Test
    fun `empty list`() {
        val list = emptyList<Int>()
        assertTrue(list.isEmpty())
    }

    @Test
    fun `new list`() {
        val list = listOf(1, 2, 3)
        //list[0] = 2 //compilation error! Use mutableListOf
        assertEquals(3, list.size)
    }

    @Test
    fun `mutable list`() {
        val list = mutableListOf(1, 2, 3)
        list[0] = 2
        assertEquals(3, list.size)
        assertTrue(list[0] == 2)
    }

    @Test
    fun `mutable map`() {
        val map = mutableMapOf("a" to 1, "b" to 2)
        map["c"] = 3
        assertEquals(3, map.size)
        assertTrue(map["b"] == 2)
    }

    @Test
    fun `ranges with for and if`() {
        val numbers = (1..10)
        for (i in numbers) {
            if (i in 3..5) {
                println(i)
            }
        }
        //3,4,5
    }

    @Test
    fun `ranges with downTo`() {
        for (i in 4 downTo 1) {
            println(i)
        }
        //4,3,2,1
    }

    @Test
    fun `ranges with step`() {
        for (i in 1..6 step 2) {
            println(i)
        }
        //1,3,5
    }

    @Test
    fun `ranges with downTo and step`() {
        for (i in 6 downTo 1 step 2) {
            println(i)
        }
        //6,4,2
    }
}