package com.github.danilopaiva.demo.tdd.repository

import com.github.danilopaiva.demo.tdd.domain.Account

class StaticAccountRepository: AccountRepository {

    companion object {
        val accounts = mapOf<String, Account>()
    }

    override fun find(id: String): Account {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(account: Account): Account {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(id: String): Account {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
