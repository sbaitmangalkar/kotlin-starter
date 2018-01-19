package com.basics

fun main(args: Array<String>) {
    val numberList = 1..20
    val listSum = numberList.reduce{x,y -> x + y}
    println("List sum using reduce : $listSum")

    val listSum2 = numberList.fold(2) {x,y -> x + y}
    println("List sum using fold : $listSum2")

    val listTimes4 = numberList.map { num -> num * 4 }
    listTimes4.forEach { println("*4 - $it") }

    val oddNumberList = numberList.filter { num -> num % 2 != 0 }
    oddNumberList.forEach { println(it) }
}