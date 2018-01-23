package com.basics

fun main(args: Array<String>) {
    //Mutable List
    var mutableList : MutableList<Int> = mutableListOf(1,2,3,4,5)
    //Unused immutable list
    val immutableList : List<Int> = listOf(1,2,3)

    mutableList.add(6)

    println("First element : ${mutableList.first()}")
    println("Last element : ${mutableList.last()}")

    println("Second element : ${mutableList[2]}")

    mutableList.forEach { println(it) }

    //Maps

    val map = mutableMapOf<Int, Any?>()
    map[1] = 23
    map[2] = "Ben"
    map[3] = "Shyam"
    map[4] = 33
    map.put(77, "Bangalore")

    for((key, value) in map) {
        println("Key : $key Value: $value")
    }

    val map2 = mutableMapOf(1 to "Jon", 2 to "Shyam", 3 to 25)
    for ((key, value) in map2) {
        println("Key in Map2 : $key Value in Map2 : $value")
    }
}