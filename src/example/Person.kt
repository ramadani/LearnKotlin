package example

/**
 * Created by dani on 5/23/17.
 */
class Person (val firstName: String, val lastName: String) {

    val fullName: String
        get() = "$lastName $firstName"

    fun greet(): String {
        return "Hello $fullName"
    }
}
