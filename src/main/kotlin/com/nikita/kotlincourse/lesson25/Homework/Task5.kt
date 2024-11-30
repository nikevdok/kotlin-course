package com.nikita.com.nikita.kotlincourse.lesson25.Homework

fun List<Int>.uniqueNumbers(): List<Int> {
    return this.distinct()
}

val anonymousUniqueNumbersFunction = fun(numbers: List<Int>): List<Int> {
    return numbers.distinct()
}

val lambdaUniqueNumbersWithType: (List<Int>) -> List<Int> = { numbers ->
    numbers.distinct()
}

val lambdaUniqueNumbersWithoutType = { numbers: List<Int> ->
    numbers.distinct()
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)

    println("Функция-расширение: ${numbers.uniqueNumbers()}")

    println("Анонимная функция: ${anonymousUniqueNumbersFunction(numbers)}")

    println("Лямбда с типами: ${lambdaUniqueNumbersWithType(numbers)}")

    println("Лямбда без типов: ${lambdaUniqueNumbersWithoutType(numbers)}")

    val emptyList = listOf<Int>()
    println("Пустой список: ${lambdaUniqueNumbersWithType(emptyList)}")
}