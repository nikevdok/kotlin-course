package com.nikita.com.nikita.kotlincourse.lesson21


interface Validator<T> {
    fun validate(input: T): Boolean
}