package com.nikita.com.nikita.kotlincourse.lesson21


fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val size = minOf(keys.size, values.size)
    return keys.subList(0, size).zip(values.subList(0, size)).toMap()
}