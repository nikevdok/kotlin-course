package com.nikita.com.nikita.kotlincourse.lesson17.Homework17

// Базовый класс
open class EducationalInstitution(val name: String) {
    open fun getDescription() = "Учебное заведение: $name"
}

// Производный класс - Школа
class School(name: String, val numStudents: Int) : EducationalInstitution(name) {
    override fun getDescription() = "Школа: $name, Количество учеников: $numStudents"
}

// Производный класс - Университет
open class University(name: String, val numFaculties: Int) : EducationalInstitution(name) {
    override fun getDescription() = "Университет: $name, Факультеты: $numFaculties"
}


class TechnicalUniversity(name: String, numFaculties: Int, val specialization: String) : University(name, numFaculties) {
    override fun getDescription() = "Технический университет: $name, Специализация: $specialization"
}

fun main() {
    val school = School("Гимназия №1", 500)
    println(school.getDescription())

    val university = University("МГУ", 20)
    println(university.getDescription())

    val techUni = TechnicalUniversity("Технический Университет", 15, "Инженерия")
    println(techUni.getDescription())
}
