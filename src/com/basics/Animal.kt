package com.basics

/**
 * In Kotlin, a classes are "final" by default. If a class needs to be inherited, it should be
 * declared as "open"
 */
open class Animal(val family: String, val type: String, var height: Double, var weight : Double) {
    init {
        var decimalCheck = Regex(".*d+.*")
        require(!family.matches(decimalCheck)) {"Animal Family cannot contain numbers!!"}

        require(!type.matches(decimalCheck)) {"Animal Name cannot contain numbers!!"}

        require(height > 0) {"Animal height should be a positive value!!"}

        require(weight > 0) {"Animal weight should be a positive value!!"}
    }

    open fun getAnimalInfo() {
        println("Animal of $type belongs to $family is $height ft. tall and weighs $weight lbs.")
    }
}