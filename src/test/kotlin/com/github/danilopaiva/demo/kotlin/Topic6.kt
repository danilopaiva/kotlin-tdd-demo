package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class Topic6 {

    @Test
    fun `destructuring a fan`() {
        val fan = Fan(name = "joao", team = Team.OTHER)

        val (name, team) = fan

        assertEquals(Team.OTHER, team)
        assertEquals("joao", name)
    }

    @Test
    fun `destructuring a fan 2`() {
        val fan = Fan(name = "joao", team = Team.OTHER)

        val (_, _, id) = fan

        assertEquals(fan.id, id)
    }

    @Test
    fun `destructuring fans`() {
        val fans = listOf(
            Fan(name = "joao", team = Team.ATLETICO_MINEIRO),
            Fan(name = "paulo", team = Team.SAO_PAULO)
        )

        for ((name, team) in fans) {
            println("$name really likes $team")
        }
    }
}