package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Topic14 {

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

    @Test
    fun `concept about list`() {
        emptyList<Int>()

        val list1 = listOf(1, 2)
        val list2 = listOf(3, 4)
        val list3 = list1 + list2

        assertEquals(listOf(1, 2, 3, 4), list3)

//        list3.add(3) //Compiler error!

        val list4 = list3.toMutableList()
        list4.add(5)

        list4.toList()
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
        val map = mutableMapOf(
            Pair("a", 1),
            "b" to 2
        )
        map["c"] = 3
        assertEquals(3, map.size)
        assertTrue(map["b"] == 2)
    }

    @Test
    fun `filter, map, filterIndexed, mapIndexed, first, find, none, any, sum, min, max, reduce, fold, take, drop, slice`() {
        val numbers = (10..20)

        numbers.filter { it % 2 != 0 }


        numbers.filter { it % 2 != 0 }
            .map { it + 1 }

        numbers.filterIndexed { index, i ->
            println("Filter index: $index")
            i % 2 == 0
        }.mapIndexed { index, i ->
            println("Map index: $index")
            i + 1
        }

        numbers.first { it % 2 == 0 } //throw NoSuchElementException

        numbers.find { it == 2000 } ?: println("Not found!")

        numbers.none { it % 2 == 0 }

        numbers.any { it % 2 == 0 }

        numbers.sum()
        numbers.sumBy { it }

        numbers.min()
        numbers.minBy { it }

        numbers.max()
        numbers.maxBy { it }

        numbers.reduce { acc, i ->
            acc + i
        }

        numbers.fold(0, { acc, i -> acc + i })

        numbers.take(1)

        numbers.drop(5)

        numbers.toList().slice(1..3)
    }

    @Test
    fun `sorting and distinct`() {
        val list = listOf(20, 5, 10, 4, 5, 1, 5, 10, 6, 2, 3, 1)
            .sorted()
            .distinct()

        assertEquals(
            listOf(1, 2, 3, 4, 5, 6, 10, 20),
            list
        )
    }

    @Test
    fun partition() {
        val (even, odd) = listOf(20, 5, 10, 4, 5, 1, 5, 10, 6, 2, 3, 1)
            .sorted()
            .distinct()
            .partition { it % 2 == 0 }

        assertEquals(
            listOf(2, 4, 6, 10, 20),
            even
        )

        assertEquals(
            listOf(1, 3, 5),
            odd
        )
    }

    @Test
    fun zip() {
        val listPair = listOf(
            1 to "a",
            2 to "b",
            3 to "c"
        )

        val listZip = listOf(1, 2, 3).zip(listOf("a", "b", "c"))

        assertEquals(listPair, listZip)
    }

    @Test
    fun `should group by team`() {
        val danilo = Fan("Danilo", Team.SAO_PAULO)
        val marcos = Fan("Marcos", Team.SAO_PAULO)
        val ricardo = Fan("Ricardo", Team.OTHER)
        val joao = Fan("Joao", Team.ATLETICO_MINEIRO)

        val fans = listOf(danilo, marcos, ricardo, joao)

        val groupedByTeam = mapOf(
            Team.SAO_PAULO to listOf(danilo, marcos),
            Team.OTHER to listOf(ricardo),
            Team.ATLETICO_MINEIRO to listOf(joao)
        )

        assertEquals(groupedByTeam, fans.groupBy { it.team })
    }
}