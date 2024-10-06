package com.nikita.com.nikita.kotlincourse.lesson10

class Notes10 {
}
fun main ()
{
    val numbers = arrayOf<Int>()

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

}
