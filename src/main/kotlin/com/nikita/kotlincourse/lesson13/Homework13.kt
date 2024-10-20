package com.nikita.com.nikita.kotlincourse.lesson13

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // 1. Проверить, что размер коллекции больше 5 элементов
    if (numbers.size > 5) println("Размер коллекции больше 5 элементов")

    // 2. Проверить, что коллекция пустая
    if (numbers.isEmpty()) println("Коллекция пустая")

    // 3. Проверить, что коллекция не пустая
    if (numbers.isNotEmpty()) println("Коллекция не пустая")

    // 4. Взять элемент по индексу или создать значение, если индекса не существует
    val element = numbers.getOrElse(10) { -1 }
    println("Элемент по индексу 10 или -1: $element")

    // 5. Собрать коллекцию в строку
    val joinedString = numbers.joinToString(separator = ", ", prefix = "[", postfix = "]")
    println("Коллекция в строке: $joinedString")

    // 6. Посчитать сумму всех значений
    val sum = numbers.sum()
    println("Сумма всех значений: $sum")

    // 7. Посчитать среднее
    val average = numbers.average()
    println("Среднее значение: $average")

    // 8. Взять максимальное число
    val max = numbers.maxOrNull()
    println("Максимальное число: $max")

    // 9. Взять минимальное число
    val min = numbers.minOrNull()
    println("Минимальное число: $min")

    // 10. Взять первое число или null
    val first = numbers.firstOrNull()
    println("Первое число или null: $first")

    // 11. Проверить, что коллекция содержит элемент
    val containsNumber = numbers.contains(3)
    println("Коллекция содержит 3: $containsNumber")

    // Исходные данные
    val ages = listOf(15, 18, 22, 29, 30, 35, 40)
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val words = listOf("apple", "banana", "cherry", "date", null, "fig", "grape", "kiwi", "apple")

    // 1. Отфильтровать коллекцию по диапазону 18-30
    val filteredAges = ages.filter { it in 18..30 }
    println("Возраст от 18 до 30: $filteredAges")

    // 2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val filteredNumbers = numbers2.filter { it % 2 != 0 && it % 3 != 0 }
    println("Числа, которые не делятся на 2 и 3: $filteredNumbers")

    // 3. Очистить текстовую коллекцию от null элементов
    val nonNullWords = words.filterNotNull()
    println("Слова без null: $nonNullWords")

    // 4. Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLengths = words.filterNotNull().map { it.length }
    println("Длина слов: $wordLengths")

    // 5. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val reversedWordsMap = words.filterNotNull().associate { it to it.reversed() }
    println("Слова и их перевёрнутые варианты: $reversedWordsMap")

    // 6. Отсортировать список в алфавитном порядке
    val sortedWords = words.filterNotNull().sorted()
    println("Слова в алфавитном порядке: $sortedWords")

    // 7. Отсортировать список по убыванию
    val sortedWordsDescending = words.filterNotNull().sortedDescending()
    println("Слова в алфавитном порядке по убыванию: $sortedWordsDescending")

    // 8. Распечатать квадраты элементов списка
    val squares = numbers.map { it * it }
    println("Квадраты элементов списка: $squares")

    // 9. Группировать список по первой букве слов
    val groupedByFirstLetter = words.filterNotNull().groupBy { it.first() }
    println("Группировка слов по первой букве: $groupedByFirstLetter")

    // 10. Очистить список от дублей
    val distinctWords = words.filterNotNull().distinct()
    println("Слова без дублей: $distinctWords")

    // 11. Взять первые 3 элемента списка
    val firstThree = words.filterNotNull().take(3)
    println("Первые 3 элемента: $firstThree")

    // 12. Взять последние 3 элемента списка
    val lastThree = words.filterNotNull().takeLast(3)
    println("Последние 3 элемента: $lastThree")

        // Тестовые данные для каждой ветки
        val testCollections = listOf(
            listOf<Int>(),                                   // Пустая коллекция
            listOf(1, 2, 3),                                // Короткая коллекция
            listOf(0, 5, 10),                               // Стартовая коллекция
            listOf(1000, 2000, 3000, 4000, 5000),          // Массивная коллекция
            listOf(5, 15, 10),                              // Сбалансированная коллекция
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),         // Клейкая коллекция
            listOf(-1, -5, -10),                           // Отрицательная коллекция
            listOf(1001, 2000, 1500),                       // Положительная коллекция
            listOf(3, 14, 5),                               // Пи***тая коллекция
            listOf(8, 9, 7, 6, 5)                           // Уникальная коллекция
        )

        // Вызов метода для каждой коллекции
        for (collection in testCollections) {
            println("Состояние коллекции ${collection}: ${describeCollection(collection)}")
        }
    }

    fun describeCollection(numbers: List<Int>): String {
        return when {
            numbers.isEmpty() -> "Пусто"
            numbers.size < 5 -> "Короткая"
            numbers.first() == 0 -> "Стартовая"
            numbers.sum() > 10000 -> "Массивная"
            numbers.average() == 10.0 -> "Сбалансированная"
            numbers.joinToString("").length == 20 -> "Клейкая"
            numbers.maxOrNull() ?: Int.MIN_VALUE < -10 -> "Отрицательная"
            numbers.minOrNull() ?: Int.MAX_VALUE > 1000 -> "Положительная"
            numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
    }
//конец задания 2


    // Исходные данные
    fun new() {
        // Исходные данные
        val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

        // 1. Отфильтровать удовлетворительные оценки (>=60)
        val passingGrades = grades.filter { it >= 60 }

        // 2. Отсортировать оставшиеся оценки по возрастанию
        val sortedPassingGrades = passingGrades.sorted()

        // 3. Взять первые 3 оценки
        val topThreeGrades = sortedPassingGrades.take(3)

        // Разбиваем большой println на несколько отдельных вызовов
        println("Отфильтрованные и отсортированные оценки: $sortedPassingGrades")
        println("Первые три оценки: $topThreeGrades")
    }

fun new2() {
    // Исходные данные
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    // Приводим все слова к нижнему регистру и группируем по первой букве
    val catalog = list
        .map { it.lowercase() } // Приведение всех элементов к нижнему регистру
        .groupBy { it.first() }  // Группировка по первой букве

    // Вывод каталога
    catalog.forEach { (letter, items) ->
        println("Буква $letter:")
        items.forEach { println("- $it") }
    }
}

val words = listOf("Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")

fun new3() {
    val words = listOf("Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка")

    // Перевод всех слов в количество букв
    val wordLengths = words.map { it.length }

    // Подсчёт среднего значения
    val averageLength = wordLengths.average()

    // Вывод результата с двумя знаками после запятой
    println("Средняя длина слов: %.2f".format(averageLength))
}

val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

fun new4() {
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    // Отбор уникальных чисел
    val uniqueNumbers = numbers.distinct()

    // Сортировка по убыванию
    val sortedNumbers = uniqueNumbers.sortedDescending()

    // Группировка по чётности
    val groupedNumbers = sortedNumbers.groupBy { if (it % 2 == 0) "Чётные" else "Нечётные" }

    // Вывод результата
    groupedNumbers.forEach { (category, nums) ->
        println("$category: $nums")
    }
}

val ages = listOf(22, 18, 30, 45, 17, null, 60)

fun new5() {
    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    // Поиск первого подходящего возраста
    val suitableAge = ages.filterNotNull().firstOrNull { it > 18 }

    // Вывод результата
    val result = suitableAge?.toString() ?: "Подходящий возраст не найден"
    println(result)
}
