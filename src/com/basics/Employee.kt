package com.basics

data class Employee(val firstName: String,
                     val lastName: String,
                     val employeeId: String,
                     val emailAddress: String,
                     var phoneNumber: String,
                     var department: String)

fun main(args: Array<String>) {
    val shyam = Employee("Shyam", "B", "U4567", "shyam@tr.com", "+9180123456", "F&R")
    val john = Employee("john", "C", "U1234", "john@tr.com", "+91804567", "F&R")

    println(shyam.equals(john))
    println(shyam.hashCode())
    println(shyam.toString())

    val shyamImpersonator = Employee("Shyam", "B", "U4567", "shyam@tr.com", "+9180123456", "F&R")
    println(shyam.equals(shyamImpersonator))

}