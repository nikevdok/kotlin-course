package com.nikita.com.nikita.kotlincourse.lesson22


fun <K, V> Map<K, List<V>>.transformMap(limit: Int): Map<String, V?> {
    return this.entries.take(limit).associate { (key, value) ->
        key.toString() to value.firstOrNull()
    }
}