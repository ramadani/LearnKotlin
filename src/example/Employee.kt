package example

/**
 * Created by dani on 5/23/17.
 */


class Employee(firstName: String, lastName: String, val job: String) : Person(firstName, lastName) {
    override fun greet(): String {
        return "$fullName's job is $job"
    }
}