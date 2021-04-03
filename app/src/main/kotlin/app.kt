//val = read only var
val k:Int = 4
//k+k 4*4
val o = 3//inferred type
val t:Double = 9.0

//var = Mutalbe variables
var l =10
var i = 11;
var n:Int = 3
var count:Int = 0

fun mult(a:Int, b:Int): Int{
    count = count + 1
    return a*b
}

//Main function
fun main(args:Array<String>){
    println(mult(4, 5))

    println("The count is ${count}")
    println(hi("Dorival"))
}

// inline function
fun hi (name: String) = "Hi $name"