package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertTrue

fun Int.myPlus(number: Int): Int =
    this.plus(number)

class ExtensionFunction {

    @Test
    fun `extension function`() {
        assertTrue {
            10.myPlus(10) == 20
        }
    }

    @Test
    fun `extension function infix`() {
        assertTrue {
            "aaa" myEquals "AaA"
        }
    }

    @Test
    fun `other example about infix`() {
        mapOf(1 to "a")
    }
}

infix fun String.myEquals(other: String): Boolean =
    this.toUpperCase() == other.toUpperCase()