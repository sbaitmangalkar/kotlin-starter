package com.basics

fun add(num1 : Int, num2 : Int) : Int = num1 + num2

fun subtract(num1 : Int, num2 : Int) : Int {
    return Math.abs(num1 - num2)
}

fun nextTwo(num : Int) : Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

fun greet(name : String, msg : String = "Hi") : String {
    return "$msg $name"
}

fun getSum(vararg nums : Int) : Int {
    var sum = 0
    nums.forEach { element -> sum += element }
    return sum
}

val multiply = {num1 : Int, num2 : Int -> num1 * num2}

fun factorial (x : Int) : Int {
    return tailFactorial(x, 1)
}

tailrec fun tailFactorial(a : Int, b : Int) : Int {
    if(a == 0)
        return b
    else
        return tailFactorial(a - 1, a * b)
}


fun main(args: Array<String>) {
    println("10 + 6 is ${add(10,6)}")
    println("10 - 6 is ${subtract(num2 = 6, num1 = 10)}")

    val (two,three) = nextTwo(1)
    println("One $two $three")

    println("Greeting : ${greet("Jerry")}")
    println("Greeting : ${greet("Jerry", "Hello")}")
    println("Greeting : ${greet(msg = "Howdy", name = "Jerry")}")
    println("Summing Up : ${getSum(1,2,3,4,5,6)}")

    println("2 * 8 = ${multiply(2, 8)}")

    println("3! : ${factorial(3)}")

}