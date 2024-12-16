package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File

fun main() {
    val baseDir = File("workspace/task3/structure/myDir")
    baseDir.mkdirs()
    File(baseDir, "subDir1").mkdir()
    File(baseDir, "subDir2").mkdir()

    val subdirs = listOf("subDir1", "subDir2")
    val actualSubdirs = baseDir.listFiles()?.filter { it.isDirectory }?.map { it.name } ?: emptyList()

    val allSubdirsExist = subdirs.all { it in actualSubdirs }

    println("Все поддиректории существуют: $allSubdirsExist")
    println("Фактические поддиректории: $actualSubdirs")
}
