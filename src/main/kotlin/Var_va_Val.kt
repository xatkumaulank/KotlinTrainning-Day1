


fun main(){
    // Từ khóa var cho phép biến đó là mutable, tức là có thể thay đổi được giá trị
    // Sử dụng khi biến đó cần phải thay đổi giá trị trong quá trình code
    var fullName : String = "Bùi Huy Hòa"
    println(fullName)

    fullName = "Bùi Hòa"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty())

    var age = 21
    println(age)


    // Từ khóa val cho phép biến đó là immutable, tức là không thể thay đổi được giá trị
    // Sử dụng khi không muốn thay đổi giá trị biến đó
    val fullName2 : String = "Bùi Huy Hòa"
    println(fullName2)

    // ko thể reassign fullName2 = "Bùi Huy Hòa 2"

}