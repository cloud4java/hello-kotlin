import java.lang.RuntimeException

//val number = 4
var number = 4

fun main (args:Array<String>){
    //number= 4
    //number = "5"
    println(number)
    println("Hello Kotlin")


    val name = "Bob"
    println("## Hello ${name}")

    val msg = """ 
        This is a message
        written on and sent to $name
    """.trimIndent()
    println(msg)

    //expression vs statements
    val age = 17

    val canVote = if(age >17) "please vote" else "Dont vote"
    println(canVote)


//    "$msg $name"

    println(greet("Jane", "Hello there "))
    println(greet3("Dori"))
    greet2()
    //
    println(review.max(2, 3))
    println(review.max(7, 3, 9, 4))
    val values = intArrayOf(4,5,23,2)
    println(review.max(7, 3, 9, 4, *values, 9, 2))

    //for range
    for(x in 1 .. 10 step 2){
        println(x)
    }
    for(x in  10 downTo 1 step 2){
        println(x)
    }

    //listOf
    val names = listOf("Tom", "Jerry", "Spike")
    for (name in names){
        println(name)
    }
    for (index in names.indices){
        //println(index)
        print("$index ${names.get(index)} ")
        println()
    }

    //when
    process(1)
    process(7)
    process(18)
    process("Hello")

    println(nickName("Dorival"))

    //lambda
    val double = {e: Int -> e*2}
    listOf(1,2,3,4,5,6)
        .filter{e-> e%2 == 0}
        .map(double)
        .forEach({println(it)})
    println(shout())

    //class
    class Car {
        var yearOfRegistration = 2010
        set(value){
            if(value >2017)
                throw RuntimeException("Not i the future")
            field = value
        }

    }
    val car = Car()
    println(car.yearOfRegistration)

    println(Util.geNumberOfCore())

    val car1 = Car1()
    car1.drive()


    val x = 44
    val temp by lazy  {compute(4)}
    if(x>5 && temp > 7)
        println("result...")


    class Pizza{
        infix fun spread(item: String){
            println("Spread $item")
        }
    }
    val pizza = Pizza()
//    pizza.spread("Cheese")
    pizza spread "Cheese"

    operate {  }

    operate{
        it turns "right"
        it turns "left"
    }
}
class Robot{
    val right = "Right"
    val left = "Left"
    infix fun turns(direction: String){
        println("turns $direction")
    }
}

fun operate (func: (Robot) -> Unit){
    println("Called...")
    val robot = Robot()
    with(robot){
        func(robot)
    }
}

/*
operate{
    it turns right
    it turns left
    it runs fast
}
*/
fun compute (n: Int) :Int{
    println("Called...")
    return n
}


class Car1{
//    companion Object{
//        fun kind() : Unit {println("kind called")}
//    }
    fun drive() {println("diving")}
}
object Util{
    fun geNumberOfCore() = 4
}


fun shout(){
    val gret = "helo"
}
fun nickName(name: String): String?{
    if(name =="Robert")
        return "Bob"
    return null;
}

//when
fun process(input:Any){
    when(input){
        1 -> println("you got one")
        7,8 -> println("you got 7 or 8")
        in 12..19 -> println("teen")
        else -> println("Whatever")
    }
}
fun max(vararg numbers:Int) =
    numbers.reduce{max, e-> if(max >e)max else e}

fun greet(name: String , msg: String): String{
    return "$msg $name"
}
fun greet3(name: String , msg: String =  "Hi ${name.length}"): String{
    return "$msg $name"
}
fun greet2() :Unit{
    println("Testing UNIT")
}
