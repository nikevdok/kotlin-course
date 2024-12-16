package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val workspaceDir = File("workspace")
    val directories = mutableListOf<String>()
    val files = mutableListOf<String>()

    workspaceDir.walkTopDown().forEach { file ->
        if (file.isDirectory) {
            directories.add(file.path)
        } else {
            files.add(file.path)
        }
    }

    println("Пути директорий:")
    directories.forEach { println(it) }

    println("\nПути файлов:")
    files.forEach { println(it) }
}
