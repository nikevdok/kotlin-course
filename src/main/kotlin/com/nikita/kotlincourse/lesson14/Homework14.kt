package com.nikita.com.nikita.kotlincourse.lesson14

fun main() {
    // Задание 1: Определите среднее время выполнения теста.
    val testTimes = mapOf("test1" to 120, "test2" to 85, "test3" to 150)
    val averageTime = testTimes.values.average()
    println("Среднее время выполнения теста: $averageTime")

    // Задание 2: Выведите список всех тестовых методов.
    val testMetadata = mapOf("test1" to "metadata1", "test2" to "metadata2")
    val testMethods = testMetadata.keys
    println("Тестовые методы: $testMethods")

    // Задание 3: Добавьте новый тест и его результат в изменяемый словарь.
    val testResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    testResults["test3"] = "passed"
    println("Обновлённые результаты тестов: $testResults")

    // Задание 4: Посчитайте количество успешных тестов.
    val passedTests = testResults.count { it.value == "passed" }
    println("Количество успешных тестов: $passedTests")

    // Задание 5: Удалите запись о баге, который был исправлен.
    val bugTracker = mutableMapOf("bug1" to "open", "bug2" to "fixed")
    bugTracker.remove("bug2")
    println("Обновленный баг-трекинг: $bugTracker")

    // Задание 6: Выведите сообщение о странице и статусе её проверки.
    val pageResults = mapOf("https://example.com" to "200 OK", "https://test.com" to "404 Not Found")
    pageResults.forEach { (url, status) ->
        println("Страница: $url, Статус: $status")
    }

    // Задание 7: Найдите сервисы с временем ответа, превышающим порог.
    val serviceTimes = mapOf("service1" to 500, "service2" to 1200, "service3" to 700)
    val threshold = 1000
    val slowServices = serviceTimes.filter { it.value > threshold }
    println("Медленные сервисы: $slowServices")

    // Задание 8: Найдите статус ответа для указанного endpoint или верните "Не протестирован".
    val apiResults = mapOf("endpoint1" to "200 OK", "endpoint2" to "500 Internal Server Error")
    val endpoint = "endpoint3"
    val status = apiResults.getOrElse(endpoint) { "Не протестирован" }
    println("Статус для $endpoint: $status")

    // Задание 9: Получите значение для "browserType" (не может быть null).
    val config = mapOf("browserType" to "Chrome", "resolution" to "1920x1080")
    val browserType = config["browserType"] ?: error("browserType не может быть null")
    println("Тип браузера: $browserType")

    // Задание 10: Создайте копию словаря и добавьте новую версию.
    val softwareVersions = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val updatedVersions = softwareVersions + ("v1.2" to "alpha")
    println("Обновленные версии ПО: $updatedVersions")

    // Задание 11: Получите настройки для устройства или верните настройки по умолчанию.
    val deviceSettings = mapOf("iPhone" to "high", "Samsung" to "medium")
    val defaultSettings = "low"
    val device = "Nokia"
    val settings = deviceSettings.getOrElse(device) { defaultSettings }
    println("Настройки для $device: $settings")

    // Задание 12: Проверьте, содержит ли словарь определённый код ошибки.
    val errorLog = mapOf("404" to "Not Found", "500" to "Internal Server Error")
    val errorCode = "404"
    val containsError = errorLog.contains(errorCode)
    println("Содержит ли код ошибки $errorCode: $containsError")

    // Задание 13: Отфильтруйте словарь, оставив сценарии для определённой версии.
    val testScenarios = mapOf("TestID_1.0" to "Passed", "TestID_2.0" to "Failed")
    val targetVersion = "1.0"
    val filteredScenarios = testScenarios.filter { it.key.endsWith(targetVersion) }
    println("Сценарии для версии $targetVersion: $filteredScenarios")

    // Задание 14: Проверьте, есть ли в модуле тестирования неудачные результаты.
    val moduleResults = mapOf("module1" to "passed", "module2" to "failed")
    val hasFailures = moduleResults.containsValue("failed")
    println("Есть ли неудачные модули: $hasFailures")

    // Задание 15: Добавьте в изменяемый словарь настройки из другого словаря.
    val environmentSettings = mutableMapOf("browser" to "Chrome", "resolution" to "1920x1080")
    val newSettings = mapOf("theme" to "dark", "language" to "EN")
    environmentSettings.putAll(newSettings)
    println("Обновленные настройки: $environmentSettings")

    // Задание 16: Объедините два неизменяемых словаря с данными о багах.
    val bugLog1 = mapOf("bug1" to "open")
    val bugLog2 = mapOf("bug2" to "closed")
    val combinedBugs = bugLog1 + bugLog2
    println("Объединенный баг-лог: $combinedBugs")

    // Задание 17: Очистите изменяемый словарь с временными данными.
    val tempData = mutableMapOf("test1" to "running", "test2" to "failed")
    tempData.clear()
    println("Очищенные временные данные: $tempData")

    // Задание 18: Исключите пропущенные тесты (status "skipped").
    val testResults2 = mapOf("test1" to "passed", "test2" to "skipped", "test3" to "failed")
    val filteredResults = testResults2.filterNot { it.value == "skipped" }
    println("Фильтрованные результаты тестов: $filteredResults")

    // Задание 19: Удалите устаревшие конфигурации из словаря.
    val testConfigs = mutableMapOf("config1" to "active", "config2" to "obsolete")
    testConfigs.entries.removeIf { it.value == "obsolete" }
    println("Очищенные конфигурации: $testConfigs")

    // Задание 20: Создайте отчёт, преобразовав словарь в список строк.
    val testResults3 = mapOf("test1" to "passed", "test2" to "failed")
    val report = testResults3.map { (test, result) -> "Test ID: $test, Результат: $result" }
    println("Отчет: $report")

    // Задание 21: Преобразуйте изменяемый словарь с результатами в неизменяемый.
    val mutableResults = mutableMapOf("test1" to "passed", "test2" to "failed")
    val immutableResults = mutableResults.toMap()
    println("Неизменяемый словарь: $immutableResults")

    fun main() {
        // Продолжаем с задания 22 и далее

        // Задание 22: Преобразуйте словарь с результатами тестирования в неизменяемый для архивации
        val mutableTestResults = mutableMapOf("test1" to "passed", "test2" to "failed", "test3" to "passed")
        val archivedTestResults = mutableTestResults.toMap() // Преобразуем в неизменяемый
        println("Архивированные результаты тестов: $archivedTestResults")

        // Задание 23: Замените ID тестов на их названия (getNameById - фейковый метод)
        val testExecutionTimes = mapOf("test1" to 120, "test2" to 85, "test3" to 150)
        fun getNameById(id: String) = "Название_$id"  // Фейковый метод для получения названия по ID
        val renamedTests = testExecutionTimes.mapKeys { getNameById(it.key) }
        println("Словарь с заменёнными ID: $renamedTests")

        // Задание 24: Увеличьте оценку производительности каждого сервиса на 10%
        val performanceRatings = mutableMapOf("v1.0" to 90, "v1.1" to 80, "v1.2" to 95)
        val updatedRatings = performanceRatings.mapValues { (key, value) -> value * 1.10 }
        println("Оценки производительности с увеличением на 10%: $updatedRatings")

        // Задание 25: Проверьте, пуст ли словарь с ошибками компиляции тестов
        val compilationErrors = mapOf<String, String>() // Пустой словарь ошибок
        val isCompilationErrorEmpty = compilationErrors.isEmpty()
        println("Словарь ошибок компиляции пуст: $isCompilationErrorEmpty")

        // Задание 26: Убедитесь, что словарь с результатами нагрузочного тестирования не пуст
        val loadTestResults = mapOf("loadTest1" to "passed", "loadTest2" to "failed")
        val isLoadTestResultsNotEmpty = loadTestResults.isNotEmpty()
        println("Словарь с результатами нагрузочного тестирования не пуст: $isLoadTestResultsNotEmpty")

        // Задание 27: Проверьте, прошли ли успешно все тесты
        val automationTestResults = mapOf("test1" to "passed", "test2" to "passed", "test3" to "failed")
        val allTestsPassed = automationTestResults.all { it.value == "passed" }
        println("Все тесты прошли успешно: $allTestsPassed")

        // Задание 28: Проверьте, содержит ли словарь хотя бы один тест с ошибкой
        val hasFailedTests = automationTestResults.any { it.value == "failed" }
        println("Содержит ли словарь тест с ошибкой: $hasFailedTests")

        // Задание 29: Отфильтруйте словарь с результатами тестирования сервисов, оставив неудачные тесты с “optional” в названии
        val serviceTestResults = mapOf("optionalTest1" to "failed", "mainTest2" to "passed", "optionalTest3" to "failed")
        val failedOptionalTests = serviceTestResults.filter { it.key.contains("optional") && it.value == "failed" }
        println("Неудачные тесты с 'optional' в названии: $failedOptionalTests")

        // Задание 30: Преобразуйте словарь с результатами тестирования в список строк формата "Test ID: результат"
        val testResults4 = mapOf("test1" to "passed", "test2" to "failed", "test3" to "skipped")
        val testReport = testResults4.map { (test, result) -> "Test ID: $test, Результат: $result" }
        println("Отчет по тестам: $testReport")
    } }