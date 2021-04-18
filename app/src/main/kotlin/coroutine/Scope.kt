package coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//Every coroutine has its scope
fun main() = runBlocking {
    println(" runBlocking : $this")
    launch {
        println("Launch $this")

        launch {
            println(" child laund: $this")
        }
    }

    async {
        println(" run async : $this")

    }
    println(" run other code")
}
//every coroutine has its coroutine context

class Scope {
}