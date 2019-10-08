package com.mttwht

fun main(args: Array<String>) {
    var program = Program()
//    program.fibonacci(8, {n -> println(n)})
//    program.fibonacci(8) { n -> println(n)}
//    program.fibonacci(8) { println(it) }
    program.fibonacci(8, ::println)
}

class Program {
    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}