package com.nikita.com.nikita.kotlincourse.lesson23

fun sumIntOrDoubleValues(data: List<Any>): Double {
    return data.fold(0.0) { sum, element ->
        when (element) {
            is Int -> sum + element.toDouble()
            is Double -> sum + element
            else -> sum
        }
    }
}