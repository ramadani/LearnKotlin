import example.Person

/**
 * Created by dani on 5/23/17.
 */

fun main(args: Array<String>) {
    val person = Person("Muhtarudin", "Siregar")

    println(person.fullName)
    println(person.greet())
}