package com.nikita.com.nikita.kotlincourse.lesson22


fun Array<Int>.toPair(): Pair<Int, Int>? {
    return if (this.size >= 2) {
        Pair(this[0], this[1])
    } else {
        null
    }
}