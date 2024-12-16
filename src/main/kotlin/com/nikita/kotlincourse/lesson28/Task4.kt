package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val tempDir = File("workspace/task4/temp")
    tempDir.mkdirs()

    File(tempDir, "dir1").mkdir()
    File(tempDir, "dir2").mkdir()

    File(tempDir, "file1.txt").writeText("Это файл 1")
    File(tempDir, "file2.txt").writeText("Это файл 2")

    val allCreated = tempDir.listFiles()?.size == 4
    println("Все файлы и директории созданы: $allCreated")

    File("workspace/task4").deleteRecursively()

    val isDeleted = !File("workspace/task4").exists()
    println("Директория workspace/task4 удалена: $isDeleted")
}
