package com.nikita.com.nikita.kotlincourse.lesson18.Homework18

import kotlin.math.*

abstract class Shape {
    open fun area(): Double = 0.0
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(private val a: Double, private val b: Double, private val angleInDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleInRadians = Math.toRadians(angleInDegrees)
        return 0.5 * a * b * sin(angleInRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0),
        Triangle(5.0, 7.0, 45.0)
    )

    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}
