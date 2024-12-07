package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun higherOrderFunction(func: (Int) -> String): String {
    return func(42)
}

fun main() {
    val result = higherOrderFunction { num ->
        "Число $num в квадрате равно ${num * num}"
    }
    println(result)
}
