package com.nikita.com.nikita.kotlincourse.lesson17.Homework17


abstract class Materials {

    protected val materials = mutableListOf<String>()

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    abstract fun addMaterial(material: String)
}


class BottomContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }
}


class AlternateContainer : Materials() {
    fun addMaterials(list: List<String>) {
        list.forEachIndexed { index, material ->
            materials.add(index * 2, material)
        }
    }

    override fun addMaterial(material: String) {
        materials.add(material)
    }
}


class SortedContainer : Materials() {
    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }
}


class DictionaryContainer : Materials() {
    fun addDictionary(dictionary: Map<String, String>) {
        dictionary.forEach { (key, value) ->
            materials.add(0, key)
            materials.add(value)
        }
    }

    override fun addMaterial(material: String) {
        materials.add(material)
    }
}


fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )


    println("BottomContainer:")
    val bottomContainer = BottomContainer()
    bottomContainer.addMaterial("bottom")
    bottomContainer.addMaterial("new bottom")
    bottomContainer.printContainer()
    println()


    println("AlternateContainer:")
    val alternateContainer = AlternateContainer()
    alternateContainer.addMaterials(ordinalNumbers)
    alternateContainer.printContainer()
    println()


    println("SortedContainer:")
    val sortedContainer = SortedContainer()
    sortedContainer.addMaterial("apple")
    sortedContainer.addMaterial("banana")
    sortedContainer.addMaterial("grape")
    sortedContainer.addMaterial("cherry")
    sortedContainer.printContainer()
    println()


    println("DictionaryContainer:")
    val dictionaryContainer = DictionaryContainer()
    dictionaryContainer.addDictionary(mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3"))
    dictionaryContainer.printContainer()
}
