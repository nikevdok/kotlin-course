package com.nikita.com.nikita.kotlincourse.lesson21


class OddValidator : Validator<Int> {
    override fun validate(input: Int): Boolean {
        return input % 2 != 0
    }
}