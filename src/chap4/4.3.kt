package chap4


class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}



fun main(args: Array<String>) {
    val mono = User("최희성")
    mono.address = "fdsafdsafdsafdsafdsafsdf"
    println(mono.address)

}


