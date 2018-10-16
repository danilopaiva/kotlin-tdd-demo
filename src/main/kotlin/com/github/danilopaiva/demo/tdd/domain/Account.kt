package com.github.danilopaiva.demo.tdd.domain

import com.github.danilopaiva.demo.tdd.exception.InsufficientBalanceException
import com.github.danilopaiva.demo.tdd.exception.StatusNotAllowedException
import com.github.danilopaiva.demo.tdd.exception.ValueToOperationException
import com.github.danilopaiva.demo.tdd.repository.AccountRepository
import java.util.*

data class Account(
    val id: String = UUID.randomUUID().toString(),
    val status: Status = Status.ACTIVE
) : BaseAccount {

    var amount: Double = 0.0

    override fun create(repository: AccountRepository) {
        //you can do any validations before save an account
        repository.save(this)
    }

    override fun deposit(repository: AccountRepository, value: Double) {
        validateValue(value)
        validateStatus()
        this.amount = this.amount + value
        repository.update(this)
    }

    override fun withdraw(repository: AccountRepository, value: Double) {
        validateValue(value)
        validateStatus()
        validateAmount(value)
        this.amount = this.amount - value
        repository.update(this)
    }

    private fun validateAmount(value: Double) {
        if (this.amount - value < 0)
            throw InsufficientBalanceException(this.amount, value)
    }

    private fun validateStatus() {
        if (this.status != Status.ACTIVE)
            throw StatusNotAllowedException("DEPOSIT", this.status.name)
    }

    private fun validateValue(value: Double) {
        if (value <= 0)
            throw ValueToOperationException("Value $value isn't allowed to execute this operation!")
    }

    enum class Status {
        ACTIVE,
        INACTIVE
    }

}