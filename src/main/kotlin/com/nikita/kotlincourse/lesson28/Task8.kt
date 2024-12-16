package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.createDirectories

fun main() {
    val filePaths = listOf(
        "workspace/task10/data/1/4/prod/data14.mysql",
        "workspace/task10/data/2/3/prod/data23.mysql",
        "workspace/task10/data/5/2/prod/data52.mysql"
    )

    filePaths.forEach { path ->
        val file = File(path)
        file.parentFile.mkdirs()
        file.createNewFile()
    }

    val backupDir = File("workspace/task10/backup")
    backupDir.mkdirs()

    val sourceDir = Path("workspace/task10/data")
    val destinationDir = Path("workspace/task10/backup")

    Files.walk(sourceDir).forEach { source ->
        val destination = destinationDir.resolve(sourceDir.relativize(source))
        if (Files.isDirectory(source)) {
            destination.createDirectories()
        } else {
            source.toFile().copyTo(destination.toFile(), overwrite = true)
        }
    }

    println("Файлы успешно скопированы в директорию backup с сохранением структуры.")
}
