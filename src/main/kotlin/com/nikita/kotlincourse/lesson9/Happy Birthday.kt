package com.nikita.com.nikita.kotlincourse.lesson9

fun main() {
    val teacherName = "Александр"
    val emojis = listOf("🎉", "🎂", "🎁", "🎈", "🥳")

    println("Привет, $teacherName! 🎉")
    println("Поздравляю тебя с Днём Рождения!")

    for (i in 1..3) {
        for (emoji in emojis) {
            print("$emoji ")
        }
        println("Ура! Ура! Ура!")
    }

    println("Желаю здоровья, счастья и успешного кодинга! 🖥️🚀")
}
