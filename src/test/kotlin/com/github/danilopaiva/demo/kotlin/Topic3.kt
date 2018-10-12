package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import java.time.LocalDateTime
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Topic3 {

    //One line function

    private fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    private fun sum2(a: Int, b: Int) = a + b

    @Test
    fun `sum1 and sum2 are equals`() {
        val sum1 = sum1(1,1)
        val sum2 = sum2(1,1)
        assertEquals(sum1, sum2)
    }














    private data class Account(
        val id: String,
        var amount: Number = 0.0,
        val createdAt: LocalDateTime = LocalDateTime.now()
    )

    //no overload method
    private fun create(id: String = UUID.randomUUID().toString(), amount: Number) =
    //call in any order
        Account(amount = amount, id = id)

    @Test
    fun `create an account`() {
        val account = create(amount = 10)
        assertNotNull(account)
        assertEquals(10, account.amount)
    }

    @Test
    fun `create an account with id generated here`() {
        val account = create(id = "new id", amount = 10)
        assertNotNull(account)
        assertEquals("new id", account.id)
        assertEquals(10, account.amount)
    }
}