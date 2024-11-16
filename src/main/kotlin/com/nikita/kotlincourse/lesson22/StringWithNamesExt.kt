package com.nikita.com.nikita.kotlincourse.lesson22

fun String.displayWithAuthors(authors: List<String>) {
    if (this.isEmpty() || authors.isEmpty()) {
        println("Ошибка: Пустая строка или список авторов")
        return
    }

    // Выводим по одной букве строки в столбик с именами авторов
    this.forEachIndexed { index, char ->
        val author = authors[index % authors.size]
        println("$author: $char")
    }
}