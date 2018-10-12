package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class Topic4 {

    @Test
    fun `methods in data class`() {
        val fan = Fan("joao", Team("Something"))
        fan.equals("")
        fan.toString()
        fan.hashCode()
        fan.copy()
    }

    @Test
    fun `update properties`() {
        val fan = Fan("joao", Team("Something"))
        //fan.name = "paulo" //compilation error
        fan.nickname = "crazy"
    }

    @Test
    fun `copy example`() {
        val fan = Fan("joao", Team("Something"))
        val fan2 = fan.copy(name = "Paulo")

        assertEquals(fan.id, fan2.id)
    }

    @Test
    fun `qualified this`() {
        class A {

            val name = "A"

            inner class B {

                val name = "B"

                val a = this@A.name
                val b = this.name
            }
        }
    }
}