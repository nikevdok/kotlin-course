package com.nikita.com.nikita.kotlincourse.lesson24


fun main() {
    try {
        // NullPointerException
        val nullable: String? = null
        println(nullable!!.length) // Попытка обратиться к null

        // ArrayIndexOutOfBoundsException
        val array = arrayOf(1, 2, 3)
        println(array[3]) // Индекс вне диапазона

        // ClassCastException
        val anyValue: Any = "Some String"
        val number = anyValue as Int // Приведение типа к Int

        // NumberFormatException
        val invalidNumber = "abc"
        val numberFromString = invalidNumber.toInt() // Попытка конвертировать строку в число

        // IllegalArgumentException
        throw IllegalArgumentException("Некорректный аргумент")

        // IllegalStateException
        throw IllegalStateException("Неверное состояние")

        // OutOfMemoryError
        val largeArray = Array<Int>(Int.MAX_VALUE) { 0 } // Попытка создать массив огромного размера

        // StackOverflowError
        fun recursive() {
            recursive()
        }
        recursive() // Бесконечная рекурсия
    } catch (e: Exception) {
        when (e) {
            is NullPointerException -> println("Ошибка: попытка обращения к объекту с null значением.")
            is ArrayIndexOutOfBoundsException -> println("Ошибка: выход за пределы массива.")
            is ClassCastException -> println("Ошибка: неправильное приведение типа.")
            is NumberFormatException -> println("Ошибка: неверный формат числа.")
            is IllegalArgumentException -> println("Ошибка: некорректный аргумент.")
            is IllegalStateException -> println("Ошибка: неверное состояние.")
            is OutOfMemoryError -> println("Ошибка: нехватка памяти.")
            is StackOverflowError -> println("Ошибка: переполнение стека из-за рекурсии.")
            else -> println("Неизвестная ошибка: ${e.message}")
        }
    }
}