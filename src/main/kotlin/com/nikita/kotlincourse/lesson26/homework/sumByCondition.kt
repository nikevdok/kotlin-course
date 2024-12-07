package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun sumByCondition(numbers: List<Int>, condition: (Int) -> Boolean): Int {
    return numbers.filter(condition).sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sumEven = sumByCondition(numbers) { it % 2 == 0 }
    println(sumEven)

    val sumGreaterThanFive = sumByCondition(numbers) { it > 5 }
    println(sumGreaterThanFive)
}


