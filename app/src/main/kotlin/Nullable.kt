fun main() {

    var name:  String = "Dorival"
//    name = null

    var nullableName: String? ="Do"
    nullableName+=" Querino da Silva"
    println(nullableName)
    nullableName = null;
    if(nullableName != null){
        println(nullableName?.length)
    }else{
        println("Null")
    }
    println(nullableName)
    nullableName = "Doriv"
    println(nullableName?.length)

    nullableName = null
    println(nullableName?.length ?: -1)
    nullableName = "Dori"
    println(nullableName!!.length)//if null, have NPE
}