package com.nikita.com.nikita.kotlincourse.lesson25.Homework

fun Map<String, Int>.filterKeysByLengthAndValue(threshold: Int): List<String> {
    val result = this.filter { (key, value) ->
        key.length < value && key.length > threshold
    }.keys.toList()

    if (result.isEmpty()) throw IllegalStateException("Список ключей оказался пустым.")
    return result
}

val anonymousFilterKeysFunction = fun(map: Map<String, Int>, threshold: Int): List<String> {
    val result = map.filter { (key, value) ->
        key.length < value && key.length > threshold
    }.keys.toList()

    if (result.isEmpty()) throw IllegalStateException("Список ключей оказался пустым.")
    return result
}

val lambdaFilterKeysWithType: (Map<String, Int>, Int) -> List<String> = { map, threshold ->
    val result = map.filter { (key, value) ->
        key.length < value && key.length > threshold
    }.keys.toList()

    if (result.isEmpty()) throw IllegalStateException("Список ключей оказался пустым.")
    result
}

val lambdaFilterKeysWithoutType = { map: Map<String, Int>, threshold: Int ->
    val result = map.filter { (key, value) ->
        key.length < value && key.length > threshold
    }.keys.toList()

    if (result.isEmpty()) throw IllegalStateException("Список ключей оказался пустым.")
    result
}

fun main() {
    val testMap = mapOf(
        "one" to 5,
        "two" to 3,
        "three" to 10,
        "short" to 7
    )

    println(testMap.filterKeysByLengthAndValue(2))
    println(anonymousFilterKeysFunction(testMap, 2))
    println(lambdaFilterKeysWithType(testMap, 2))
    println(lambdaFilterKeysWithoutType(testMap, 2))

    try {
        println(testMap.filterKeysByLengthAndValue(10))
    } catch (e: IllegalStateException) {
        println(e.message)
    }
}