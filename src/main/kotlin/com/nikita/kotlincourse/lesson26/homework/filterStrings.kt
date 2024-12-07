package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun filterStrings(strings: List<String>, filter: (String) -> Boolean): List<String> {
    return strings.filter(filter)
}

fun main() {
    val strings = listOf("apple", "banana", "cherry", "date", "fig", "grape")

    val longStrings = filterStrings(strings) { it.length > 5 }
    println(longStrings)

    val aStrings = filterStrings(strings) { it.startsWith("a") }
    println(aStrings)

    val eStrings = filterStrings(strings) { "e" in it }
    println(eStrings)
}
