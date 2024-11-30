// Файл Task7.kt

// Функция-расширение для Map, которая принимает аргументы разных типов
fun Map<String, Any>.combineAllData(
    intArg: Int,
    doubleArg: Double,
    stringArg: String,
    charArg: Char,
    boolArg: Boolean,
    longArg: Long,
    listArg: List<Any>,
    setArg: Set<Any>
): String {
    // Собираем строку с данными
    val result = buildString {
        append("Int: $intArg\n")
        append("Double: $doubleArg\n")
        append("String: $stringArg\n")
        append("Char: $charArg\n")
        append("Boolean: $boolArg\n")
        append("Long: $longArg\n")
        append("List: $listArg\n")
        append("Set: $setArg\n")
    }
    // Печатаем все данные
    println(result)
    return result
}

fun main() {
    // Создаем Map, чтобы использовать функцию расширения
    val testMap = mapOf(
        "Key1" to "Value1",
        "Key2" to 123
    )

    // Применяем функцию расширения
    val result = testMap.combineAllData(
        intArg = 10,
        doubleArg = 20.5,
        stringArg = "Hello",
        charArg = 'A',
        boolArg = true,
        longArg = 1000000000L,
        listArg = listOf(1, 2, 3),
        setArg = setOf("apple", "banana")
    )

    // Выводим результат
    println("Combined Data: \n$result")
}
