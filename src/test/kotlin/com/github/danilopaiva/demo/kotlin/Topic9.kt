package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertTrue

class Topic9 {

    @Test
    fun `is operator`() {
        val obj: Any? = ""

        if (obj is String) { //Smart cast
            obj.toUpperCase() //Doesn't use ?
        }
    }

    @Test
    fun `!is operator`() {
        val obj: Any? = 1

        if (obj !is String) {
            print("Not a String")
            assertTrue(obj is Int)
        }
    }

    @Test
    fun `smart cast`() {
        val x: Any? = 10
        when (x) {
            is Int -> {
                println("Int: ${x.plus(10)}")
            }
            is String -> {
                println("String: ${x.toUpperCase()}")
            }
        }
    }

    @Test
    fun `unsafe cast operator`() {
        val x: Any? = ""
        val y: String? = x as String
        assertTrue(y is String)
    }

    @Test
    fun `safe cast operator`() {
        val x: Any = 1
        val y: String? = x as? String
        assertTrue(y == null)
    }
}