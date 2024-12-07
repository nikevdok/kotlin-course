package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun higherOrderFunction(func: (Double, Double) -> Boolean): Boolean {
    return func(3.14, 2.71)
}

fun main() {
    val result = higherOrderFunction { a, b ->
        a > b && a + b > 5.0
    }
    println(result)
}
