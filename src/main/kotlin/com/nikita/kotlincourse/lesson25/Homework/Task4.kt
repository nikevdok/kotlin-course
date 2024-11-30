package com.nikita.com.nikita.kotlincourse.lesson25.Homework

fun sumOfDigits(number: Long): Int {
    require(number >= 0) { "Число должно быть неотрицательным." }
    return number.toString().sumOf { it.digitToInt() }
}

val anonymousSumOfDigitsFunction = fun(number: Long): Int {
    require(number >= 0) { "Число должно быть неотрицательным." }
    return number.toString().sumOf { it.digitToInt() }
}

val lambdaSumOfDigitsWithType: (Long) -> Int = { number ->
    require(number >= 0) { "Число должно быть неотрицательным." }
    number.toString().sumOf { it.digitToInt() }
}

val lambdaSumOfDigitsWithoutType = { number: Long ->
    require(number >= 0) { "Число должно быть неотрицательным." }
    number.toString().sumOf { it.digitToInt() }
}

fun main() {
    val largeNumber = 1234567890L
    val zero = 0L
    val negativeNumber = -12345L

    println("Обычная функция: ${sumOfDigits(largeNumber)}")
    println("Анонимная функция: ${anonymousSumOfDigitsFunction(largeNumber)}")
    println("Лямбда с типом: ${lambdaSumOfDigitsWithType(largeNumber)}")
    println("Лямбда без типа: ${lambdaSumOfDigitsWithoutType(largeNumber)}")

    println("Обычная функция с нулём: ${sumOfDigits(zero)}")

    try {
        println(sumOfDigits(negativeNumber))
    } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }
}