package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun main() {
    val person = Person("Alice", 28)

    val employee = person.run {
        Employee(name, age, "HR Manager").apply {
            email = "alice.smith@example.com"
            department = "Human Resources"
        }
    }

    println("----- Employee Information -----")
    println("Name: ${employee.name}")
    println("Age: ${employee.age}")
    println("Position: ${employee.position}")
    println("Email: ${employee.email}")
    println("Department: ${employee.department}")
}