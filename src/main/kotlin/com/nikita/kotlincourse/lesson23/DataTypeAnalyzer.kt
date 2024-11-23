package com.nikita.com.nikita.kotlincourse.lesson23

fun analyzeDataType(data: Any) {
    when (data) {
        is String -> println("Это строка: $data")
        is Int -> println("Это целое число: $data")
        is List<*> -> println("Это список, количество элементов: ${data.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${data.size}")
        else -> println("Неизвестный тип данных")
    }
}
