package com.nikita.com.nikita.kotlincourse.lesson29.homework

import java.time.LocalDate
import java.time.Period

fun main() {
    val birthday = LocalDate.of(1992, 11, 1)
    val currentDate = LocalDate.now()

    val period = Period.between(birthday, currentDate)

    println("Количество лет: ${period.years}")
}
