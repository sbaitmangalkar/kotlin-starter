package com.basics

/**
 * This is just a sample class. There is no mention about
 * this in the tutorial.
 */
class Car {
    var make : String = "Ford"
    var name : String = "Focus"
    var yearOfRegistration : Int = 2018

        set(value) {
            if(value > 2018)
                throw RuntimeException("Not in the future!!")
            else
                field = value
        }
}

fun main(args: Array<String>) {
    val car = Car()
    car.yearOfRegistration = 2016
    println(car.yearOfRegistration)
}