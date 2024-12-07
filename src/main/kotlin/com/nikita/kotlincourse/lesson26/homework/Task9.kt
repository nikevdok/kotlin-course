package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun createFunction(func: () -> (() -> Unit)): () -> Unit {
    return func()
}

fun main() {
    val myFunction = {
        { println("Привет из вложенной функции!") }
    }
    val nestedFunction = createFunction(myFunction)
    nestedFunction()
}

