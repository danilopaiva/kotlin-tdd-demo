package com.github.danilopaiva.demo.tdd.domain

import com.github.danilopaiva.demo.tdd.exception.InsufficientBalanceException
import com.github.danilopaiva.demo.tdd.exception.StatusNotAllowedException
import com.github.danilopaiva.demo.tdd.exception.ValueToOperationException
import com.github.danilopaiva.demo.tdd.repository.AccountRepository
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import kotlin.test.assertFailsWith

class AccountTest {

    private val repository: AccountRepository = mock()

    @Test
    fun `verify if account repository was called to create an account`() {
        val account = Account()

        account.create(repository)

        verify(repository, times(1)).save(account)
    }

    @Test
    fun `should deposit any value an account`() {
        val account = Account()
        account.deposit(repository, 10.0)
        verify(repository, times(1)).update(account)
    }

    @Test
    fun `shouldn't deposit when status is inactive`() {
        val account = Account(status = Account.Status.INACTIVE)

        assertFailsWith<StatusNotAllowedException> { account.deposit(repository, 10.0) }
    }

    @Test
    fun `shouldn't deposit when the value is negative`() {
        val account = Account()

        assertFailsWith<ValueToOperationException> { account.deposit(repository, -10.0) }
    }

    @Test
    fun `should withdraw any value an account`() {
        val account = Account()
        account.deposit(repository, 100.0)
        account.withdraw(repository, 100.0)
        verify(repository, times(2)).update(account)
    }

    @Test
    fun `amount the account shouldn't be negative`() {
        val account = Account()
        assertFailsWith<InsufficientBalanceException> {
            account.withdraw(repository, 100.0)
        }
    }
}