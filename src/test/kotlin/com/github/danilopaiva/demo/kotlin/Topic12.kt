package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertTrue

class Topic12 {

    /*
        a++ 	a.inc()
        a--	    a.dec()
    */
    @Test
    fun `increments and decrements`() {
        var counter1 = Counter(0)

        counter1++

        assertTrue { counter1.index == 1 }

        counter1--

        assertTrue { counter1.index == 0 }
    }

    /*
            a + b	a.plus(b)
            a - b	a.minus(b)
            a * b	a.times(b)
            a / b	a.div(b)
            a % b	a.rem(b), a.mod(b) (deprecated)
            a..b	a.rangeTo(b)
    */
    @Test
    fun `binary operations`() {
        val counter1 = Counter(1)
        val counter2 = Counter(2)

        val counter3 = counter1 + counter2

        assertTrue { counter3.index == 3 }
    }

    data class Counter(var index: Int) {
        operator fun inc(): Counter {
            this.index++
            return this
        }

        operator fun dec(): Counter {
            this.index--
            return this
        }

        operator fun plus(increment: Counter): Counter {
            return Counter(index + increment.index)
        }
    }
}

