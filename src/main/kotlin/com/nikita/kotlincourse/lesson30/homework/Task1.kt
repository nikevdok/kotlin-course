package com.nikita.com.nikita.kotlincourse.lesson30.homework

enum class TestStatus {
    PASS,
    BROKEN,
    FAILURE
}

enum class PropertyType(val description: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    STUDIO("Студия"),
    TOWNHOUSE("Таунхаус"),
    VILLA("Вилла"),
    COTTAGE("Коттедж"),
    LOFT("Лофт")
}

enum class Planet(val distanceFromSun: Double, val mass: Double) {
    MERCURY(0.39, 3.3e23),
    VENUS(0.72, 4.87e24),
    EARTH(1.0, 5.97e24),
    MARS(1.52, 6.42e23),
    JUPITER(5.20, 1.9e27),
    SATURN(9.54, 5.68e26),
    URANUS(19.19, 8.68e25),
    NEPTUNE(30.06, 1.02e26)
}

