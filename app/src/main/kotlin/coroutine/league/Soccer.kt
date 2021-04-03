package coroutine.league

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.LocalDateTime

fun main() {//thread principal
    println("Jogos da Champions League")
    GlobalScope.launch {
        val jogo = "Bayer de Munich"
        val inicioJogo = LocalDateTime.now()
    }
//    launch {
//        val jogo  = "Bayer de Munich"
//        val inicioJogo = LocalDateTime.now()
//    }
}

class Soccer {
    fun exec() {
//        GlobalScope
    }
}