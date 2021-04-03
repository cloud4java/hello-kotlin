fun main() {
    fun forceChocke() {
        println("Ok")
    }

    forceChocke()

    fun makeEntrance(line: String) {
        println(line)
    }
    makeEntrance("I found the love, for me")

    fun calculeteNumberGuys(rebels: Int, ewoks: Int): Int {
        val good = rebels + ewoks
        return good;
    }

    val good = calculeteNumberGuys(5, 7)
    println("Dart faced against  $good  guys")
    println("Dart faced against ${calculeteNumberGuys(5,7)} rebel scum")

    fun vaderFelings(mood: String = "Angry"){
        println(mood)
    }
    vaderFelings()
    vaderFelings("Awesome!!!")
}