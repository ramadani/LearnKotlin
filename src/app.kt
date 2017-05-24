import example.Book
import example.Employee
import example.Person

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
}