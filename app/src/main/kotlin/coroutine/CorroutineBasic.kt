package coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    println(" Main program starts ${Thread.currentThread().name} ")

    GlobalScope.launch {
        println(" Fake program starts ${Thread.currentThread().name} ")
        //Thread.sleep(1500)
        delay(1500)
        println(" Fake program starts ${Thread.currentThread().name} ")
    }
//    Thread.sleep(1800)
//    runBlocking {//creates a coroutines that blocksthe main thread
//        delay(1800)//not a right way to waiting
//    }
    println(" Main program ends ${Thread.currentThread().name} ")

    var myJob: Job = launch {
        println(" Job Launch... ")
        println(" Job Fake program starts: ${Thread.currentThread().name} ")
        //Thread.sleep(1500)
        delay(1500)
        println(" Job Fake program Ends: ${Thread.currentThread().name} ")
    }

    myJob.join()

    println("Job finished: $myJob ")

    var myDeferredJob: Deferred<String> = async {
        println(" DEFERRED Job Launch... ")
        println(" DEFERRED Job Fake program starts: ${Thread.currentThread().name} ")
        delay(1500)
        println(" DEFERRED Job Fake program Ends: ${Thread.currentThread().name} ")
        "Dorival"
    }

//    myDeferredJob.join()
    println("DEFERRED Job finished: ${myDeferredJob.await()} ")

}

class CorroutineBasic {
}