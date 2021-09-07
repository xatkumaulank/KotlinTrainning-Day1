
open class People(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
    open var weight : Int = 0
        get() = field
        set(value) {
            field = value
        }
    open fun displayWeight() : String {
        return "Your weight is $weight kg!"
    }
}

class MathTeacher(age: Int, name: String): People(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }

    override var weight: Int = 0
        get() = field
        set(value) {
            field = value + 10
        }

    override fun displayWeight(): String {
        return "Your weight is ${weight + 10} kg"
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
    t1.weight = 50
    println(t1.weight)
    println(t1.displayWeight())
    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()


}