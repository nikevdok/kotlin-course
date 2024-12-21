package com.nikita.com.nikita.kotlincourse.lesson30.homework

enum class RealEstateType(val readableName: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    OFFICE("Офисное помещение"),
    LAND("Земельный участок"),
    COMMERCIAL("Коммерческая недвижимость")
}


fun printSortedRealEstateTypes() {

    val sortedTypes = RealEstateType.values().sortedBy { it.readableName.length }

    sortedTypes.forEach { println(it.readableName) }
}

fun main() {
    printSortedRealEstateTypes()
}