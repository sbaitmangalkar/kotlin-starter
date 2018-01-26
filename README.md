# Kotlin-Starter

## Overview

[Kotlin](https://kotlinlang.org/) is a statically-typed programming language that runs on the Java virtual machine and also can be
compiled to JavaScript source code or use the [LLVM](https://llvm.org/) compiler infrastructure. Its primary development is
from a team of [JetBrains](https://www.jetbrains.com/) programmers. As of Android Studio 3.0 Kotlin is a fully supported
programming language on Android and lets the user choose between targeting Java 6- or Java 8-
compatible bytecode.

This project mainly targets the audience who are willing to learn Kotlin and who have programming
experience in any programming language like Java, C#, Scala or Groovy. This project covers different
interesting features of the programming language along with working examples. In short, it covers what a
200 or 250 pages book generally covers.

## Basic Data Types And Variable Declaration
Kotlin supports all the basic data types that Java generally supports. They are:
> Byte, Short, Int, Long, Float, Double, Boolean and Char

Along with these **String** and **Array** are also other data types that Kotlin supports (More complex data types
will be dealt when required during the course of this article).
Now, there are two ways in which variables can be declared in Kotlin:
```Kotlin
val name = "Jon"
val id : String = "R4567"
var age : Int = 27
val isContractor = false
```
From the above example, it is evident that, Kotlin gives more importance to a variable name rather than it's
data type. **Kotlin can infer data type from the initialized variable**. If at all, data type needs to be
mentioned, it has to be done after the variable is given a valid name with a colon (:) in between. This can be
observed in the above code snippet where **id** is declared as a **String** and initialized with a value. Similarly,
type is inferred in case of **name** and **isContractor**. When a variable is declared as **val** - it automatically
becomes an immutable variable. It's value cannot be changed if once initialized. On the other hand, if a
variable is declared as **var** - it becomes a mutable variable.

## Writing main Function
Signature of main function in Kotiln is quite simple:
```Kotlin
fun main(args : Array<String>) {

}
```
Where **fun** is a Kotlin specific keyword which tells that **main** is a function. This function takes an **Array** of
**String** called **args** as an argument.
>Note: If Kotlin source code is eventually compiled to Java (all the code snippets shown in this article
are compiled to Java), then your Kotlin file should have a main method which acts as an entry point
just like Java.

## String Type
String is a commonly used data type in various programming languages. In Kotlin, String has some special
features:
**a. String Interpolation operation**
In programming language like Java, if something needs to be printed out on the console, it is generally done
like this:
```Java
String petName = "Scooby"
int age = 3
System.out.println("My pet " + petName + " is " + age + " years old!")

```
Printing out something like this using a plus ("+") operator to concat different variables is generally known to
most of the developers. This is known as **String Interpolation operation**. But Kotlin has something very
special to offer when it comes to String interpolation. It removes all the unwanted ceremony when it comes
to Strings. If the same code is written in Kotlin it would look like this:
```Kotlin
fun main(args: Array<String>) {
  val petName = "Scooby"
  val age = 3
  println("My pet $petName is $age years old!!")
}
```
Within the print statement, it can be observed that the variables are directly inserted with a dollar ($) symbol.
When the source code is compiled, Kotlin compiler translates it to:
```Java
new StringBuilder().append("My pet ")
                   .append(petName)
                   .append(" is ")
                   .append(age)
                   .append(" years old")
                   .append("!!")
                   .toString()
```
**b. Multiline String**
In programming languages like Java, printing out strings in multiple lines is generally facilitated by escape
sequence characters ("\n"):
```Java
String message = "This is a line written \n by John and sent to \n Dave";
System.out.println(message);
```
But Kotlin being very user friendly, it doesn't impose any rules for using escape sequence characters. Just
use a triple quote (""") instead!!
```Kotlin
fun main(args: Array<String>) {
   val message = """ This is a line written
   by John and sent to
   Dave """
   println(message)
}
```
Which produces an output:
> This is a line written   
>
>      by John and sent to
>
>      Dave
    
As it can be observed, indentation has gone for a toss here!! But there is an easy way to fix this. Kotlin has a
method called **trimMargin()** and it's overloaded form **trimMargin(marginPrefix : String)** which comes to
the rescue. **trimMargin()** method assumes pipe character ("|") as a default margin prefix. Hence to use this,
programmers just need to add a pipe character at the beginning of each line which marks a specific margin:
```Kotlin
fun main(args: Array<String>) {
  val message = """ This is a line written
    | by John and sent to
    | Dave """
  println(message.trimMargin())
}
```
This will produce an output:
> This is a line written
>  
>  by John and sent to
>  
>  Dave

If programmers want to make use of their custom margin prefix, then they should be making use of the
overloaded version of **trimMargin()** method:
```Kotlin
fun main(args: Array<String>) {
   val message = """ This is a line written
      # by John and sent to
      # Dave """
   println(message.trimMargin("#"))
}
```
Since key data types are explored, let's just run a sample program to understand the maximum and
minimum value that a particular Kotlin's data type can hold. To do that, just create a Kotlin file and type the
below code:
```Kotlin
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
}
```
This would clearly show the upper and lower bound of each data types:
> Biggest Byte : 127
>
> Smallest Byte : -128
>
> Biggest Short : 32767
>
> Smallest Short : -32768
>
> Biggest Int : 2147483647
>
> Smallest Int : -2147483648
>
> Biggest Long : 9223372036854775807
>
> Smallest Long : -9223372036854775808
>
> Biggest Float : 3.4028235E38
>
> Smallest Float : 1.4E-45
>
> Biggest Double : 1.7976931348623157E308
>
> Smallest Double : 4.9E-324

For Double values, precision is maintained only up to **15th decimal digit**. To demonstrate the same,
consider this below code snippet:
```Kotlin
fun main(args : Array<String>) {
   val double1 : Double = 1.1111111111111111
   val double2 : Double = 1.1111111111111111
   println("Adding Doubles : ${double1 + double2}")
}
```
Each Double value has 16 digits after decimal point. The result of this would be:
> Adding Doubles : 2.2222222222222223

## Type Casting
Type casting had never been this easy before. Kotlin being user friendly, provides various convenient
methods to perform type casting.
Let's say, if a programmer wants to convert a double value to an integer value or an integer value to a char
value or vice versa:
```Kotlin
fun main(args : Array<String>) {
   println("Converting 1.4142 to Int : ${1.4142.toInt()}")
   println("Converting an Int 68 to CHAR : ${68.toChar()}")
   println("Converting a Char A to INT : ${'A'.toInt()}")
}
```
This produces:
> Converting 1.4142 to Int : 1
>
> Converting an Int 68 to CHAR : D
>
> Converting a Char A to INT : 65

>**Note: The curly braces ({}) which can seen in print statements defines a scope of operation. If
just a single value needs to be printed, then these curly braces can be ignored.**

## Arrays
In Kotlin, arrays can be both homogeneous (containing objects of similar type) and heterogeneous
(containing objects of different types). In order to create an heterogeneous array:
```Kotlin
fun main(args : Array<String>) {
   var heterogeneousArray = arrayOf(24, 56.346, "John")
   println("Array contains John? ${heterogeneousArray.contains("John")}")
}
```
The above array contains an integer, double and a string. A method called **contains(element : T)** can be
called on an array to find out if the given value is present in it or not.
Creating a homogeneous array is very similar to creating a heterogeneous array:
```Kotlin
fun main(args : Array<String>) {
   var homogeneousArray : Array<Int> = arrayOf(2,3,4,5,6)
   println("Array contains 10? ${homogeneousArray.contains(10)}")
}
```
Now, say if you want to create an array that contains square of numbers. How hard would that be?
```Kotlin
fun main(args : Array<String>) {
   var squareArray = Array(5, {element -> element * element})
}
```
Yes!! It is that simple!! In above code snippet, the **Array** constructor (In this case **Array** is a class defined in
kotlin.Array which has a public constructor of the form: `Array<T>(size : Int, init : (Int) -> T))` takes in two
parameters. One is an integer that specifies the array size and another is a lambda expression. *Note that, in
Kotlin a lambda expression should always be enclosed within curly braces ({})*. Now once this array is
created, we can access first, last and any random items from the array:
```Kotlin
fun main(args : Array<String>) {
   var squareArray = Array(5, {element -> element * element})
   println("Second Element in squareArray : ${squareArray[2]}")
   println("First Element in squareArray : ${squareArray.first()}")
   println("Last Element in squareArray : ${squareArray.last()}")
}
```
Here, `first()` and `last()` are convenient methods defined in `Arrays<out : T>` class.

## Range
If you want to create a range of numbers, it is as simple as:
```Kotlin
fun main(args : Array<String>) {
  val rangeOneToTen = 1..10
}
```
This creates a set of values ranging from 1 to 10 (both inclusive). And if you want to check if a specific value
falls within this range, then:
```Kotlin
fun main(args : Array<String>) {
  val rangeOneToTen = 1..10
  println("11 in rangeOneToTen : ${11 in rangeOneToTen}")
}
```
**in** is a valid Kotlin keyword which returns a Boolean result telling whether the value is present in the given
range or not.
If you want to create a range of numbers in reverse order:
```Kotlin
fun main(args : Array<String>) {
  val rangeTenToOne = 10.downTo(1)
}
```
`downTo(to : Int)` is a method that can be called on an `Int` value which returns a reverse progression.
If you want to step through in a range, then it is as simple as:
```Kotlin
fun main(args : Array<String>) {
  val rangeOneToTen = 1..10
  val range3 = rangeOneToTen.step(3)
}
```
Just to verify this:
```Kotlin
fun main(args : Array<String>) {
  val rangeOneToTen = 1..10
  val range3 = rangeOneToTen.step(3)
  for(i in range3)
    println("range3 : $i")
}
```
This produces:
> range3 : 1
>
> range3 : 4
>
> range3 : 7
>
> range3 : 10

Stepping through 3 values at each time.

## Conditionals
In this section, let's explore some of the core functional programming concepts. When it comes to functional
programming, it has three powerful functions to offer - **map**, **reduce** and **filter**. In addition to these, Kotlin
adds another function called fold. All these methods operate on a set of items.
A reduce function (method signature: `reduce(operation : (S,T) -> S) : S`) when called on a list of items,
reduces the entire list to a single item based on the given condition:
```Kotlin
fun main(args: Array<String>) {
  val numberList = 1..20
  val listSum = numberList.reduce{a,b -> a + b}
  println("List sum using reduce : $listSum")
}
```
In this example, reduce is called on a list of integers ranging from 1 to 20 by specifying the condition to add
up all the numbers in that list. Hence this produces a result of:
> List sum using reduce : 210

Kotlin's `fold` function (method signature: `fold(inital : R, operation : (R,T) -> R) : R`) is very similar to the
reduce function. The only difference being, fold takes in an extra initial parameter which specifies the initial
value of the operation:
```Kotlin
fun main(args: Array<String>) {
  val numberList = 1..20
  val listSum2 = numberList.fold(2) {x,y -> x + y}
  println("List sum using fold : $listSum2")
}
```
Here, 2 is passed as an initial value, hence the result will be:
> List sum using fold : 212

A `map` function (method signature: `map(transform: (T) -> R): List<R>`) when called on a list of items,
transforms the given list to a new list that matches the given condition: 
```Kotlin
fun main(args: Array<String>) {
  val numberList = 1..20
  val listTimes4 = numberList.map { num -> num * 4 }
  listTimes4.forEach { println("*4 - $it") }
}
```
Here, map function transforms the original list to a new list containing each of the numbers multiplied by 4.
This produces:
> *4 - 4
>
> *4 - 8
>
> *4 - 12
>
> *4 - 16
>
> *4 - 20
>
> *4 - 24
>
> *4 - 28
>
> *4 - 32
>
> *4 - 36
>
> *4 - 40
>
> *4 - 44
>
> *4 - 48
>
> *4 - 52
>
> *4 - 56
>
> *4 - 60
>
> *4 - 64
>
> *4 - 68
>
> *4 - 72
> 
> *4 - 76
> 
> *4 - 80

> Note: In the above code snippet, it can be observed that `$it` is used in print statement. **"it"** is a valid
Kotlin keyword that can be used within an internal iterator (`forEach()` method) which specifies the
current item coming out from the list.

A filter function (method signature: `filter(predicate : (T) -> Boolean) : List<T>`) when called on a list of
items, allows some items to go through and blocks some of them based on the given condition:
```Kotlin
fun main(args: Array<String>) {
  val numberList = 1..20
  val oddNumberList = numberList.filter { num -> num % 2 != 0 }
  oddNumberList.forEach { println(it) }
}
```
This creates a list of odd numbers from the given original list, producing the result:
> 1
>
> 3
>
> 5
>
> 7
>
> 9
>
> 11
>
> 13
>
> 15
>
> 17
>
> 19

## If and When Conditions
Kotlin supports classic condition checking mechanism using `if` and `else` conditions:
```Kotlin
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
}
```
In this code sample, age is read from console and based on the given age, an appropriate message is
displayed:
> Enter age:
>
> 10
>
> Go to grade 5

In addition to classic condition checks, Kotlin also has a when statement:
```Kotlin
fun main(args: Array<String>) {
  println("Enter age:")
  val age = readLine()!!.toInt()
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
```
Here, it can be observed that the same example which previously used classic condition checks, is now
being transformed to use `when` statement. This `when` statement is very similar to `switch` statement in other
programming languages. Another important aspect which can be observed in this code snippet is, `in`
keyword is used where ever a range check is required. Lastly, `else` here acts a `default` in `switch` statement.

## Reading Console Inputs
In the previous section we saw that age was being read from the console. Let's talk briefly about reading
inputs from the console.
Kotlin has a method called `readLine()` which is defined in kotlin.io and this is intended to read inputs from
the console. This method returns a `String` by default. If you want to read a single integer from console:
```Kotlin
fun main(args : Array<String>) {
  val readInt = readLine()!!.toInt()
}
```
Adding (!!) after `readLine()` will return a **non-null** value of `readLine().toInt()` of throws a
`NullPointerException` if `readLine()` returns **null**.
Now, if you want to read two integers from console and add them:
```Kotlin
fun main(args : Array<String>) {
  val (a, b) = readLine()!!.split(' ')
  println("$a + $b = ${a.toInt() + b.toInt()}")
}
```
