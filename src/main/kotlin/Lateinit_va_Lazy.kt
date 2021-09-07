import java.lang.Thread.sleep

class MyUser(var firstName: String, var lastName : String ){

    //Khi khai báo property mà chưa biết nó là gì thì dùng lateinit(khởi tạo sau)
    //Chỉ được dùng với var
    //Không được dùng trong ctor
    //Chỉ dùng cho property ko có custom getter setter và ko phải là kiểu nguyên thủy
    lateinit var favoriteCity : String

    //lazy chỉ được dùng cho các property val
    //không thể không khởi tạo
    //cho phép áp dụng với các property nguyên thủy
    val middleName : String by lazy {
        "Huy"
    }
    private fun fullName() : String = "$firstName $middleName $lastName"

    override fun toString(): String {
        return fullName() + "'s favorite city is $favoriteCity"
    }
}

fun main(){
    var myUser : MyUser = MyUser("Bùi","Hòa")
    myUser.favoriteCity = "Hà Nội"
    println(myUser.toString())
    println(myUser.middleName)
}