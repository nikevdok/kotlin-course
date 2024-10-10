package com.nikita.com.nikita.kotlincourse.lesson11

fun main() {
    // Задание 1: Создание Пустого Словаря
    val emptyMap: Map<Int, Int> = mapOf()
    println("Задание 1: Пустой словарь: $emptyMap")

    // Задание 2: Создание и Инициализация Словаря
    val floatDoubleMap: Map<Float, Double> = mapOf(
        1.5f to 2.5,
        3.0f to 4.0,
        7.3f to 9.1
    )
    println("Задание 2: Словарь с ключами Float и значениями Double: $floatDoubleMap")

    // Задание 3: Создание Изменяемого Словаря
    val mutableMap: MutableMap<Int, String> = mutableMapOf()
    println("Задание 3: Изменяемый словарь: $mutableMap")

    // Задание 4: Добавление Элементов в Словарь
    mutableMap[1] = "One"
    mutableMap[2] = "Two"
    mutableMap[3] = "Three"
    println("Задание 4: Словарь после добавления элементов: $mutableMap")

    // Задание 5: Получение Значений из Словаря
    val value = mutableMap[2]
    println("Задание 5: Значение по ключу 2: $value")

    val missingValue = mutableMap[10] ?: "Ключ не найден"
    println("Задание 5: Попытка получения несуществующего ключа: $missingValue")

    // Задание 6: Удаление Элементов из Словаря
    mutableMap.remove(1)
    println("Задание 6: Словарь после удаления элемента по ключу 1: $mutableMap")

    // Задание 7: Перебор Словаря в Цикле
    val divisionMap: Map<Double, Int> = mapOf(
        6.0 to 2,
        10.0 to 0,
        7.5 to 3
    )
    println("Задание 7: Результаты деления:")
    for ((key, value) in divisionMap) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }

    // Задание 8: Перезапись Элементов Словаря
    mutableMap[2] = "Updated Value"
    println("Задание 8: Словарь после перезаписи элемента с ключом 2: $mutableMap")

    // Задание 9: Сложение Двух Словарей
    val firstMap: Map<Int, String> = mapOf(1 to "One", 2 to "Two")
    val secondMap: Map<Int, String> = mapOf(3 to "Three", 4 to "Four")
    val combinedMap: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in firstMap) {
        combinedMap[key] = value
    }
    for ((key, value) in secondMap) {
        combinedMap[key] = value
    }
    println("Задание 9: Объединённый словарь: $combinedMap")

    // Задание 10: Словарь с Сложными Типами
    val complexMap: MutableMap<String, List<Int>> = mutableMapOf(
        "First" to listOf(1, 2, 3),
        "Second" to listOf(4, 5, 6)
    )
    println("Задание 10: Словарь с сложными типами: $complexMap")

    // Задание 11: Использование Множества в Качестве Значения
    val setMap: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("apple", "banana"),
        2 to mutableSetOf("orange")
    )

    setMap[1]?.add("cherry")
    println("Задание 11: Множество после добавления элемента: ${setMap[1]}")

    // Задание 12: Поиск Элемента по Значению
    val pairMap: Map<Pair<Int, Int>, String> = mapOf(
        (1 to 2) to "First",
        (5 to 3) to "Second",
        (4 to 5) to "Third"
    )

    println("Задание 12: Поиск пары с 5 в ключе:")
    for ((key, value) in pairMap) {
        if (key.first == 5 || key.second == 5) {
            println("Найдена пара $key со значением $value")
        }
    }

    // Задание 6 (второй блок): Словарь Библиотека
    val library: MutableMap<String, List<String>> = mutableMapOf(
        "Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Достоевский" to listOf("Преступление и наказание", "Идиот")
    )
    println("Задание 6 (второй блок): Словарь библиотека: $library")

    // Задание 12 (второй блок): Справочник Растений
    val plantDictionary: MutableMap<String, List<String>> = mutableMapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Береза")
    )
    println("Задание 12 (второй блок): Справочник растений: $plantDictionary")

    // Задание 8 (второй блок): Четвертьфинала
    val quarterfinalTeams: MutableMap<String, List<String>> = mutableMapOf(
        "Команда А" to listOf("Игрок 1", "Игрок 2"),
        "Команда Б" to listOf("Игрок 3", "Игрок 4")
    )
    println("Задание 8 (второй блок): Четвертьфинальные команды: $quarterfinalTeams")

    // Задание 9 (второй блок): Курс Лечения
    val treatmentCourse: MutableMap<String, List<String>> = mutableMapOf(
        "2024-10-10" to listOf("Препарат А", "Препарат Б"),
        "2024-10-11" to listOf("Препарат В")
    )
    println("Задание 9 (второй блок): Курс лечения: $treatmentCourse")

    // Задание 10 (второй блок): Словарь Путешественника
    val travelDictionary: MutableMap<String, Map<String, List<String>>> = mutableMapOf(
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Фонтан Треви"),
            "Венеция" to listOf("Площадь Сан-Марко", "Гранд-канал")
        ),
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр")
        )
    )
    println("Задание 10 (второй блок): Словарь путешественника: $travelDictionary")
}
