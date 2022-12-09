import java.util.Objects
import java.util.Scanner
import kotlin.collections.reduce as reduce

class Main1 {
    //    Companion object -> Makes few kotlin missing feature of java work
    companion object {
        @JvmStatic // Static function
        fun staticFunction() {
            // Kotlin doesn't support static that's why to work with java and have static
            // behaviour it has static annotation.
        }

        // Factory design pattern -> It create object of defined class object from multiple classes
        fun create(): Main1 = Main1()
    }
}

fun main() {
    var obj = Main1.create()

//    User input in kotlin
    val scanner = Scanner(System.`in`)
//    print("Enter your name: ")
//    var name = scanner.nextLine()
//    println("Your name is $name.")

//    Kotlin way of user input
    var num = readlnOrNull()
//    readln()
//    readLine()

    var s1 = mutableListOf<String>() // mutable list
    s1.add("Dan")
    s1.add("John")
    s1.add("Brandon")

    s1.forEach(::print)
//    list.forEach(className::println)
    s1.forEach { println(it) }
    s1.forEach { v -> println(v) }

    s1.filter { it.length == 4 } // to filter or find something from list return boolean
    s1.map { } // to change, transform or map list to something
    // val red = s1.reduce() // it also transforms list to defined operation

    // lateinit -> allow us to declare variable but assign value letter on.
    lateinit var names: String
    names = "Card"

//    Null Safety
    // There are still few techniques for using or accessing the nullable variable.
    // One of them is safe call (?.) and another one is null check (!!)

//    safe calls (?.) -> Its way of using a nullable property is safe call operator (?.)
//    Safe calls are useful in chains.
    names?.length?.and(12)

//    Elvis Operator (?:)
//    This one is similar to safe calls except the fact that it can return a non-null value if the calling property is null even

//    fun foo(node: Node): String? {
//        val parent = node.getParent() ?: return null
//        val name = node.getName() ?: throw IllegalArgumentException(“name expected”)
//        // …
//    }

//    The !! Operator (or Not Null Assertion):
//    This operator is used to explicitly tell the compiler that the property is not
//    null and if it’s null, please throw a null pointer exception (NPE).
    names!!.length // not null

//    Type checking (is operator):
    var m1 = Main1()
    if (m1 is Main1) {
        // checks weather m1 belongs to Main1
    }

//    is operator is also used in smart cast:
    lateinit var obj2: Main1
    obj2 is Main1 // smart cast way to cast if object belongs to same class

//    as keyword -> explicitly cast
    lateinit var obj1: Main1
    obj1 as Main1 // Cast

    //    Any type -> Its generic return type where type will be automatically defined by compiler at runtime
    fun tc(): Any {
        return "Tom Cruise World!"
    }

//    Destructuring -> create different object of any object (like js)
    var (name, age) = Person("John", 17)

//    mutable map
    var m3 = mutableMapOf<String, Int>()
    m3["John"] = 17 // way to assign map key and value

//    varargs
}

data class Person(val name: String, val age: Int)
