fun main(args: Array<String>){

    println("Collections")
    val names = listOf("Dorival", "ma", "Rafa", "Du", "Vagner")
    println(names.contains("Doriva"))

    val rebels = arrayListOf("Mad", "Bad", "Terrible")
    println(rebels.size)
    rebels.add("Dori")
    println(rebels.size)
    println(rebels)
    rebels.add(0,"Ma")
    println(rebels)
    println(rebels.indexOf("Ma"))

    rebels.remove("Mad")
    println(rebels)

    val couple = mapOf("Dorival" to "Marlene", "Rafa" to "Jessica", "Dudu" to "Nora")
    println(couple)
    println( couple["Dorival"])

    val hash = hashMapOf("Dorival" to "Marlene", "Rafa" to "Jessica", "Dudu" to "Nora")
    println(hash)

    hash["Rafa1"] = "Galera"
    hash["Rafa10"] = "Wisk"
    println(hash)

    hash.remove("Rafa")
    println(hash)
}
