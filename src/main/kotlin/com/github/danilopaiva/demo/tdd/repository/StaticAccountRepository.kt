package com.github.danilopaiva.demo.tdd.repository

import com.github.danilopaiva.demo.tdd.domain.Account
import com.github.danilopaiva.demo.tdd.exception.NotFoundException

class StaticAccountRepository : AccountRepository {

    companion object {
        val accounts = mutableMapOf<String, Account>()
    }

    override fun find(id: String): Account {
        return accounts[id] ?: throw NotFoundException(Account::class.java.simpleName, id)
    }

    override fun save(account: Account): Account {
        accounts[account.id] = account
        return account
    }

    override fun update(account: Account): Account {
        accounts[account.id] = account
        return account
    }

    override fun delete(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
