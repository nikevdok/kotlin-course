package com.nikita.com.nikita.kotlincourse.lesson26.homework

fun processData(
    numbers: List<Int>,
    strings: Set<String>,
    operation: (List<Int>, Set<String>) -> Map<String, Int>
): Map<String, Int> {
    return operation(numbers, strings)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4)
    val strings = setOf("one", "two", "three", "four")

    val result = processData(numbers, strings) { nums, strs ->
        val map = mutableMapOf<String, Int>()
        val strList = strs.toList()

        nums.forEachIndexed { index, num ->
            if (index < strList.size) {
                map[strList[index]] = num
            }
        }

        map
    }

    println(result)
}

