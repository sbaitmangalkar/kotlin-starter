package com.basics

//Higher Order Function - A function which either accepts or returns a function
fun makeMathFunction(num1 : Int) : (Int) -> Int = {num2 -> num1 * num2}

fun mathOnNumbers(numList : Array<Int>, customFunction:(num : Int) -> Int) {
    for(number in numList)
        println("Running customFunction : ${customFunction(number)}")
}

fun main(args: Array<String>) {
    val numList = 1..10
    val evenNums = numList.filter { it % 2 == 0 }
    val oddNums = numList.filter { num -> num % 2 != 0 }

    println("Printing even...")
    evenNums.forEach { println(it) }
    println("Printing odd...")
    oddNums.forEach { println(it) }

    val function = makeMathFunction(5)
    println("5 * 7 = ${function(7)}")

    val numList2 = arrayOf(1,2,3,4,5)
    val multiplier = {num1 : Int -> num1 * 2}

    mathOnNumbers(numList2, multiplier)

}