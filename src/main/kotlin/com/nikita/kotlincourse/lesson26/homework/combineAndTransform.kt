package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun <T, R> combineAndTransform(
    collection1: Collection<T>,
    collection2: Collection<T>,
    transform: (List<T>) -> Collection<R>
): Collection<R> {
    val combined = collection1 + collection2
    return transform(combined)
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)

    val transformed = combineAndTransform(list1, list2) { combined ->
        combined.map { it * it }
    }
    println(transformed)
    val evenNumbers = combineAndTransform(list1, list2) { combined ->
        combined.filter { it % 2 == 0 }
    }
    println(evenNumbers)
}

