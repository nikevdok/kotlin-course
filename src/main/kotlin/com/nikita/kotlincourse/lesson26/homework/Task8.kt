package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun processNumber(
    number: Int,
    transformer: (Int) -> String
): String {
    return "Результат: ${transformer(number)}"
}

fun main() {
    val result1 = processNumber(5) { num ->
        (num * num).toString()
    }
    println(result1)

    val result2 = processNumber(10) { num ->
        if (num % 2 == 0) "Четное" else "Нечетное"
    }
    println(result2)

    val result3 = processNumber(7) { num ->
        "Число $num в шестнадцатеричной системе: ${num.toString(16)}"
    }
    println(result3)
}

