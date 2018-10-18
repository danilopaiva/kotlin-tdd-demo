package com.github.danilopaiva.demo.tdd.repository

import com.github.danilopaiva.demo.tdd.domain.Account
import com.github.danilopaiva.demo.tdd.exception.NotFoundException
import org.junit.Before
import org.junit.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class StaticAccountRepositoryTest {

    private val repository: AccountRepository = StaticAccountRepository()

    private lateinit var account: Account

    @Before
    fun setup() {
        account = Account()
        saveAccount()
    }

    @Test
    fun `should to save an account`() {
        saveAccount()
    }

    @Test
    fun `should to find an account`() {
        val accountFound = repository.find(account.id)

        assertEquals(account, accountFound)
    }

    @Test
    fun `should throw an exception when account not found`() {
        assertFailsWith<NotFoundException> {
            repository.find(UUID.randomUUID().toString())
        }
    }

    @Test
    fun `should to update an account`() {
        account.amount = 10.0

        repository.update(account)

        val accountFound = repository.find(account.id)

        assertEquals(account.id, accountFound.id)
        assertEquals(10.0, accountFound.amount)
    }

    private fun saveAccount() {
        val accountSaved = repository.save(account)

        assertEquals(account, accountSaved)
    }
}