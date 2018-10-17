package com.github.danilopaiva.demo.tdd.repository

import com.github.danilopaiva.demo.tdd.domain.Account

interface AccountRepository {

    fun find(id: String): Account

    fun save(account: Account): Account

    fun update(account: Account): Account
}