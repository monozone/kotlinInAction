package chap3

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)


fun main(args: Array<String>) {
    //val list = listOf(1,2,3)
    //println(list)
    //println(list.joinToString("; ", "(", ")"))
    println(listOf("one", "two", "three").join(" "))
}