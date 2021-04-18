package hello.kotlin.scope

class Person() {
    var s: String = ""
    var i: Int = 0

    constructor(s: String, i : Int) : this(){
        this.s = s
        this.i = i
    }

    var name: String = s
    var age: Int = i

    fun create(): Person{
        return Person()
    }
}

fun main() {

    val person = Person("dori", 47)
    with(person) {
        println(name)
        println(age)
    }
    var ageAfter = with(person) {
        println(name)
        println(age)
        age + 5
    }
    println(ageAfter)

    var bio = with(person) {
        println(name)
        println(age)
        "He is a developer self made man"
    }
    val name = ""
    println(bio)

    val p2 =Person("Dori2", 40).apply {
        this.name = "Dori3"
        age = 42
    }

    println(p2.name)
    val p3 = person .let {
        it.age = 47
        it.name = "Dorival3"
    }

    //only enters let if person is not null
    val pNull = null;
    var p5 = pNull?.let {
        //only enters if it´s not null
        createPerson(Person())
    }
}

fun createPerson(person: Person): Person? {
    return null;
}

class ScopeFunction {

}