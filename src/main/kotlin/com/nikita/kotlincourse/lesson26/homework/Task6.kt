package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun complexHigherOrderFunction(
    stringFunc: (String) -> Int
): (Int) -> Boolean {
    return { num ->
        val result = stringFunc("Test")
        num > result
    }
}

fun main() {
    val resultFunction = complexHigherOrderFunction { str ->
        str.length * 2
    }

    println(resultFunction(10))  // true
    println(resultFunction(7))   // false
}

