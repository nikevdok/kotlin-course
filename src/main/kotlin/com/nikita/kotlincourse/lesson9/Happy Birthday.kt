package com.nikita.com.nikita.kotlincourse.lesson9

import java.time.LocalDate

fun main() {
    val teacherName = "Александр"
    val birthdayDate = LocalDate.of(LocalDate.now().year, 10, 2)

    if (LocalDate.now().isEqual(birthdayDate)) {
        congratulate(teacherName)
    } else {
        println("Сегодня не день рождения $teacherName.")
    }
}

fun congratulate(teacherName: String) {
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
