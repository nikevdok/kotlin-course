package com.nikita.com.nikita.kotlincourse.lesson17.Homework17

// Базовый класс
open class Furniture(val name: String, val material: String) {
    open fun getInfo() = "Мебель: $name, Материал: $material"
}

// Производный класс - Стул
class Chair(name: String, material: String, val hasArmrests: Boolean) : Furniture(name, material) {
    override fun getInfo() = "${super.getInfo()}, С подлокотниками: $hasArmrests"
}

// Производный класс - Стол
open class Table(name: String, material: String, val shape: String) : Furniture(name, material) {
    override fun getInfo() = "${super.getInfo()}, Форма: $shape"
}


class ComputerTable(name: String, material: String, val hasKeyboardTray: Boolean) : Table(name, material, "Прямоугольный") {
    override fun getInfo() = "${super.getInfo()}, С выдвижной полкой: $hasKeyboardTray"
}

fun main() {
    val chair = Chair("Офисный стул", "Кожа", true)
    println(chair.getInfo())

    val table = Table ("Кухонный стол", "Дерево", "Круглый")
    println(table.getInfo())

    val compTable = ComputerTable("Компьютерный стол", "Металл", true)
    println(compTable.getInfo())
}
