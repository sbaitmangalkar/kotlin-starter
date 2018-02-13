package com.basics

import java.util.*

fun main(args: Array<String>) {
    //Sample for loop
    for (x in 1..10)
        println("Loop : $x")

    println("---GUESSING RANDOM NUMBER---")

    val rand = Random()
    val num = rand.nextInt(50) + 1
    println("Generated random number : $num")

    var guess = 0
    //Sample while loop
    while(num != guess) {
        guess += 1
    }

    println("Num : $guess")

    println("---INDEXING----")

    var myArray = arrayOf(1,2,3,4,5,6)

    for(index in myArray.indices)
        println("Index of ${myArray[index]} is $index")

    println("---ALTERNATIVE OF INDEXING----")
    for((index, value) in myArray.withIndex())
        println("Index : $index Value : $value")
}