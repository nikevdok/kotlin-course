package com.nikita.com.nikita.kotlincourse.lesson23


fun getStringLengthOrZero(data: Any?): Int {
    return (data as? String)?.length ?: 0
}