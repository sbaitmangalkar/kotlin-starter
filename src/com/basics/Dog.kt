package com.basics

class Dog(family : String, type : String, val name: String, val breed : String, height : Double, weight : Double, var owner : String) :
        Animal(family, type, height, weight) {
    override fun getAnimalInfo() {
        println("$name is a $type of breed $breed which belongs to $family family which is $height ft. tall weighing $weight lbs.")
    }

    companion object {
        fun callYourDog(name : String) {
            println("Hey $name")
        }
    }
}

fun main(args: Array<String>) {
    val scotty = Dog("Mammal", "Dog", "Scotty","Labrador", 20.4,30.2, "Shyam")
    println(scotty.getAnimalInfo())

    Dog.callYourDog("Scotty")
}