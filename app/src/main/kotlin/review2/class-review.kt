import java.lang.IllegalArgumentException

class Empty

val obj = Empty()

class PersonOld{
    var name = "Dorival"
    var age = 48
}

class PersonOld2(firstName: String, lastname: String, yearOfBirth: Int){
    val fullName = "$firstName $lastname"
    var age: Int
    init{
        age = 2020 - yearOfBirth
    }
}

class Person (name: String, age: Int){
    var name: String;
    var age = 0
    set (value){
        if(value < 0)
            throw IllegalArgumentException("")
    }

    init {
        this.name = name
        this.age = age
    }

    val isNewBorn
        get() = age ==0

    fun marry(spouse: Person){
        println("$name and $spouse are getting married")
    }
}


fun main(){
    println(obj.javaClass)
//    val a = Person()
//    val b = Person()
//    println("Detailed ${a.age}  ${b.age}")
//    val pp = Person("Dorival", "Querino", 1972)
//    println("${pp.fullName}")
//    println("${pp.age}")
    val pp = Person("Dorival", 48)
    println(pp.isNewBorn)

    val Lisa  =  Person("Lisa", 25)
    val Anne  =  Person("Anne", 22)
    //println (lisa marry ane)

}