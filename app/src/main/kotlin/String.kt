fun main(args: Array<String>) {
    println("Starting")

//    val str = "may the force\b\b be\n with you"
    val str = "may the force be with you"
    println(str)

    val raw  = """
        |May Dorival
        |the force
        |be 
        |with you 
        """/*.trimMargin()*/.trimIndent()
//    """.trimIndent()
    println(raw)
    println("#####################")
    println(str.contentEquals("dorival"))
    println(str.toString().contains("Dorival", true))//deu False
    var num = 6
    val snum = num.toString()
    println("Concat: "+ snum+snum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)
    println(" Subsequence is $subsequence and num is $num and snum is $snum ")

    val luke = "Luke Skyawalker"
    val sabeColor = "green"

    println("Warior $luke has a $sabeColor saber and his name is ${luke.toUpperCase()} ")

    println ("fish" == "fish")
//            .filter { i -> !" ".equals(i)&& !"\r\n".equals(i) }
//            .filter { e->"w".contentEquals (e) }
//            .filter { i-> i % 2=0 }
//            .forEach { e-> println(e) }
//    str.forEach {i-> println(i) }
}