package review3

fun main() {
    val list = mutableListOf<Int>()
    list += 1
    list += 2
    list.add(4)
    println(list)
longJob()

}
fun myLaunch2() {
    longJob()
}

val myLaunch = {
    println("")
}

fun longJob() {
    java.lang.Thread.sleep(1000)
    println("Long JOb")
}
