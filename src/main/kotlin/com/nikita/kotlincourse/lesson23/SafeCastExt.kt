package com.nikita.com.nikita.kotlincourse.lesson23


fun safeCastToList(data: Any): Int {
    val list = data as? List<*>
    return list?.size ?: -1
}