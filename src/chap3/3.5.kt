package chap3

fun parsePath(path: String) {

    /*
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    */

    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}



fun main(args: Array<String>) {
//    println("12.345-6.A". split("\\.|-".toRegex()))
//    println("12.345-6.A". split(".", "-"))

    parsePath("/Users/mono/kotlin-book/chapter.adoc")
}