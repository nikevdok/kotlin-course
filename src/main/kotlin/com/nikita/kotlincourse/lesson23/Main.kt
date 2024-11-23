package com.nikita.com.nikita.kotlincourse.lesson23


fun main() {
    analyzeDataType("Привет, Kotlin!")
    analyzeDataType(42)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("ключ1" to "значение1", "ключ2" to "значение2"))
    analyzeDataType(3.14)

    println(safeCastToList(listOf(1, 2, 3))) // Вывод: 3
    println(safeCastToList("строка")) // Вывод: -1
    println(safeCastToList(mapOf(1 to "one"))) // Вывод: -1

    println(getStringLengthOrZero("Hello, Kotlin!")) // Вывод: 14
    println(getStringLengthOrZero(123))            // Вывод: 0
    println(getStringLengthOrZero(null))           // Вывод: 0

    println(squareOfNumber(4))        // 16.0
    println(squareOfNumber(4.2))      // 17.64
    println(squareOfNumber("4.2"))    // 17.64
    println(squareOfNumber("abc"))    // null
    println(squareOfNumber(true))     // null

    val data = listOf(1, 2.5, "hello", 3, 4.1, true, 5)
    val result = sumIntOrDoubleValues(data)
    println("Сумма числовых значений: $result") // Вывод: Сумма числовых значений: 15.6

    val mixedList = listOf("Hello", 123, "World", true, "Kotlin")
    val notAList = 42

    tryCastToListAndPrint(mixedList)
    tryCastToListAndPrint(notAList)
}