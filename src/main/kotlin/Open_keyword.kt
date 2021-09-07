open class People(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }

}

class MathTeacher(age: Int, name: String): People(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }


}

class Footballer(age: Int, name: String): People(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main() {
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()


}