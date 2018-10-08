package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import java.time.LocalDateTime
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class Topic5 {

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
        assertEquals(10, account.amount)
    }
}