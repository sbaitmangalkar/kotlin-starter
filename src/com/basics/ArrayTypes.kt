package com.basics

fun main(args : Array<String>) {
    //Array Examples
    var squareArray = Array(5, {element -> element * element})
    println("Second Element in squareArray : ${squareArray[2]}")
    println("First Element in squareArray : ${squareArray.first()}")
    println("Last Element in squareArray : ${squareArray.last()}")

    var heterogeneousArray = arrayOf(24, 56.346, "John")
    println("Array contains John? ${heterogeneousArray.contains("Shyam")}")

    var homogeneousArray : Array<Int> = arrayOf(2,3,4,5,6)
    println("Array contains 10? ${homogeneousArray.contains(10)}")

    //Ranges

    val rangeOneToTen = 1..10
    println("11 in rangeOneToTen : ${11 in rangeOneToTen}")

    val rangeTenToOne = 10.downTo(1)
    println("1 in rangeTenToOne? ${1 in rangeTenToOne}")

    val range3 = rangeOneToTen.step(3)

    for(i in range3)
        println("range3 : $i")

    for (i in rangeOneToTen.reversed())
        println("Reversed : $i")

}