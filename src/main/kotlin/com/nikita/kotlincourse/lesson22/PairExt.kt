package com.nikita.com.nikita.kotlincourse.lesson22


fun <A, B> Pair<A, B>.revert(): Pair<B, A> {
    return Pair(this.second, this.first)
}