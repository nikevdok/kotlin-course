package com.nikita.com.nikita.kotlincourse.lesson27.homework

fun main() {
    val person: Person? = Person("John", 30)

    val employee = person?.let { person ->
        Employee(person.name, person.age, "Developer").apply {
            email = "john.doe@example.com"
            department = "IT"
        }
    }

    if (employee != null) {
        println("Employee Created:")
        println("Name: ${employee.name}")
        println("Age: ${employee.age}")
        println("Email: ${employee.email}")
        println("Department: ${employee.department}")
    } else {
        println("Person is null, Employee not created.")
    }
}