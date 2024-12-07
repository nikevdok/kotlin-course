package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun higherOrderExtensionFunction(extFunc: Int.(String) -> Boolean): Boolean {
    return 10.extFunc("test")
}

fun main() {
    val result = higherOrderExtensionFunction { str ->
        this % 2 == 0 && str.length > 3
    }
    println(result)
}

