package com.nikita.com.nikita.kotlincourse.lesson23


fun squareOfNumber(data: Any): Double? {
    return when (data) {
        is Number -> data.toDouble() * data.toDouble()
        is String -> data.toDoubleOrNull()?.let { it * it }
        else -> null
    }
}