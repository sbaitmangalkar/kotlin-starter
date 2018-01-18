package com.basics


fun main(args : Array<String>) {
    //Type Casting Example
    println("Converting 1.4142 to Int : ${1.4142.toInt()}")
    println("Converting an Int 68 to CHAR : ${68.toChar()}")
    println("Converting a Char A to INT : ${'A'.toInt()}")

    //Byte data type
    println("Biggest Byte : ${Byte.MAX_VALUE}")
    println("Smallest Byte : ${Byte.MIN_VALUE}")

    //Short data type
    println("Biggest Short : ${Short.MAX_VALUE}")
    println("Smallest Short : ${Short.MIN_VALUE}")

    //Int data type
    println("Biggest Int : ${Int.MAX_VALUE}")
    println("Smallest Int : ${Int.MIN_VALUE}")

    //Long data type
    println("Biggest Long : ${Long.MAX_VALUE}")
    println("Smallest Long : ${Long.MIN_VALUE}")

    //Float data type
    println("Biggest Float : ${Float.MAX_VALUE}")
    println("Smallest Float : ${Float.MIN_VALUE}")

    //Double data type
    println("Biggest Double : ${Double.MAX_VALUE}")
    println("Smallest Double : ${Double.MIN_VALUE}")


    /**
     * Demonstration of precision loss in Double after
     * 15 decimal digits
     */

    val double1 : Double = 1.1111111111111111
    val double2 : Double = 1.1111111111111111

    println("Adding Doubles : ${double1 + double2}")
}