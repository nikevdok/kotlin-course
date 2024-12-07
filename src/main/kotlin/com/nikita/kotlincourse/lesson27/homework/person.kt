package com.nikita.com.nikita.kotlincourse.lesson27.homework

class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

fun main() {
    val person = Person("Alice", 25).apply {
        email = "alice@example.com"
    }
    println("Person: ${person.name}, Age: ${person.age}, Email: ${person.email}")

    val employee = person.let {
        Employee(it.name, it.age, "Developer").apply {
            email = it.email
            department = "IT"
        }
    }
    println("Employee: ${employee.name}, Age: ${employee.age}, Position: ${employee.position}, Email: ${employee.email}, Department: ${employee.department}")

    val newEmployee = Employee("Bob", 30, "Manager").also {
        it.email = "bob.manager@example.com"
        it.department = "HR"
    }
    println("New Employee: ${newEmployee.name}, Age: ${newEmployee.age}, Position: ${newEmployee.position}, Email: ${newEmployee.email}, Department: ${newEmployee.department}")

    newEmployee.run {
        email = "bob.hr@example.com"
        department = "Operations"
    }
    println("Updated Employee: ${newEmployee.name}, Age: ${newEmployee.age}, Position: ${newEmployee.position}, Email: ${newEmployee.email}, Department: ${newEmployee.department}")
}

