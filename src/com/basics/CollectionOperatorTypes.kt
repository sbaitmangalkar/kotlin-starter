package com.basics

fun main(args: Array<String>) {
    val numList = 1..20
    val listSum = numList.reduce{x,y -> x + y}
    println("List sum using reduce : ${listSum}")

    val listSum2 = numList.fold(0) {x,y -> x + y}
    println("List sum using fold : ${listSum2}")

    val times5 = numList.map { num -> num * 5 }
    times5.forEach { println("*5 - ${it}") }
}