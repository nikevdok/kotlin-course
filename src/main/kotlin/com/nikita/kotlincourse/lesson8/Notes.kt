package com.nikita.com.nikita.kotlincourse.lesson8

class Notes {
}

fun main() {
    val simpleString = "Это просто строчка"
    val firstName = "Ivan"
    val lastName = "Ivanov"
    val fullName = "$firstName $lastName"
    val age = 30
    val greeting = "Hello world! $fullName and I have $age years"

    println(greeting)
}
fun main2()
{   val originalString = "Kotlin is fun"
    val subString = originalString.substring(startIndex = 7)
    val subString2 = originalString.substring(3, 6)

}

//val blank = "".isNullOrBlank()


