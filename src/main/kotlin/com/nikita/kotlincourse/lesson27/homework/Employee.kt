package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun main() {
    val employee = Employee("Bob", 30, "Developer").apply {
        email = "bob@company.com"
        department = "IT"
    }

    println("Employee: ${employee.name}, ${employee.age} years old, Position: ${employee.position}")
    println("Email: ${employee.email}, Department: ${employee.department}")
}
