package coroutine

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis


data class User(val name: String){

}

fun main() {
    var user: User? = null
    if (user == null) {
        println(" user= $user ")
    }

    user = User("Dori")
    user?.let{
        println("user again = $user")
    }
    //timer mmilis
    val helloTook = measureNanoTime {
        println(" Hello everyone ")
    }
    println(helloTook)

    val tookMilis = measureTimeMillis {
        println("Mili: Hello everyone again! " )
    }
    println(tookMilis)
}