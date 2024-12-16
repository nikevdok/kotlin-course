package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val directory = File("workspace/task1")
    directory.mkdirs()

    val file = File(directory, "example.txt")
    file.writeText("Hello, Kotlin!")

    val fileExists = file.exists()

    println("Файл существует: $fileExists")
}
