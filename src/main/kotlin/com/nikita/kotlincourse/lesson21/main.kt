package com.nikita.com.nikita.kotlincourse.lesson21


fun main() {
    // Тест функции toMap
    val keys = listOf("a", "b", "c")
    val values = listOf(1, 2)
    println(toMap(keys, values))

    // Тест функции getMiddleElement
    val numbers = listOf(1, 2, 3, 4, 5)
    println(getMiddleElement(numbers))

    // Тест класса ListHolder
    val holder = ListHolder<Int>()
    holder.addElement(10)
    holder.addElement(20)
    println(holder.getAllElements())

    // Тест класса PhrasesToListOfStrings
    val mapper = PhrasesToListOfStrings()
    println(mapper.transform("Hello Kotlin World"))
    println(mapper.transformList(listOf("Hello World", "Kotlin Programming")))

    // Тест класса StringValidator
    val stringValidator = StringValidator()
    println(stringValidator.validate("Hello"))
    println(stringValidator.validate("  "))
    println(stringValidator.validate(null))

    // Тест класса OddValidator
    val oddValidator = OddValidator()
    println(oddValidator.validate(3))
    println(oddValidator.validate(4))

    // Тест класса ListValidator
    val listValidator = ListValidator<Double>()
    println(listValidator.validate(listOf(1.0, 2.5, 0.0)))
    println(listValidator.validate(listOf(1.0, 2.5, 3.0)))
}