package com.github.danilopaiva.demo.tdd.exception

data class StatusNotAllowedException(val operation: String, val status: String) : RuntimeException()
