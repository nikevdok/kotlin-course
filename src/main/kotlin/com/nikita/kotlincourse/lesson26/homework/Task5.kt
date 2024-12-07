package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun <T> higherOrderFunction(func: (T) -> List<T>): List<T> {
    val initialValue: T = TODO("Provide an initial value of type T")
    return func(initialValue)
}

fun main() {
    val result = higherOrderFunction<Int> { num ->
        List(5) { num + it }
    }
    println(result)

    val stringResult = higherOrderFunction<String> { str ->
        List(3) { "$str$it" }
    }
    println(stringResult)
}

