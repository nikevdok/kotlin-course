package com.nikita.com.nikita.kotlincourse.lesson17.Homework17


open class GeometricFigure {
    open fun area(): Double {
        return 0.0
    }

    open fun perimeter(): Double {
        return 0.0
    }
}


class Circle(val radius: Double) : GeometricFigure() {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}


open class Polygon : GeometricFigure()


class Triangle(val a: Double, val b: Double, val c: Double) : Polygon() {
    override fun perimeter(): Double = a + b + c
    override fun area(): Double {
        val s = perimeter() / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }
}


class Rectangle(val width: Double, val height: Double) : Polygon() {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

fun main() {
    val circle = Circle(5.0)
    println("Площадь круга: ${circle.area()}, Периметр круга: ${circle.perimeter()}")

    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Площадь треугольника: ${triangle.area()}, Периметр треугольника: ${triangle.perimeter()}")

    val rectangle = Rectangle(4.0, 6.0)
    println("Площадь прямоугольника: ${rectangle.area()}, Периметр прямоугольника: ${rectangle.perimeter()}")
}