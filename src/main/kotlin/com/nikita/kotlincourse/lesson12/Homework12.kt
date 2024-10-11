package com.nikita.com.nikita.kotlincourse.lesson12

class Homework12 {
}

fun main() {
    val sumResult = sum(10, 5)
    println("Сумма: $sumResult")

    val lengthResult = stringLength("Hello")
    println("Длина строки: $lengthResult")

    //Задача 1
    val result1 = multiplyByTwo(5)
    println("Результат умножения на 2: $result1")

    // Задача 2
    val result2 = isEven(4)
    println("Число чётное: $result2")

    // Задача 3
    println("Числа от 1 до 5:")
    printNumbersUntil(5)

    // Задача 4
    val numbers = listOf(3, 5, -1, 7, -5)
    val result4 = findFirstNegative(numbers)
    println("Первое отрицательное число: $result4")

    // Задача 5
    val strings = listOf("Hello", "World", null, "This will not be printed")
    println("Строки до первого null:")
    processList(strings)

    drawRectangle(5, 4)
    printMap(3, 3)
}



fun example1(): Unit {}


fun sum(a: Int, b: Int): Int {
    return a + b
}


fun printString(str: String): Unit {}

fun average(numbers: List<Int>): Double {
    return numbers.average()
}

fun stringLength(str: String?): Int? {
    return str?.length
}

fun nullableDouble(): Double? {
    return null // пример
}

fun processNullableList(numbers: List<Int?>?): Unit {}

fun intToString(num: Int): String? {
    return num.toString()
}

fun nullableStringList(): List<String?> {
    return listOf(null, "Example")
}

fun checkNullableValues(str: String?, num: Int?): Boolean? {
    return str != null && num != null
}


fun multiplyByTwo(num: Int): Int {
    return num * 2
}

fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) {
            return num
        }
    }
    return null
}

fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}

fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    printHorizontalBorder(width)
    printVerticalBorders(width, height)
    printHorizontalBorder(width)
}

private fun printHorizontalBorder(width: Int) {
    var line = "+"
    for (i in 1 until width - 1) {
        line += "-"
    }
    line += "+\n"
    print(line)
}

private fun printVerticalBorders(width: Int, height: Int) {
    for (i in 1 until height - 1) {
        var line = "|"
        for (j in 1 until width - 1) {
            line += " "
        }
        line += "|\n"
        print(line)
    }
}

fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")

    val formatterSize = maxOf(" $xSize".length, " $ySize".length)
    val xRange = getRange(xSize)
    val yRange = getRange(ySize)

    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()

    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            val result = getResultSymbol(m, i)
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}

private fun getResultSymbol(m: Int, i: Int): String {
    return when {
        m % 2 == 0 -> if (m % 3 == 0) "." else "*"
        m % 5 == 0 -> if (i < 0) "-" else "+"
        else -> "?"
    }
}

private fun getRange(size: Int): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}



