package com.mttwht

import java.util.*

class Meeting {
    var What: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main() {
    val m = Meeting()
    // initialise the OO way
    m.What = "Daily stand-up"
    m.When = Date()
    m.Who.add("Matt")

    // initialise using WITH
    with(m) {
        What = "Daily stand-up"
        When = Date()
        Who.add("Matt")
    }

    // initialise using APPLY
    m.apply {
        What = "Daily stand-up"
        When = Date()
        Who.add("Matt")
    }.create() // apply returns m so we can use it
}