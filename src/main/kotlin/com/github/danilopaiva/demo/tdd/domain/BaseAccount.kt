package com.github.danilopaiva.demo.tdd.domain

import com.github.danilopaiva.demo.tdd.repository.AccountRepository

interface BaseAccount {

    fun deposit(repository: AccountRepository, value: Number)

    fun withdraw(repository: AccountRepository, value: Number)
}