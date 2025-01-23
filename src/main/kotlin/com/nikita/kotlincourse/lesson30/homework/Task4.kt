package com.nikita.com.nikita.kotlincourse.lesson30.homework

enum class Task4(val distanceFromSun: Double, val mass: Double) {
    MERCURY(0.39, 3.3e23),
    VENUS(0.72, 4.87e24),
    EARTH(1.0, 5.97e24),
    MARS(1.52, 6.42e23),
    JUPITER(5.20, 1.9e27),
    SATURN(9.54, 5.68e26),
    URANUS(19.19, 8.68e25),
    NEPTUNE(30.06, 1.02e26)
}

fun filterPlanet(filter: (Planet) -> Boolean): Planet {
    return Planet.values().filter(filter).firstOrNull()
        ?: throw NoSuchElementException("Не найдено планет, соответствующих заданному критерию")
}

fun main() {
    // Пример использования: найти первую планету, находящуюся дальше 5 а.е. от Солнца
    try {
        val farPlanet = filterPlanet { it.distanceFromSun > 5.0 }
        println("Первая планета дальше 5 а.е. от Солнца: $farPlanet")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    // Пример использования: найти первую планету с массой меньше 1e24 кг
    try {
        val lightPlanet = filterPlanet { it.mass < 1e24 }
        println("Первая планета с массой меньше 1e24 кг: $lightPlanet")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    // Пример использования: попытка найти планету, которой не существует
    try {
        val nonExistentPlanet = filterPlanet { it.distanceFromSun > 100.0 }
        println("Этот текст не должен быть напечатан")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }
}


