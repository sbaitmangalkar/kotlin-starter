package com.basics

/**
 * By default, null safety is built into Kotlin.
 * Only on adding a (?) as suffix to the return type, will allow
 * the method to return a null value.
 */
fun returningNull() : String? {
    return null
}

fun main(args: Array<String>) {
    var nullVal : String = returningNull() ?: "No Content!!"
    println(nullVal)
}