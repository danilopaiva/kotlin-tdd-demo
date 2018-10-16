package com.github.danilopaiva.demo.tdd.domain

import com.github.danilopaiva.demo.tdd.repository.AccountRepository
import java.util.*

data class Account(
    val id: String = UUID.randomUUID().toString(),
    val amount: Number = 0
) : BaseAccount {

    override fun create(repository: AccountRepository) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deposit(repository: AccountRepository, value: Number) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun withdraw(repository: AccountRepository, value: Number) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}