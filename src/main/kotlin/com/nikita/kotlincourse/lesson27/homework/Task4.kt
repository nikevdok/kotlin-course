package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun main() {
    // Создаём объект класса Person
    val person = Person("John", 30).apply {
        email = "john.doe@example.com"
    }

    // Используем with для преобразования Person в Employee
    val employee = with(person) {
        Employee(name, age, "Software Engineer").apply {
            email = this@with.email
            department = "IT"
        }
    }

    // Выводим информацию о новом объекте Employee
    println("----- Employee Information -----")
    println("Name: ${employee.name}")
    println("Age: ${employee.age}")
    println("Position: ${employee.position}")
    println("Email: ${employee.email}")
    println("Department: ${employee.department}")
    println("--------------------------------")
}

