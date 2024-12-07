package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun logPersonInfo(person: Person) {
    println("----- Person Information -----")
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Email: ${person.email}")
    println("--------------------------------")
}

fun main() {
    val person = Person("Alice", 25).apply {
        email = "alice@example.com"
    }

    person.also { logPersonInfo(it) }

    println("Person details logged successfully!")
}