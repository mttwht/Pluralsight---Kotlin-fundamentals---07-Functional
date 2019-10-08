package com.mttwht

fun main(args: Array<String>) {
    var program = Program()
//    program.fibonacci(8, {n -> println(n)})
//    program.fibonacci(8) { n -> println(n)}
//    program.fibonacci(8) { println(it) }
    program.fibonacci(8, ::println)

    var total = 0;
    program.fibonacci(8) {it -> total += it}
    println("total: $total")
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