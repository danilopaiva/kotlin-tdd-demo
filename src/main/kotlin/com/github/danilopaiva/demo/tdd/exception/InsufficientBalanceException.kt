package com.github.danilopaiva.demo.tdd.exception

data class InsufficientBalanceException(val amount: Double, val value: Double) : RuntimeException()