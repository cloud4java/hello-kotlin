import java.lang.IllegalArgumentException

fun plus(){
    val num =10
    var numm =10
    println(num)
    println(++numm)
}
fun handleStr(name: String, msg: String){
    println("Nome e mensagem $name $msg")
}
fun format(){
    val content = """
        <html>
            <body>
            </body>
        </html>
    """.trimIndent()
    print(content)
}
fun great(name: String, msg: String): String{
    return "Nome e mensagem são $name $msg"
}
fun canVote(num: Int){
    when (num){
        1 -> print("One")
        2 -> "Two"
        7, 8 -> "Seven or Eight"
        in 12..18 -> "Teenager"

    }
}

fun canVote2(num: Int): String ?{
   val x = when (num){
        1 ->  "One"
        7,8 -> "Seven or Eight"
        in 12..18 -> "Teenager"
        else -> throw IllegalArgumentException("Inalid parameter num: $num")
    }
//    println("Res = $res")
//    return res
    return x
}
fun maior(vararg nums:Int):Int{
    return nums.reduce{x,e -> if(e>x) e else x}
}
fun nick(name: String): String ?{
    if(name.contains("val"))
        return "Dori"
    else
        return null
}



fun main() {
    plus()
//print ++ a var
//print ++ a val
//    print a String with $
    handleStr("Dorival", "Welcome")
//    print a formatted str with trimm
    format();
//    great("Dorival", "Welcome")//concat a+b w $
  println(); println( great("Dorival", "Hello "))
//  declare val 18 can vote cant vote or optional
//    println(canVote(10))
    println(canVote2(7))
//    receive number, reduce returning the max
    println(maior(10,3,9,6,0))
//    func w when if one=1 if 7,8 7/8 in 12 ..19 teenager else other
    //OK
//    fun return name if name contains or null
    println(nick("Tica"))
//    fun return void
//    create a class car  with set val car if val >now throw ex
//val car = createCar()
    val car = Carro();
println(car)
}

fun helo() {
    println("Hello Kotlin")
}
class Carro{
    var reg = 2019
    set(value){
        if(value > 2017)
            throw IllegalArgumentException("Inválido")
        field = value
    }
}