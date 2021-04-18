import java.util.*
import kotlin.system.exitProcess


fun moreColections() {
val mix = arrayOf("gente", 12)
    println(Arrays.toString(mix))

    //iterator in array
    var ar = Array (5) {it }
    println(Arrays.toString(ar))
//    for loop
    for(e in ar) print(" $e")

    //index and element
    ar = Array (10) {it* 3}
    for((index, e) in ar.withIndex()) {
        println(" $e at $index")
    }
    for ((i, e) in mix.withIndex()) println(" $e at $i ")
}


fun main(args: Array<String>) {
    moreColections()
    exitProcess(0)

    println("Collections")
    val names = listOf("Dorival", "ma", "Rafa", "Du", "Vagner")
    println(names.contains("Doriva"))

    val rebels = arrayListOf("Mad", "Bad", "Terrible")
    println(rebels.size)
    rebels.add("Dori")
    println(rebels.size)
    println(rebels)
    rebels.add(0, "Ma")
    println(rebels)
    println(rebels.indexOf("Ma"))

    rebels.remove("Mad")
    println(rebels)

    val couple = mapOf("Dorival" to "Marlene", "Rafa" to "Jessica", "Dudu" to "Nora")
    println(couple)
    println(couple["Dorival"])

    val hash = hashMapOf("Dorival" to "Marlene", "Rafa" to "Jessica", "Dudu" to "Nora")
    println(hash)

    hash["Rafa1"] = "Galera"
    hash["Rafa10"] = "Wisk"
    println(hash)

    hash.remove("Rafa")
    println(hash)
}
