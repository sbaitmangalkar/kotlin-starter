package com.basics

fun main(args: Array<String>) {
    println("Enter age:")
    val age = readLine()!!.toInt()
    if(age < 5)
        println("Go to preschool")
    else if (age == 5)
        println("Go to Kindergarten")
    else if(age > 5 && age <= 17) {
        val grade = age - 5
        println("Go to grade $grade")
    } else
        println("Go to College")

    println("----WHEN Check----")

    when(age) {
        in 0..5 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to grade $grade")
        }

        else -> println("Go to College")
    }
}