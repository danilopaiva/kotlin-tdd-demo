package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals


//Class

/*
    private = means visible inside this class only (including all its members);
    protected = same as private + visible in subclasses too;
    internal = any client inside this module who sees the declaring class sees its internal members;
    public = any client who sees the declaring class sees its public members.
    sealed = in the same file

*/
open class NiceClass {
    open fun method() {}
}

open class NiceClassImpl(value: Int = 0) : NiceClass() {

    constructor(a: Int, b: Int) : this(a * b)

    init {
        println("Value: $value")
    }

    var a: Int = 0
        get() = field * 2
        set(value) {
            field = value * 2
        }

    val b: Int by lazy {
        println("b lazy init")
        value
    }


    override fun method() {
        //do something
    }

    companion object {
        const val PI = 3.14

        fun method2(){}
    }
}

interface NiceInterface {
    fun method() {

    }
}

enum class NiceEnum {
    LEFT,
    RIGHT
}

abstract class NiceAbstractClass {

}


class Topic4 {

    @Test
    fun `by lazy`() {
        val niceClass = NiceClassImpl(10, 10)
        assertEquals(100, niceClass.b)
        assertEquals(100, niceClass.b)
        assertEquals(100, niceClass.b)
    }


    //Data class

    @Test
    fun `default value`() {
        Fan(
            "joao",
            Team.OTHER
        )
    }

    @Test
    fun `properties in any order`() {
        Fan(
            name = "joao",
            team = Team.OTHER
        )


        Fan(
            id = "undefined",
            name = "joao",
            team = Team.ATLETICO_MINEIRO
        )
    }

    @Test
    fun `methods in data class`() {
        val fan = Fan("joao", Team.CRUZEIRO)
        fan.equals("")
        fan.toString()
        fan.hashCode()
        fan.copy()
    }

    //no set and get
    @Test
    fun `update properties`() {
        val fan = Fan("joao", Team.OTHER)
        //fan.name = "paulo" //compilation error
        fan.nickname = "crazy"
    }

    @Test
    fun `copy example`() {
        val fan = Fan("joao", Team.CRUZEIRO)
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