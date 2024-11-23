package com.nikita.com.nikita.kotlincourse.lesson24

fun main() {
    // NullPointerException
    try {
        val nullable: String? = null
        println(nullable!!.length) // Попытка обратиться к null
    } catch (e: NullPointerException) {
        println("NullPointerException пойман: ${e.message}")
    }

    // ArrayIndexOutOfBoundsException
    try {
        val array = arrayOf(1, 2, 3)
        println(array[3]) // Индекс вне диапазона
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException пойман: ${e.message}")
    }

    // ClassCastException
    try {
        val obj: Any = "This is a string"
        val num = obj as Int // Некорректное приведение
    } catch (e: ClassCastException) {
        println("ClassCastException пойман: ${e.message}")
    }

    // NumberFormatException
    try {
        val number = "notANumber".toInt() // Попытка преобразования некорректной строки
    } catch (e: NumberFormatException) {
        println("NumberFormatException пойман: ${e.message}")
    }

    // IllegalArgumentException
    try {
        require(false) { "Неправильный аргумент!" } // Нарушение требования
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException пойман: ${e.message}")
    }

    // IllegalStateException
    try {
        val list = mutableListOf<Int>()
        list.iterator().remove() // Попытка удалить элемент без вызова next()
    } catch (e: IllegalStateException) {
        println("IllegalStateException пойман: ${e.message}")
    }

    // OutOfMemoryError
    try {
        val hugeArray = IntArray(Int.MAX_VALUE) // Памяти недостаточно
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError пойман: ${e.message}")
    }

    // StackOverflowError
    try {
        fun recursiveCall(): Int = recursiveCall() // Рекурсивный вызов без завершения
        recursiveCall()
    } catch (e: StackOverflowError) {
        println("StackOverflowError пойман: ${e.message}")
    }
}