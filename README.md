# Kotlin - A Beginner's Guide

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
Adding (!!) after readLine() will return a **non-null** value of `readLine().toInt()` of throws a
`NullPointerException` if `readLine()` returns null.
Now, if you want to read two integers from console and add them:
```Kotlin
fun main(args : Array<String>) {
  val (a, b) = readLine()!!.split(' ')
  println("$a + $b = ${a.toInt() + b.toInt()}")
}
```
## For And While Loops
Looping constructs in Kotlin are really simple. To iterate through an array:
```Kotlin
fun main(args : Array<String>) {
  var myArray = arrayOf(1,2,3,4,5,6)
  for(num in myArray)
  println("Loop : $num")
}
```
To access the array index while looping, there are two approaches:
**Approach 1:**
```Kotlin
fun main(args : Array<String>) {
  var myArray = arrayOf(1,2,3,4,5,6)
  for(index in myArray.indices)
    println("Index of ${myArray[index]} is $index")
}
```
Which prints out:
> Index of 1 is 0
>
> Index of 2 is 1
>
> Index of 3 is 2
>
> Index of 4 is 3
>
> Index of 5 is 4
>
> Index of 6 is 5

Approach 2:
```Kotlin
fun main(args : Array<String>) {
  var myArray = arrayOf(1,2,3,4,5,6)
  for((index, value) in myArray.withIndex())
    println("Index : $index Value : $value")
}
```
Which prints out:
> Index : 0 Value : 1
>
> Index : 1 Value : 2
>
> Index : 2 Value : 3
>
> Index : 3 Value : 4
>
> Index : 4 Value : 5
>
> Index : 5 Value : 6

`while` loop is very similar to the one which is seen in other programming languages. To quickly understand
it's working, consider an example where we need to develop an application that will guess a random
number:
```Kotlin
fun main(args: Array<String>) {
  val rand = Random()
  val num = rand.nextInt(50) + 1
  println("Generated random number : $num")
  var guess = 0
  while(num != guess) {
    guess += 1
  }
  println("Num : $guess")
}
```
Here `Random()` is being imported from `java.util` package. Kotlin supports all those utilities which are
available in Java. This code snippet first generates a random number number and then goes on to guess
that!! Sample output will look like:
> Generated random number : 26
Num : 26

# Functions
We have been writing `main` function from quite some time now. Now, let's start calling other functions from
our main function:
```Kotlin
fun greet(name : String, msg : String) : String {
  return "$msg $name"
}

fun main(args : Array<String>) {
  println("Greeting : ${greet("Ben", "Hello")}")
}
```
Here greet method returns a String. That was not hard to guess:
> Greeting : Hello Ben

What about **default arguments**? Using default arguments is the most nice way to evolve an API.
But Java doesn't support default arguments. Instead, one should take help from method overloading to
achieve this. If same greet method is written in Java to support default arguments, it would look like:
```Java
public String greet(String name, String msg) {
  return msg + " " + name;
}

public String greet(String name) {
  String defaultMsg = "Hi";
  return greet(name, defaultMsg);
}
```
But Kotlin can understand you pain!! It supports default arguments. Hence the code snippet looks like:
```Kotlin
fun greet(name : String, msg : String = "Hi") : String {
  return "$msg $name"
}

fun main(args : Array<String>) {
  println("Greeting : ${greet("Ben")}")
}
```
Also, Kotlin supports something called **named parameters**. Which means, there is no restriction on the way
in which parameters are passed to a function. This `greet` method can also be called as:
```Kotlin
fun main(args : Array<String>) {
  println("Greeting : ${greet(msg = "Howdy", name = "Ben")}")
}
```
But just make sure that you specify the argument name.
In Kotlin, functions can also be in a single line:
```Kotlin
fun add(num1 : Int, num2 : Int) : Int = num1 + num2

fun main(args : Array<String>) {
  println("10 + 6 is ${add(10,6)}")
}
```
Here, add takes in two integers and returns an integer which is the sum of given two integers. Note that,
specifying a return type is optional in case of single line functions.
If you want to create a function that doesn't return anything, just specify the return type as `Unit` (Same as
`void` in other programming languages) or **don't** specify anything (just like we do in case of `main` method):
```Kotlin
fun greet(name : String, msg : String) : Unit {
  println("$msg $name")
}
```
If you want to create a function that returns **two** values, then:
```Kotlin
fun nextTwo(num : Int) : Pair<Int, Int> {
  return Pair(num + 1, num + 2)
}

fun main(args: Array<String>) {
  val (two,three) = nextTwo(1)
  println("One $two $three")
}
```
Here, `Pair<out : A, out : B>` represents an object that holds two values and `nextTwo(num : Int)` method
takes in an integer and returns a `Pair` containing it's next two increments.
You can also send variable number of arguments to a function:
```Kotlin
fun getSum(vararg nums : Int) : Int {
  var sum = 0
  nums.forEach { element -> sum += element }
  return sum
}

fun main(args : Array<String>) {
  println("Summing Up : ${getSum(1,2,3,4,5,6)}")
}
```
Where `vararg` is a Kotlin keyword which specifies that the function accepts variable number of arguments.
The `getSum` method just returns a sum of integers passed it to.
As we have looked into `vararg`, there is another way in which we can write `main` method in Kotlin:
```Kotlin
fun main(vararg args : String) {
  println("Hello Sam!!")
}
```
We can also define **function literals**:
```Kotlin
val multiply = {num1 : Int, num2 : Int -> num1 * num2}

fun main(args: Array<String>) {
  println("2 * 8 = ${multiply(2, 8)}")
}
```
Here `multiply` is a literal that computes a product of given two integer values.
Kotlin compiler optimizes all [tail recursion](https://en.wikipedia.org/wiki/Tail_call) calls. Tail recursive calls can be demonstrated through this factorial finding program:
```Kotlin
fun factorial (x : Int) : Int {
  return tailFactorial(x, 1)
}

tailrec fun tailFactorial(a : Int, b : Int) : Int {
  if(a == 0)
    return b
  else
    return tailFactorial(a - 1, a * b)
}

fun main(args: Array<String>) {
  println("3! : ${factorial(3)}")
}
```
## Higher Order Functions
A [higher order function] (https://en.wikipedia.org/wiki/Higher-order_function) is a function that either accepts or returns a function:
```Kotlin
fun makeMathFunction(num1 : Int) : (Int) -> Int = {num2 -> num1 * num2}

fun main(args: Array<String>) {
  val function = makeMathFunction(5)
  println("5 * 7 = ${function(7)}")
}
```
Here `makeMathFunction` is an higher order function that returns another function. This higher order
function takes an integer argument and returns a function which also takes an integer argument. This
function which is returned, will return a product of two integers. First integer (num1) being the one passed to
the higher order function and the second integer (num2) being the one passed to the returned function.
As another example:
```Kotlin
fun mathOnNumbers(numList : Array<Int>, customFunction:(num : Int) -> Int) {
for(number in numList)
  println("Running customFunction : ${customFunction(number)}")
}

val multiplier = {num1 : Int -> num1 * 2}

fun main(args: Array<String>) {
  val numList2 = arrayOf(1,2,3,4,5)
  mathOnNumbers(numList2, multiplier)
}
```
Here, `mathOnNumbers` is an higher order function that takes another function as an argument. The
function which is taken as an argument should accept an integer and return an integer. Hence, a function
literal called multiplier is created which accepts an integer and returns an integer result generated by
multiplying the original integer by 2. This function literal is then passed to `mathOnNumbers` function.

## Collection Types
List and Map are the two commonly used collections in Kotlin. Both List and Map can be either mutable or
immutable. Let's explore List first and then get to Map:
```Kotlin
fun main(args: Array<String>) {
  // Creating Mutuable List
  var mutableList : MutableList<Int> = mutableListOf(1,2,3,4,5)
  
  // Creating immutable List
  val immutableList : List<Int> = listOf(1,2,3)
  
  // Adding elements to List
  mutableList.add(6)
  println("First element : ${mutableList.first()}")
  println("Last element : ${mutableList.last()}")
  println("Second element : ${mutableList[2]}")
  
  // Iterating through a List
  mutableList.forEach { println(it) }
}
```
As the name suggests, `mutableList` is a List which can be modified along the program and `immutableList`
is the one which cannot be modified. Elements can be added using `add()` method. `first()` and `last()` methods
can be used to get first and last elements of the List.
Just like in Java, a `Map` in Kotlin is a key-value store. If you want to create a Map with integer keys and
generic values, then:
```Kotlin
fun main(args: Array<String>) {
  val map = mutableMapOf<Int, Any?>()
  map[1] = 23
  map[2] = "Ben"
  map[3] = "Shyam"
  map[4] = 33
  map.put(77, "Bangalore")
  
  // Iterating through a Map
  for((key, value) in map) {
    println("Key : $key Value: $value")
  }
}
```
Here, `Any` is a Kotlin builtin class and adding a question mark (?) at it's end will suggest that the values in
the Map can be of any type. As it can be seen, our map now consists of string and integer values. Adding a
key-value pair to a map can be done in two different ways as shown in the code snippet. One by specifying
the `index` and another by calling put() method on map.
A pre-initialized map can also be created as:
```Kotlin
fun main(args: Array<String>) {
  // Pre-initialized Map
  val map2 = mutableMapOf(1 to "Jon", 2 to "Shyam", 3 to 25)
  
  // Iterating through a map
  for ((key, value) in map2) {
    println("Key in Map2 : $key Value in Map2 : $value")
  }
}
```
Where key-value pairs are specified as "key to value".

## Exception Handling
Kotlin supports the classic `try` - `catch` block as in Java:
```Kotlin
fun main(args: Array<String>) {
  println("Enter a dividend and a divisor with a \\\"space\\\" in between")
  val(dividend, divisor) = readLine()!!.split(' ').map(String::toInt)
  try {
    if(divisor == 0)
      throw IllegalArgumentException("Can't divide by zero!!")
    else
      println("$dividend / $divisor = ${dividend / divisor}")
  } catch (e : IllegalArgumentException) {
     println(e.message)
  }
}
```
This is an example that checks for a **divide by zero** condition. If there is such a condition,
`IllegalArgumentException` is thrown.

## Classes And Inheritance
Classes in Kotlin are `final` by default which means, the created class is not available for inheritance. In order
to inherit a class, it should be marked as open.
So let's create an open class first:
```Kotlin
open class Animal(val family: String, val type: String, var height: Double, var weight : Double) { 
  // class body goes here
}
```
Above code snippet shows a simple class called `Animal` which has a constructor that takes 4 parameters.
In Kotlin, **constructor** is written right after the **class name**. Above code snippet is similar to writing:
```Java
class Animal {
  private String family;
  private String type;
  private double height;
  private double weight;
  
  public Animal(String family, String type, double height, double weight) {
    super();
    this.family = family;
    this.type = type;
    this.height = height;
    this.weight = weight;
  }
}
```
in Java. Now that's simplified to a greater extent in Kotlin isn't it?
Since our `Animal` class is ready, let's evolve it further by adding a method. But before adding a method, we
need to verify if the parameters passed to the constructor are valid or not. To do this, we will write an init
block in the class that checks for the given parameters. In Kotlin, all the object initialization has to be done
within an `init` block:
```Kotlin
open class Animal(val family: String, val type: String, var height: Double, var weight : Double) {
   init {
     var decimalCheck = Regex(".*d+.*")
     
     require(!family.matches(decimalCheck)) {"Animal Family cannot contain numbers!!"}
     
     require(!type.matches(decimalCheck)) {"Animal Name cannot contain numbers!!"}
     
     require(height > 0) {"Animal height should be a positive value!!"}
     
     require(weight > 0) {"Animal weight should be a positive value!!"}
   }
}
```
This init block defines a `kotlin.text.Regex(pattern : String)` which will be used to check for the presence of
decimal values in a String. This is required because, a name or type should not contain any decimals or
digits in it. This requirement is checked in a `require` function (method signature: `require(value: Boolean, lazyMessage: () -> Any): Unit`) which is an inline function in Kotlin. Now, its time to add a method to this class:
```Kotlin
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
```
As `Animal` class is ready, lets create another class that extends this class and adds some more information
in it:
```Kotlin
class Dog(family : String, type : String, val name: String, val breed : String, height : Double, weight : Double, var owner : String) :
        Animal(family, type, height, weight) {
    
    override fun getAnimalInfo() {
        println("$name is a $type of breed $breed which belongs to $family family which is $height ft. tall weighing $weight lbs.")
    }
}
```
Along with `family`, `type`, `height` and `weight`, `Dog` class adds some additional information like `name`, dog's
`breed` and `owner`. It also overrides the `getAnimalInfo()` method from the `Animal` class. Here `getAnimalInfo()` is an instance method. Now, lets create a Dog object:
```Kotlin
fun main(args: Array<String>) {
   val scotty = Dog("Mammal", "Dog", "Scotty","Labrador", 20.4,30.2, "Shyam")
   println(scotty.getAnimalInfo())
}
```
As you can observe, creation of objects in Kotlin doesn't require a new keyword. It looks vary similar to a
method call.
So, instance methods are fine but what about `static` methods?
Kotlin doesn't specifically have static methods, but the purpose can be fulfilled by a special type of object
called **companion object**. Let's add a **companion object** to Dog class:
```Kotlin
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
```
There are times when we all deal with **data classes**. ***A data class is a class designed to hold data***. For
example, an `Employee` class is created to hold employee related details. How would one design a data
class in programming language like Java?
```Java
public class Employee {
	private String firstName;
	private String lastName;
	private String employeeId;
	private String emailAddress;
	private String phoneNumber;
	private String department;

	public Employee(String firstName, String lastName, String employeeId, String emailAddress, String phoneNumber,
			String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Employee(FirstName= " + firstName + " ,lastName= " + lastName + ", employeeId= " + employeeId
				+ " emailAddress= " + emailAddress + ", phoneNumber= " + phoneNumber + ", department= " + department
				+ ")]";
	}

}
```
Now that's roughly about 100 lines of code. The code has an overridden `equals` method which is very
essential, an overrided `toString()` method, it also has a **constructor** and **get methods** for the fields. If we were to write a data class in Kotlin, this is how its going to look:
```Kotlin
data class Employee(val firstName: String,
                     val lastName: String,
                     val employeeId: String,
                     val emailAddress: String,
                     var phoneNumber: String,
                     var department: String)
```
That's it!! 100 lines of code reduced to a single line!! Isn't that awesome!! If you want your class to hold data
in Kotlin, just prefix the class declaration with `data` keyword. When Kotlin compiler sees a class being
declared as a data class, it adds the implementation of `equals()`, `hashcode()` and `toString()` methods to it. If
we want to test that:
```Kotlin
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

    //Duplicate Object :
    val shyamImpersonator = Employee("Shyam", "B", "U4567", "shyam@tr.com", "+9180123456", "F&R")
    println(shyam.equals(shyamImpersonator))

}
```
There are two employee objects which are distinct and there is a third employee object which is replication
of an existing object. This produces the result:
> false
>
> -204274192
>
> Employee(firstName=Shyam, lastName=B, employeeId=U4567, emailAddress=shyam@tr.com, phoneNumber=+9180123456, department=F&R)
>
> true

## Interfaces
Implementing interfaces in Kotlin is very similar to implementing interfaces in other programming languages.
Lets create an interface and implement it:
```Kotlin
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
```
`FlyableBird` is an interface which has `fly()` method. `Bird` implements `FlyableBird` and overrides `fly()`
method. Running the above code snippet will produce a result of:
> Dove can fly up to 34.6 mts!

## Null Safety
Null safety is built directly into Kotlin. By default, a null value cannot be assigned to a variable. If a null value
is assigned to a variable, it gives a compile time error. However, null values can be explicitly allowed to be
set into a variable:
```Kotlin
fun main(args: Array<String>) {
  var email : String? = null
}
```
Adding a question mark ("?") after the data type will allow the variable to hold a null value.
There might be some functions that may return null values. In that case, just add a question mark ("?") after
specifying the return type:
```Kotlin
fun returningNull() : String? {
  return null
}
```
There is a provision in Kotlin where, if a value returned from a function is assigned to a variable and if this
value turns out to be null, the variable can then have a default value assigned to it:
```Kotlin
fun returningNull() : String? {
  return null
}

fun main(args: Array<String>) {
  var nullVal : String = returningNull() ?: "No Content!!"
  println(nullVal)
}
```
In this code snippet, `returningNull()` method returns a null value which is assigned to a variable called
`nullVal`. By using an **elvis operator**, a default value can be specified. This default value will be assigned to
the variable only if the method call returns null (true in this case).
