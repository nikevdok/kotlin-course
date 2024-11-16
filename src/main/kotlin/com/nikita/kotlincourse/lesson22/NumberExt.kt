package com.nikita.com.nikita.kotlincourse.lesson22


import kotlin.math.absoluteValue

fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = (this.toDouble() - other.toDouble()).absoluteValue
    return difference <= deviation.toDouble()
}