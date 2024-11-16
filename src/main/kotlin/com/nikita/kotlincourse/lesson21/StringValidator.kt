package com.nikita.com.nikita.kotlincourse.lesson21


class StringValidator : Validator<String?> {
    override fun validate(input: String?): Boolean {
        return input != null && input.isNotBlank()
    }
}