package com.nikita.com.nikita.kotlincourse.lesson25.Homework


const val TEXT = "Hello, Kotlin!"


fun printConstant() {
    println(TEXT)
}


val anonymousFunction = fun() {
    println(TEXT)
}


val lambdaWithType: () -> Unit = {
    println(TEXT)
}


val lambdaWithoutType = {
    println(TEXT)
}

fun main() {
    printConstant()
    anonymousFunction()
    lambdaWithType()
    lambdaWithoutType()
}