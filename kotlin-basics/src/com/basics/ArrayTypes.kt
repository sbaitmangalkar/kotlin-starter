package com.basics

fun main(args : Array<String>) {
    var squareArray = Array(5, {element -> element * element})
    println("Second Element in squareArray : ${squareArray[2]}")
    println("First Element in squareArray : ${squareArray.first()}")
    println("Last Element in squareArray : ${squareArray.last()}")

    var myArray = arrayOf(24, 56.346, "Shyam")
    println("Array contains Shyam? ${myArray.contains("Shyam")}")

    //Ranges

    val oneToTen = 1..10
    println("11 in oneToTen : ${11 in oneToTen}")

    val tenToOne = 10.downTo(1)
    println("1 in tenToOne? ${1 in tenToOne}")

    val range3 = oneToTen.step(3)

    for(i in range3)
        println("range3 : $i")

    for (i in oneToTen.reversed())
        println("Reversed : $i")

}