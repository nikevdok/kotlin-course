package com.nikita.com.nikita.kotlincourse.lesson22


fun <T> MutableList<T>.addAndGet(element: T?, index: Int): T? {
    return if (element != null && index in 0..this.size) {
        this.add(index, element)
        element
    } else {
        null
    }
}