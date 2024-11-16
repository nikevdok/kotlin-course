package com.nikita.com.nikita.kotlincourse.lesson22


fun String.encrypt(base: Int): String {
    return this.map { char ->
        (char.code + base).toChar()
    }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { char ->
        (char.code - base).toChar()
    }.joinToString("")
}