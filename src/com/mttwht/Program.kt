package com.mttwht

fun main(args: Array<String>) {
    var program = Program()
    program.fibonacci(8, object: Process {
        override fun execute(value: Int) {
            println(value)
        }
    })
}

interface Process {
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit) {
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}