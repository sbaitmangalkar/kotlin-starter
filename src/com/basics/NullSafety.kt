package com.basics

fun returningNull() : String? {
    return null
}

fun main(args: Array<String>) {
    var nullVal : String = returningNull() ?: "No Content!!"
    println(nullVal)
}