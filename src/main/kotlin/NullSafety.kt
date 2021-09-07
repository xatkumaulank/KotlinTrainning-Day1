


fun main(){
    // Xác định một biến có thể null bằng cách thêm dấu "?" vào cuối kiểu khai báo của nó
    var name : String? = "Bùi Huy Hòa"
    name = null

    var person : Person? = Person("Hòa")
    person = null


    var firstName: String? = "Bùi"
    var a = firstName?.length
    // Dấu ? kiểm tra xem firstName có null hay ko? Nếu có thì firstName?.length sẽ không truy xuất tới và a = null
    // Nêu không thì trả về firstName.length
    println(a)

    val length = firstName?.substring(0,2)?.length
    //Kiểm tra xem firstName có null hay ko? Nếu firstName = null thì length = null
    //Nếu không thì cắt lấy 2 ký từ đầu tiên và kiểm tra có null hay ko?
    //Nếu có thì length = null, nếu không thì trả về firstName?.substring(0,2)?.length

    // Toán tử Elvis
    val b : Int = firstName?.length ?: 0
    //Nếu firstName?.length không null thì b sẽ có giá trị của firstName?.length, ngược lại thì nó sẽ có giá trị bằng 0
}
class Person(val name : String)