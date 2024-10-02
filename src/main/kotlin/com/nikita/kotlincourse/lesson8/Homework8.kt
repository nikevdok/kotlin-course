package com.nikita.com.nikita.kotlincourse.lesson8
fun main() {

    val phrases = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    )


    for (phrase in phrases) {
        println(ironicTransform(phrase))
    }
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    extractDateTimeFromLog(log)

    val cardNumber = "4539 1488 0343 6467"
    println(maskCreditCard(cardNumber))

    val email = "username@example.com"
    println(formatEmailAddress(email))

    val filePath = "C:/Пользователи/Документы/report.txt"
    println(extractFileName(filePath))

    val phrase = "Объектно-ориентированное программирование"
    println(createAbbreviation(phrase))

    val phrase2 = "объектно-ориентированное программирование"
    println(capitalizeWords(phrase))

    val cipher = StringCipher()

    val originalText = "Kotlin"
    val encryptedText = cipher.encrypt(originalText)
    val decryptedText = cipher.decrypt(encryptedText)

    println("Оригинальный текст: $originalText")
    println("Зашифрованный текст: $encryptedText")
    println("Расшифрованный текст: $decryptedText")

    val size = 10
    printMultiplicationTable(size)
}


//Text1
fun ironicTransform(phrase: String): String {

    if (phrase.contains("невозможно", ignoreCase = true)) {
        return phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", ignoreCase = true)
    }


    if (phrase.startsWith("Я не уверен", ignoreCase = true)) {
        return "$phrase, но моя интуиция говорит об обратном"
    }


    if (phrase.contains("катастрофа", ignoreCase = true)) {
        return phrase.replace("катастрофа", "интересное событие", ignoreCase = true)
    }


    if (phrase.endsWith("без проблем", ignoreCase = true)) {
        return phrase.replace("без проблем", "с парой интересных вызовов на пути", ignoreCase = true)
    }


    if (phrase.trim().split(" ").size == 1) {
        return "Иногда, $phrase, но не всегда"
    }


    return phrase
}
//Date
fun extractDateTimeFromLog(log: String) {

    val arrowIndex = log.indexOf("->")

    val dateTime = log.substring(arrowIndex + 2).trim()

    val parts = dateTime.split(" ")

    println("Дата: ${parts[0]}")
    println("Время: ${parts[1]}")
}
//CreditCard
fun maskCreditCard(cardNumber: String): String {
    val cleanedCardNumber = cardNumber.replace(" ", "")
    if (cleanedCardNumber.length <= 4) {
        return cleanedCardNumber
    }
    val lastFourDigits = cleanedCardNumber.takeLast(4)
    val maskedPart = "*".repeat(cleanedCardNumber.length - 4)
    val maskedCardNumber = maskedPart + lastFourDigits
    return maskedCardNumber.chunked(4).joinToString(" ")
}
//mail
fun formatEmailAddress(email: String): String {
    val replacedAt = email.replace("@", " [at] ")
    val formattedEmail = replacedAt.replace(".", " [dot] ")

    return formattedEmail
}
//extractFile
fun extractFileName(filePath: String): String {
    return filePath.substringAfterLast("/")
}
//Abbreviation
fun createAbbreviation(phrase: String): String {
    val words = phrase.split(" ", "-")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercaseChar()
        }
    }

    return abbreviation
}
//CapitalWord
fun capitalizeWords(phrase2: String): String {
    val words = phrase2.split(" ")
    var result = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            val capitalizedWord = word[0].uppercaseChar() + word.substring(1).lowercase()
            result += "$capitalizedWord "
        }
    }


    return result.trim()
}
//Encrypt
class StringCipher {


    fun encrypt(input: String): String {
        var str = input
        if (str.length % 2 != 0) {
            str += " "
        }

        val encrypted = StringBuilder()

        for (i in 0 until str.length step 2) {
            if (i + 1 < str.length) {
                encrypted.append(str[i + 1]).append(str[i])
            }
        }

        return encrypted.toString()
    }

    fun decrypt(input: String): String {
        val decrypted = StringBuilder()
        for (i in 0 until input.length step 2) {
            if (i + 1 < input.length) {
                decrypted.append(input[i + 1]).append(input[i])
            }
        }


        return decrypted.toString().trimEnd()
    }
}
//Multiplication
fun printMultiplicationTable(size: Int) {
    print("%4s".format(""))
    for (i in 1..size) {
        print("%4d".format(i))
    }
    println()


    for (i in 1..size) {

        print("%4d".format(i))


        for (j in 1..size) {
            print("%4d".format(i * j))
        }
        println()
    }}






