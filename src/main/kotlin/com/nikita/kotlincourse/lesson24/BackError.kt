package com.nikita.com.nikita.kotlincourse.lesson24


fun main() {
    try {
        // NullPointerException
        val nullable: String? = null
        println(nullable!!.length) // Попытка обратиться к null
    } catch (e: NullPointerException) {
        println("Обработано NullPointerException: ${e.message}")
    }

    try {
        // ArrayIndexOutOfBoundsException
        val array = arrayOf(1, 2, 3)
        println(array[10]) // Индекс вне допустимых границ
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Обработано ArrayIndexOutOfBoundsException: ${e.message}")
    }

    try {
        // ClassCastException
        val any: Any = 123
        val str = any as String // Попытка привести число к строке
    } catch (e: ClassCastException) {
        println("Обработано ClassCastException: ${e.message}")
    }

    try {
        // NumberFormatException
        val number = "abc".toInt() // Попытка преобразовать строку в число
    } catch (e: NumberFormatException) {
        println("Обработано NumberFormatException: ${e.message}")
    }

    try {
        // IllegalArgumentException
        require(1 > 2) { "Аргумент неверен!" } // Условие, которое вызывает исключение
    } catch (e: IllegalArgumentException) {
        println("Обработано IllegalArgumentException: ${e.message}")
    }

    try {
        // IllegalStateException
        val state = false
        check(state) { "Недопустимое состояние!" } // Проверка состояния, вызывающая исключение
    } catch (e: IllegalStateException) {
        println("Обработано IllegalStateException: ${e.message}")
    }

    try {
        // OutOfMemoryError (осторожно, можно замедлить систему)
        val largeArray = IntArray(Int.MAX_VALUE) // Слишком большой массив
    } catch (e: OutOfMemoryError) {
        println("Обработано OutOfMemoryError: ${e.message}")
    }

    try {
        // StackOverflowError (осторожно, может потребоваться перезапуск)
        fun recursive() {
            recursive()
        }
        recursive() // Бесконечная рекурсия
    } catch (e: StackOverflowError) {
        println("Обработано StackOverflowError: ${e.message}")
    }
}