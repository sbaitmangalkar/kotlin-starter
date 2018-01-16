package com.basics


fun main(args : Array<String>) {
    println("65 to CHAR : ${65.toChar()}")
    println("A to INT : ${'A'.toInt()}")

    println("Biggest Int : ${Int.MAX_VALUE}")
    println("Smallest Int : ${Int.MIN_VALUE}")

    println("Biggest Long : ${Long.MAX_VALUE}")
    println("Smallest Long : ${Long.MIN_VALUE}")

    println("Biggest Double : ${Double.MAX_VALUE}")
    println("Smallest Double : ${Double.MIN_VALUE}")

    println("Biggest Short : ${Short.MAX_VALUE}")
    println("Smallest Short : ${Short.MIN_VALUE}")

    val double1 : Double = 1.1111111111111111
    val double2 : Double = 1.1111111111111111

    println("Adding Doubles : ${double1 + double2}")
}