import example.*

/**
 * Created by dani on 5/23/17.
 */

fun main(args: Array<String>) {
    val udin = Person("Muhtarudin", "Siregar")
    println(udin.fullName)
    println(udin.greet())

    val rudy = Employee("Rudy", "Dwi", "Nyunmor")
    println(rudy.fullName)
    println(rudy.greet())

    val gajBook = Book("Mandenomaiya", 35.0)
    println(gajBook.title)
    println(gajBook.price)

    val box1 = Box<Int>(10)
    println(box1.value)

    fun double(x: Int) = x * 2
    println(double(4))

    val intJSON = toJSON(listOf(1, 2, 3, 4, 5))
    println(intJSON)
}