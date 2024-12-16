package com.nikita.com.nikita.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun formatTemporalCustom(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            temporal.format(formatter)
        }
        is LocalDate -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
            temporal.format(formatter)
        }
        is LocalTime -> {
            val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
            temporal.format(formatter)
        }
        is ZonedDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV")
            temporal.format(formatter)
        }
        is OffsetDateTime -> {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z")
            temporal.format(formatter)
        }
        is OffsetTime -> {
            val formatter = DateTimeFormatter.ofPattern("HH:mm:ss Z")
            temporal.format(formatter)
        }
        else -> "Unsupported Temporal type"
    }
}

fun formatTemporalISO(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        is OffsetTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_TIME)
        else -> "Unsupported Temporal type"
    }
}

fun main() {
    val localDate = LocalDate.now()
    val localTime = LocalTime.now()
    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val offsetDateTime = OffsetDateTime.now()
    val offsetTime = OffsetTime.now()

    println("Custom Formatting:")
    println("LocalDate: ${formatTemporalCustom(localDate)}")
    println("LocalTime: ${formatTemporalCustom(localTime)}")
    println("LocalDateTime: ${formatTemporalCustom(localDateTime)}")
    println("ZonedDateTime: ${formatTemporalCustom(zonedDateTime)}")
    println("OffsetDateTime: ${formatTemporalCustom(offsetDateTime)}")
    println("OffsetTime: ${formatTemporalCustom(offsetTime)}")

    println("\nISO Formatting:")
    println("LocalDate: ${formatTemporalISO(localDate)}")
    println("LocalTime: ${formatTemporalISO(localTime)}")
    println("LocalDateTime: ${formatTemporalISO(localDateTime)}")
    println("ZonedDateTime: ${formatTemporalISO(zonedDateTime)}")
    println("OffsetDateTime: ${formatTemporalISO(offsetDateTime)}")
    println("OffsetTime: ${formatTemporalISO(offsetTime)}")
}