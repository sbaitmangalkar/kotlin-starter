package com.basics

//Simple Interface
interface FlyableBird {
    fun fly() : Unit
}

//Implementation
class Bird(val name : String, var distanceFlown : Double) : FlyableBird {
    override fun fly() {
        println("$name can fly up to $distanceFlown mts!")
    }
}

fun main(args: Array<String>) {
    val dove = Bird("Dove", 34.6)
    println(dove.fly())
}