package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import java.time.LocalDateTime
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class Topic6 {

    private data class Account(
        val id: String = UUID.randomUUID().toString(),
        var amount: Number = 0.0,
        val createdAt: LocalDateTime = LocalDateTime.now()
    )

    @Test
    fun `destructuring an account`() {
        val account = Account("id")

        val (id, amount) = account

        assertEquals("id", id)
        assertEquals(0.0, amount)
    }

    @Test
    fun `destructuring an account 2`() {
        val account = Account("id")

        val (_, _, date) = account

        assertTrue(date is LocalDateTime)
        assertNotNull(date)
    }

    @Test
    fun `destructuring an account list`() {
        val accounts = listOf(
            Account(),
            Account()
        )

        for ((id, _, date) in accounts) {
            println("Account $id created at $date")
        }
    }
}