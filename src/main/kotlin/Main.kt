import java.lang.Exception
import java.math.BigInteger
import java.util.List
import java.util.TreeMap

// About kotlin


// Main function which runs code
fun main(args: Array<String>) {
//    Print statement
    println("Hello World!")

//    Variables
    val constantVariable = 10 // Constant
    var variable = "This is variable" // Mutable variable
//    With types
    val num: Int = 10
    var name: String

//    template string ${variable} OR $Variable
    name = "Brandon"
    println("Your name is $name")

//    if-else
    var p1 = 12
    var p2 = 33
    var res = if (p1 > p2) { // assign to res returned value
        p1 // returns p1
    } else {
        p2 // returns p2
    }
    println(res)

//    nullable ? -> Kotlin is null safe language that's why require to explicitly define null values
    var str: String? = null

//    Switch statements (or when else statement)
//    It doesn't require break and works in java lambda way, also return value
    val n12 = when (name) {
        "First" -> "It's first"
        "Second" -> "It's second"
        "Third" -> "It's third" // returns result
        else -> "What?" // else if default case
    }
    println(n12)

//    Loops
    var numbers = arrayOf(12, 5, 18, 99, 3) // array
    for (num in numbers) {
        print("$num ")
    }

//    Range startPoint .. endPoint
    for (n in 1..10) {
        println(n)
    }

    for (n1 in 1 until 16 step 2) { // create array from 1 to 16 like range. It jum step of 2.
        println(n1)
    }

//    Reverse range
    var numReverseArray = 16 downTo 1 // Creates array from 16 to 1 in reverse order

//    Alphabet range
    var alpha = 'A'..'Z' // array of A to Z characters

//    iterate with index, For in loops
    for ((index, element) in numReverseArray.withIndex()) {
        println("$index : $element")
    }

//    Kotlin has its own collection api with some kotlin way to create collections and some addition feature to improve and enhance working with collection.
    var nums = listOf<Int>(12, 5, 7, 8, 9, 22) // Kotlin list
    var list = List.of(12, 44, 66, 21, 3) // Java list
    var maps = TreeMap<Int, String>()

//    Tuples -> used to access map values
    for ((age, name) in maps) {
    }

//    to keyword -> to assign map value
    var map = mapOf(1 to "Geek", 2 to "For", 3 to "Geek")

//    function call
    addition(12, 4)

//  Named parameter -> during function call you can change order of parameter by specifying parameter name
    calc(interest = 12.4, amt = 4)

//    try catch with return value
    var numb: Int = try {
        str = "12"
        str.toInt()
    } catch (error: Exception) {
        -1
    }

    //    Extension function -> it adds function to existing class
    fun Test.newFunc() {
        println("New function for test class")
    }

    // Creating object of test class
    var testObject = Test()
    val resp = testObject plus1 12 // called infix function
    testObject.newFunc() // called extension function
    testObject.buck() // class method/function call
    testObject.str = "Shawn" // Accessing setter
    println(testObject.str) // Accessing getter
}

//    Access modifier -> by default variable is public, support all access modifiers
public var num = 1
private var k = 2

// function, parameter, and return type of function
fun addition(a: Int, b: Int): Int {
    return a + b
}

// Expression way to declare function
fun expressionFunction(a: Int, b: Int) = a + b

// Function with default parameters
fun calc(
    amt: Int,
    interest: Double = 14.2
) {
// 14.2 is default value if parameter in argument is not filled during function call
}

// Class declaration
// if parameter is required then assigned after class in parentheses. ex- class Test(parameter)
// to inherit class open keyword is required
open class Test() {
    init {
//        default constructor block
        println("Test class default constructor")
    }

    //    Secondary constructor or constructor overloading
    constructor(str: String = "Brandon") : this() {
        println("secondary constructor")
        this.str = str
    }

    open fun buck() {
        println("Hangman")
    }

    // infix function, works in classes only
    infix fun plus1(a1: Int): Int {
        return a1 + 20
    }

    // Operator overloading -> kotlin allow you to overload operators and add custom functionality to it. It works in classes like infix function.
    operator fun plus(a: Int): Int {
        return a + 12
    }

    // Getter & setter
    var str: String
        get() = str
        set(value) {
            str = value
        }
}

// inheritance
class Test1 : Test() {
    override fun buck() {
        println("Adam Page")
    }
}

// Tailrec -> used to calculate big number of recursion to avoid stackoverflow error.
tailrec fun fact(num: BigInteger, result: BigInteger) {
    if (num == BigInteger.ZERO) {
        result
    } else {
        fact(num - BigInteger.ONE, num * result);
    }
}

