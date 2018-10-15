package com.github.danilopaiva.demo.kotlin

import org.junit.Test

class Topic13 {

    private fun myAge(age: Int = 1, myFunc: (age: Int) -> Int): Int {
        return myFunc(age)
    }

    private fun myAge2(age: Int = 0, name: String = "name", myFunc: (age: Int, name: String) -> Int): Int {
        return myFunc(age, name)
    }

    @Test
    fun `my age 1`() {

        myAge(10, { age -> age * 2 })





        myAge(10, { it * 2 })





        myAge(10) { it * 2 }





        myAge { it * 2 }

    }

    @Test
    fun `my age 2`() {
        myAge2 { age, name -> age * 2 }

        myAge2 { age, _ -> age * 2 }
    }
}