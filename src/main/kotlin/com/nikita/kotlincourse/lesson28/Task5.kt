package com.nikita.com.nikita.kotlincourse.lesson28

import java.io.File
import java.io.BufferedWriter

fun main() {
    val configDir = File("workspace/task5/config")
    configDir.mkdirs()

    val parameters = mapOf(
        "host" to "localhost",
        "port" to "8080",
        "username" to "admin",
        "password" to "secret"
    )

    File(configDir, "config.txt").bufferedWriter().use { writer ->
        parameters.forEach { (key, value) ->
            writer.write("$key=$value\n")
        }
    }

    val values = File(configDir, "config.txt").readLines().map { line ->
        line.split("=")[1]
    }

    println("Значения параметров:")
    values.forEach { println(it) }
}
