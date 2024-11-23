package com.nikita.com.nikita.kotlincourse.lesson24

fun main() {
    try {
        throw CustomAssertionError("Это пользовательское исключение!")
    } catch (e: CustomAssertionError) {
        println("Поймано исключение: ${e.message}")
    }

    try {
        // Создадим массив и попытаемся получить элемент по индексу, который выходит за пределы
        val array = arrayOf(1, 2, 3)
        println(array[5]) // Это вызовет ArrayIndexOutOfBoundsException
    } catch (e: ArrayIndexOutOfBoundsException) {
        // Перехватываем исключение ArrayIndexOutOfBoundsException
        println("Перехвачено исключение ArrayIndexOutOfBoundsException: ${e.message}")
        // Выбрасываем наше собственное исключение
        throw CustomRuntimeException(e)
    }
}