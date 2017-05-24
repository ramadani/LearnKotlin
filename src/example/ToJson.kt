package example

/**
 * Created by dani on 5/24/17.
 */

fun toJSON(collection: Collection<Int>): String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()

    while (iterator.hasNext())
    {
        val element = iterator.next()
        sb.append(element)

        if (iterator.hasNext())
        {
            sb.append(", ")
        }
    }

    sb.append("]")

    return sb.toString()
}