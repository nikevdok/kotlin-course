package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun applyToNumbers(numbers: List<Int>, transform: (Int) -> Int): List<Int> {
    return numbers.map(transform)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubled = applyToNumbers(numbers) { it * 2 }
    println(doubled)

    val squared = applyToNumbers(numbers) { it * it }
    println(squared)
}