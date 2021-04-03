fun main() {

    println("@@ Loops")
    val hash = hashMapOf("Dorival" to "Marlene", "Rafa" to "Jessica", "Dudu" to "Norminha")
    val names = listOf("Doriva", "ma", "Rafa", "Du", "Vagner")

    for (name in names) {
        println("Name = $name")
    }

    for ((key, value) in hash) {
        println("Key = $key and Value = $value")
    }
    var x = 10
    while (x > 0) {
        print(x--)
    }
}
