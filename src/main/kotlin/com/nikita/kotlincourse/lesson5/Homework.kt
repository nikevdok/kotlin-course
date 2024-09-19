package com.nikita.com.nikita.kotlincourse.lesson5

fun calculateSoundIntensity(initialIntensity: Double, attenuationCoefficient: Double?): Double {
    val coefficient = attenuationCoefficient ?: 0.5
    return initialIntensity * coefficient
}

fun main() {
    // Сценарий с неизвестным коэффициентом затухания
    println(calculateSoundIntensity(100.0, null))  // Вывод: 50.0

    // Сценарий с известным коэффициентом затухания
    println(calculateSoundIntensity(100.0, 0.8))  // Вывод: 80.0
}


fun calculateShippingCost(cargoValue: Double?): Double {
    val value = cargoValue ?: 50.0
    val insurance = value * 0.005  // 0.5% от стоимости
    return value + insurance
}

fun result() {
    // Сценарий с неизвестной стоимостью груза
    println(calculateShippingCost(null))  // Вывод: 50.25

    // Сценарий с известной стоимостью груза
    println(calculateShippingCost(200.0))  // Вывод: 201.0
}

fun checkPressure(pressure: Double?) {
    val pressureValue = pressure ?: error("Ошибка: Отсутствуют данные о давлении!")
    println("Значение атмосферного давления: $pressureValue")
}

fun result3() {
    // Сценарий с отсутствием данных о давлении
    try {
        checkPressure(null)
    } catch (e: Exception) {
        println(e.message)  // Вывод: Ошибка: Отсутствуют данные о давлении!
    }

    // Сценарий с наличием данных о давлении
    checkPressure(1013.25)  // Вывод: Значение атмосферного давления: 1013.25
}
