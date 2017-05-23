package example

/**
 * Created by dani on 5/23/17.
 */
open class Person (val firstName: String, val lastName: String) {

    val fullName: String
        get() = "$lastName $firstName"

    open fun greet(): String {
        return "Hello $fullName"
    }
}
