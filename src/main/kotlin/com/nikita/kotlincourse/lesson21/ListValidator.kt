package com.nikita.com.nikita.kotlincourse.lesson21


class ListValidator<T : Number?> : Validator<List<T?>> {
    override fun validate(input: List<T?>): Boolean {
        return input.all { it != null && it.toDouble() != 0.0 }
    }
}