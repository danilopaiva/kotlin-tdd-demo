package com.github.danilopaiva.demo.tdd.exception

data class NotFoundException(val resource: String, val value: String) : RuntimeException()
