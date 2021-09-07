
class User(var firstName: String, var lastName: String){

    var fullName : String = "$firstName $lastName"
        get() = "Name : $field"
        set(value){
            field = if (value.startsWith("Bùi")) "Xin chào đại ca $value" else value
        }
    var age : Int = 0
}

fun main(){
    val myUser = User("Bùi","Hòa")
    println(myUser.fullName)

    myUser.age = 21
    println(myUser.age)

    myUser.fullName = "Bùi Huy Hòa"
    println(myUser.fullName)
}