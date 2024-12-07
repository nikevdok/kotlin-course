package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun timeTracker(action: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}

fun main() {
    val myFunction = {
        val list = List(10_000_000) { (0..10_000).random() }
        list.sorted()
    }

    val executionTime = timeTracker(
        action = TODO()
    )
    println("Время выполнения функции: $executionTime миллисекунд")
}
