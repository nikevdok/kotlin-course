package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val docsDir = File("workspace/task9/docs")
    docsDir.mkdirs()

    val readmeFile = File(docsDir, "readme.md")

    if (!readmeFile.exists()) {
        readmeFile.writeText("This is a README file.")
        println("Файл readme.md создан и заполнен текстом.")
    } else {
        println("Файл readme.md уже существует.")
    }

    val content = readmeFile.readText()
    println("Содержимое файла: $content")
}
