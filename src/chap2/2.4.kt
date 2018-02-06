package chap2

import java.util.*


fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}


fun main(args: Array<String>) {

    /*
    //for (i in 1..100) {
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
    */

    /*
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    */

    val l = arrayListOf("10", "11", "1001")
    for ((index, element) in l.withIndex()) {
        println("$index: $element")
    }

}