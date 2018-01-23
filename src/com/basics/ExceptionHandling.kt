package com.basics

fun main(args: Array<String>) {
    println("Enter a dividend and a divisor with a \\\"space\\\" in between")
    val(dividend, divisor) = readLine()!!.split(' ').map(String::toInt)

    /**
     * A classic divide by zero example
     */
    try {
        if(divisor == 0)
            throw IllegalArgumentException("Can't divide by zero!!")
        else
            println("$dividend / $divisor = ${dividend / divisor}")
    } catch (e : IllegalArgumentException) {
        println(e.message)
    }
}