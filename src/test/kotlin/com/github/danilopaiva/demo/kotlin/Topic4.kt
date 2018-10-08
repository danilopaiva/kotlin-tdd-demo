package com.github.danilopaiva.demo.kotlin

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class Topic4 {

    private data class Account(val id: String, var amount: Number)

    @Test
    fun `methods in data class`() {
        val account = Account("1", 1.1)
        account.equals(null)
        account.toString()
        account.hashCode()
    }

    @Test
    fun `update properties`() {
        val account = Account("1", 1.1)
        //account.id = "2" //compilation error
        account.amount = 2.2
    }

    @Test
    fun `copy example`() {
        val account1 = Account("1", 1.1)
        val account2 = account1.copy(amount = 2.2)

        assertNotEquals(account1.amount, account2.amount)
    }

    @Test
    fun `equals and reference`() {
        val account1 = Account("1", 1.1)
        val account2 = Account("1", 1.1)

        assertTrue(account1 == account2) //Equals
        assertFalse(account1 === account2) //Reference
    }

}