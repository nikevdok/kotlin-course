package com.nikita.com.nikita.kotlincourse.lesson25.Homework


fun calculateAverage(numbers: List<Int>): Double {
    require(numbers.isNotEmpty()) { "Список не должен быть пустым." }
    return numbers.average()
}


val anonymousAverageFunction = fun(numbers: List<Int>): Double {
    require(numbers.isNotEmpty()) { "Список не должен быть пустым." }
    return numbers.average()
}


val lambdaAverageWithType: (List<Int>) -> Double = { numbers ->
    require(numbers.isNotEmpty()) { "Список не должен быть пустым." }
    numbers.average()
}


val lambdaAverageWithoutType = { numbers: List<Int> ->
    require(numbers.isNotEmpty()) { "Список не должен быть пустым." }
    numbers.average()
}

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = emptyList<Int>()

    println("Среднее через функцию: ${calculateAverage(list1)}")

    println("Среднее через анонимную функцию: ${anonymousAverageFunction(list1)}")

    println("Среднее через лямбду с типом: ${lambdaAverageWithType(list1)}")

    println("Среднее через лямбду без типа: ${lambdaAverageWithoutType(list1)}")
}