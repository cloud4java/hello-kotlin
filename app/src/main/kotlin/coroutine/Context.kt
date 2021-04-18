package coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    runBlocking {
        println("Context: $coroutineContext")
    }


    launch {
        println(" C1: ${Thread.currentThread().name} ")
        delay(1000)
        println(" C1 after delay: ${Thread.currentThread().name} ")
    }
    //same global.laundh
    launch(Dispatchers.Default) {
        println(" D1: ${Thread.currentThread().name} ")
        delay(1000)
        println(" D1 after delay: ${Thread.currentThread().name} ")
    }

    //not confined to one thread
    launch (Dispatchers.Unconfined){
        println(" E1: ${Thread.currentThread().name} ")
        delay(1000)
        println(" E1 after delay: ${Thread.currentThread().name} ")

        launch(coroutineContext) {
            println(" F1: ${Thread.currentThread().name} ")
            delay(1000)
            println(" F1 after delay: ${Thread.currentThread().name} ")

        }
    }
    println("Main program ")
}

class Context {
}