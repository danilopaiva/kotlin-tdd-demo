package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class Topic6 {

    @Test
    fun `look this name`() {
        assertTrue {
            true
        }
    }

    @Test
    fun `test with exception`() {
        assertFailsWith<ArithmeticException> {
            2 / 0
        }
    }

    @Test
    fun `to do functions`() {
        assertFailsWith<NotImplementedError> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    @Test
    fun `measure time`() {
        val x = measureTimeMillis {
            Thread.sleep(1000)
        }

        val y = measureNanoTime {
            Thread.sleep(1000)
        }

        assertTrue(x >= 1000)
        assertTrue(y >= 1000)
    }

    @Test
    fun `test deprecated`() {
        badBoy()
    }

    @Deprecated(
        "You don't be a bad boy!",
        level = DeprecationLevel.WARNING,
        replaceWith = ReplaceWith("goodBoy()")
    )
    private fun badBoy() {
    }

    private fun goodBoy() {}


    // Erasing Erasure
    @Test
    fun `erasing erasure`() {
        sum(listOf(1, 2))

        sum(listOf(3L, 4L))
    }

    @JvmName("sumInt")
    private fun sum(list: List<Int>) {
        println("sum a int list $list")
    }

    @JvmName("sumLong")
    private fun sum(list: List<Long>) {
        println("sum a long list $list")
    }

}