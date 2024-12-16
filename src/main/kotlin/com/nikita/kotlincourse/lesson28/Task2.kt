package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val directory = File("workspace/task2/testDir")
    directory.mkdirs()

    val isDirectory = directory.isDirectory

    val absolutePath = directory.absolutePath

    println("Является ли путь директорией: $isDirectory")
    println("Абсолютный путь: $absolutePath")
}
