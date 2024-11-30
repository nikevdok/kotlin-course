package com.nikita.com.nikita.kotlincourse.lesson25.Homework

fun filterStringsByLength(strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty()) { "Список строк не должен быть пустым." }
    return strings.filter { it.length >= minLength }
}


val anonymousFilterFunction = fun(strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty()) { "Список строк не должен быть пустым." }
    return strings.filter { it.length >= minLength }
}


val lambdaFilterWithType: (List<String>, Int) -> List<String> = { strings, minLength ->
    require(strings.isNotEmpty()) { "Список строк не должен быть пустым." }
    strings.filter { it.length >= minLength }
}

val lambdaFilterWithoutType = { strings: List<String>, minLength: Int ->
    require(strings.isNotEmpty()) { "Список строк не должен быть пустым." }
    strings.filter { it.length >= minLength }
}


fun main() {
    val testStrings = listOf("Kotlin", "Java", "Swift", "Go", "Python")
    val emptyStrings = emptyList<String>()

    println(filterStringsByLength(testStrings, 5))

    println(anonymousFilterFunction(testStrings, 3))

    println(lambdaFilterWithType(testStrings, 4))

    println(lambdaFilterWithoutType(testStrings, 6))

    try {
        println(filterStringsByLength(emptyStrings, 3))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}