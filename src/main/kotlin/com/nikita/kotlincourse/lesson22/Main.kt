package com.nikita.com.nikita.kotlincourse.lesson22


fun main() {
    // Тест 1: Функция для массива
    val array = arrayOf(1, 2, 3)
    println("Array to Pair: ${array.toPair()}")

    // Тест 2: Функция для символа
    val char: Char? = 'A'
    char.processWithArguments(10, 20, true)

    // Тест 3: Функция для изменяемого списка
    val list = mutableListOf("Kotlin", "Java")
    println("Add and Get: ${list.addAndGet("Python", 1)}")
    println("Updated list: $list")

    // Тест 4: Функция для словаря
    val map: Map<Int, List<String>> = mapOf(1 to listOf("One", "Two"), 2 to listOf("Three"))
    println("Transformed Map: ${map.transformMap(2)}")

    // Тест 5: Функция для Long
    val longValue: Long? = 123456789L
    println("Long to String: ${longValue.toFormattedString()}")


        // Тестирование метода revert для пары
        val pair1 = Pair(1, "Kotlin")
        println("Original Pair: $pair1")
        println("Reverted Pair: ${pair1.revert()}")

        val pair2 = Pair(null, 42)
        println("Original Pair: $pair2")
        println("Reverted Pair: ${pair2.revert()}")

        val pair3 = Pair("Hello", null)
        println("Original Pair: $pair3")
        println("Reverted Pair: ${pair3.revert()}")


        // Тестирование метода within
        val num1: Double = 100.5
        val num2: Double = 105.0
        println("Is $num1 within 5 of $num2? -> ${num1.within(num2, 5.0)}")
        println("Is $num1 within 3 of $num2? -> ${num1.within(num2, 3.0)}")

        val int1: Int = 10
        val int2: Int = 15
        println("Is $int1 within 5 of $int2? -> ${int1.within(int2, 5)}")
        println("Is $int1 within 4 of $int2? -> ${int1.within(int2, 4)}")

        val float1: Float = 20.5f
        val float2: Float = 22.0f
        println("Is $float1 within 2 of $float2? -> ${float1.within(float2, 2.0f)}")
        println("Is $float1 within 1 of $float2? -> ${float1.within(float2, 1.0f)}")


        // Тестирование методов encrypt и decrypt
        val originalText = "Hello, Kotlin!"
        val shift = 3

        val encryptedText = originalText.encrypt(shift)
        println("Original: $originalText")
        println("Encrypted: $encryptedText")

        val decryptedText = encryptedText.decrypt(shift)
        println("Decrypted: $decryptedText")

        // Проверка, что после шифрования и расшифровки строка вернётся к исходному состоянию
        println("Is decrypted text equal to original? -> ${originalText == decryptedText}")

    val phrase = "Пидмаркоз"
    val authors = listOf("User1", "User2", "User3")

    println("Вывод строки по буквам:")
    phrase.displayWithAuthors(authors)
}