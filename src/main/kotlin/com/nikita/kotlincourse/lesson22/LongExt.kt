package com.nikita.com.nikita.kotlincourse.lesson22


fun Long?.toFormattedString(): String {
    return this?.toString() ?: "Null Long value"
}