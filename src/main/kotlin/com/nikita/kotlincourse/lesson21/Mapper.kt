package com.nikita.com.nikita.kotlincourse.lesson21


interface Mapper<T, R> {
    fun transform(input: T): R
    fun transformList(input: List<T>): List<R>
}