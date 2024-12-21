package com.nikita.com.nikita.kotlincourse.lesson30.homework

enum class Task3 {
    PASS,
    BROKEN,
    FAILURE
}

fun evaluateTest(test: () -> Unit): Task3 {
    return try {
        test() // Выполняем лямбду
        Task3.PASS // Если выполнено без исключений
    } catch (e: AssertionError) {
        Task3.FAILURE // Если возникло AssertionError
    } catch (e: Exception) {
        Task3.BROKEN // Для всех прочих исключений
    }
}

// Пример использования функции
fun main() {
    val status1 = evaluateTest {
        // Здесь код, который должен выполниться успешно
        println("Тест 1: успешное выполнение")
    }

    val status2 = evaluateTest {
        // Здесь код, который вызывает AssertionError
        assert(false) { "Ошибка проверки" }
    }

    val status3 = evaluateTest {
        // Здесь код, который вызывает другое исключение
        throw RuntimeException("Произошла ошибка")
    }

    println("Статус теста 1: $status1")
    println("Статус теста 2: $status2")
    println("Статус теста 3: $status3")
}
