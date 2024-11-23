package com.nikita.com.nikita.kotlincourse.lesson23

fun tryCastToListAndPrint(data: Any) {
    val list = data as? List<*>
    if (list == null) {
        println("Ошибка: параметр не является списком")
        return
    }

    list.forEachIndexed { index, element ->
        if (element is String) {
            println("Элемент $index: $element")
        } else {
            println("Элемент $index: предупреждение — это не строка")
        }
    }
}