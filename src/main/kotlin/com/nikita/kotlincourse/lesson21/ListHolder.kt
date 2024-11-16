package com.nikita.com.nikita.kotlincourse.lesson21


class ListHolder<T> {
    private val elements = mutableListOf<T>()

    fun addElement(element: T) {
        elements.add(element)
    }

    fun getAllElements(): List<T> = elements.toList()
}