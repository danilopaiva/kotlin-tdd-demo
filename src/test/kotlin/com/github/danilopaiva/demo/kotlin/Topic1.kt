package com.github.danilopaiva.demo.kotlin

import java.util.*

data class Fan(
    val name: String,
    val team: Team,
    val id: String = UUID.randomUUID().toString(),
    var nickname: String = ""
)

enum class Team {
    SAO_PAULO,
    CRUZEIRO,
    ATLETICO_MINEIRO,
    OTHER
}

fun main(args: Array<String>) {
    val fan1 = getAnyFan()

    method2()

    print(fan1)
}

fun getAnyFan() = Fan("fan1", Team.SAO_PAULO)

fun method2() {

}