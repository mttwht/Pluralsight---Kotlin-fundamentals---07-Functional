package com.mttwht

fun main(args: Array<String>) {
    var program = Program()
    program.fibonacci(8)
}

class Program {
    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit) {
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}