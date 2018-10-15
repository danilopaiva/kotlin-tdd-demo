package com.github.danilopaiva.demo.tdd.repository

import com.github.danilopaiva.demo.tdd.domain.Account

class AccountRepository {

    companion object {
        val accounts = mapOf<String, Account>()
    }
}
