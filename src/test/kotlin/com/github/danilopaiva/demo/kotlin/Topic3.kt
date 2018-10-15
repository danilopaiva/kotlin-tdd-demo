package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class Topic3 {

    //One line function

    private fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    private fun sum2(a: Int, b: Int) = a + b

    @Test
    fun `sum1 and sum2 are equals`() {
        val sum1 = sum1(1, 1)
        val sum2 = sum2(1, 1)
        assertEquals(sum1, sum2)
    }


    //put default values
    private fun method(a: Int, b: String = "something") {
        println("Variables A: $a and B: $b")
    }


    @Test
    fun `no overload`() {
        method(1, "b")

        method(2)
    }

    @Test
    fun `call in any order`() {
        method(a = 1, b = "b")

        method(b = "b", a = 2)

        method(a = 3)

        //method(b = "B") //Compilation error
    }
}