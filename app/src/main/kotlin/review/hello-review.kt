package review

import kotlin.system.exitProcess

// Public class default
class A{
    val id =1
}

//Private class
private class B{
    val id = 2
}

//Internal class
internal class C{
    val id = 3
}
/**
Visibility
package:
public - default. Everywhere
private - file
internal - module

class:
    sealed - only subclass in same file

inside class:
    public - default. Everywhere.
private - inside class, not subclasses
protected - inside class and subclasses
internal - module */
/////////////////////////////////////////
fun main() {
    println("Starting review... ${C().id} ${B().id} ${A().id}")
    var number: Int = 5
    number++
    println(number)

    val n1: Int = 10
//    val n1++
    println(n1)

    val name = "Dorival"
    println("Hello $name")

    val msv = """
        This is a message
        And this is the second line
        Bye
    """.trimIndent()
    println(msv)

    val age=18
    val canVote = if(age>17) "Vote" else "Don´t Vote yet"
    println(canVote)

    //msg
    great("Dorival", "Welcome ")
//void
    great2()
    println(max(1,5,2,9,3))

    //when
    process(19)
    process(10)
    process(7)

    println(nickName("Dorival"))
    println(nickName("Robert"))

    //Lambda
    val double = {e: Int -> e*2}
    listOf(1,2,3,4,5,6,7)
        .filter{e->e%2==0}
        .forEach{ println(it)}
    println(shout())
}

//class
class Car{
    var yearOfRegistration = 2010
        set(value){
            if(value>2017)
                throw RuntimeException("Cannot be in future")
            field = value
        }
}

fun shout():Unit{
    val great = "Hello"
}
fun nickName(name: String):String? {
    if(name == "Robert")
        return "Rob"
    return null
}
fun process(input: Any){
    when(input) {
        1 -> println("you got one")
        7,8 -> println("Yout got 7 or 8")
        in 12..19 -> println("A teenager")
        else -> println("Whatever")
    }
}

fun max(vararg numbers:Int):Int = numbers.reduce{max, e-> if(max>e)max else e}

fun great2() {
    println("Hello review.great2")
}

fun great(name:String, msg:String){
    println("$msg $name")
}

