package com.nikita.com.nikita.kotlincourse.lesson18.Homework18

abstract class Printer {
    protected fun splitAndPrint(text: String, printWord: (String) -> Unit) {
        val words = text.split(" ")
        for (word in words) {
            printWord(word)
        }
    }

    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        splitAndPrint(text) { word ->
            println("\u001B[30;47m$word\u001B[0m") // Черный текст на белом фоне
        }
    }
}

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        "\u001B[31;43m", // Красный текст на жёлтом фоне
        "\u001B[34;42m", // Синий текст на зелёном фоне
        "\u001B[35;46m", // Фиолетовый текст на бирюзовом фоне
        "\u001B[33;45m", // Жёлтый текст на фиолетовом фоне
        "\u001B[32;41m"  // Зеленый текст на красном фоне
    )

    override fun print(text: String) {
        var colorIndex = 0
        splitAndPrint(text) { word ->
            val color = colorPairs[colorIndex % colorPairs.size]
            println("$color$word\u001B[0m")
            colorIndex++
        }
    }
}

fun main() {
    val longText = "Kotlin is a modern programming language that makes developers happier. It's concise, safe, and fully interoperable with Java."

    val laserPrinter = LaserPrinter()
    println("Laser Printer Output:")
    laserPrinter.print(longText)

    val inkjetPrinter = InkjetPrinter()
    println("\nInkjet Printer Output:")
    inkjetPrinter.print(longText)
}
