package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun executeFunction(operation: () -> Unit) {
    println("Выполняем переданную функцию:")
    operation()
    println("Функция выполнена")
}

fun main() {
    executeFunction {
        println("Привет, это функция без аргументов и возвращаемого значения!")
    }
}
