import kotlin.random.Random

fun main(args: Array<String>) {
    val a = 2
    val b = 2
    if (a == b) println("yes") else println("not")

    var price = 50
    var balance = 100
    if (price <= balance) {
        println("you can buy")
    } else {
        println("you can´t buy")
    }
    val degres = 20
    if (degres >= 70) {
        println("Cant enter")
    } else if (degres == 70) {
        println("On the limit")
    } else {
        println("Grab your seet")
    }
//    var values =[1,2,3,4,5,6]

    fun position(seed: Int){
        var position = 1;
        position = Random(seed).nextInt(15)
        when (position) {
            1 -> println("Gold")
            2, 3 -> println("Silver")
            in 4..10 -> println("Retardatários")
        }
        println(position)
    }

    for (i in 1..15){
        position(i)
    }
}