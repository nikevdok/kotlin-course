package com.nikita.com.nikita.kotlincourse.lesson18.Homework18

class Logger {
    fun log(message: String) {
        println("\u001B[32m[INFO] $message\u001B[0m") // Зеленый цвет для INFO
    }

    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33m[WARNING] $message\u001B[0m") // Желтый цвет для WARNING
            "ERROR" -> println("\u001B[37;41m[ERROR] $message\u001B[0m") // Белый текст на красном фоне для ERROR
            "DEBUG" -> println("\u001B[34m[DEBUG] $message\u001B[0m") // Синий цвет для DEBUG
            else -> println("[UNKNOWN] $message")
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        println("\u001B[37;41m[ERROR] ${exception.message}\u001B[0m")
    }
}

fun main() {
    val logger = Logger()

    // Базовый метод
    logger.log("This is an informational message.")

    // Метод с уровнем логирования
    logger.log("WARNING", "This is a warning message.")
    logger.log("ERROR", "This is an error message.")
    logger.log("DEBUG", "This is a debug message.")

    // Метод с списком сообщений
    val messages = listOf("First message", "Second message", "Third message")
    logger.log(messages)

    // Метод с исключением
    try {
        throw IllegalArgumentException("This is an exception message.")
    } catch (e: Exception) {
        logger.log(e)
    }
}
