package com.nikita.com.nikita.kotlincourse.lesson10



fun main() {
    val myArray = createArray()
    println(myArray.joinToString(", "))

    val emptyArray = createEmptyArray()
    println(emptyArray.joinToString())

    val doubleArray = fillDoubleArray()
    println(doubleArray.joinToString())

    val intArray = modifyIntArray()
    println(intArray.joinToString())

    val nullableArray = createNullableArray()
    println(nullableArray.joinToString())

    val copiedArray = copyIntArray()
    println(copiedArray.joinToString())

    val diffArray = differenceOfArrays()
    println(diffArray.joinToString())

    val index = findIndexOfElement()
    println("Индекс элемента 5: $index")

    checkEvenOdd()

    val stringArray = arrayOf("apple", "banana", "cherry", "date")
    val query = "ban"
    val result = findSubstring(stringArray, query)
    println(result ?: "Элемент не найден")

    val emptyList = createEmptyList()
    println(emptyList)

    val stringList = createStringList()
    println(stringList)

    val mutableList = createMutableList()
    addElementsToList(mutableList)
    println(mutableList)

    val stringList2 = mutableListOf("Hello", "World", "Kotlin")
    removeElementFromList(stringList2, "World")
    println(stringList)

    val numberList = listOf(1, 2, 3, 4, 5)
    iterateList(numberList)

    val stringList3 = listOf("apple", "banana", "cherry")
    val element = getElementByIndex(stringList, 1)
    println("Второй элемент: $element")

    val numberList2 = mutableListOf(10, 20, 30, 40, 50)
    updateElementInList(numberList2, 2, 99)
    println(numberList2)

    val list1 = listOf("apple", "banana")
    val list2 = listOf("cherry", "date")
    val mergedList = mergeLists(list1, list2)
    println(mergedList)

    val numberList3 = listOf(5, 3, 9, 1, 4)
    val (min, max) = findMinMax(numberList3)
    println("Минимум: $min, Максимум: $max")

    val numberList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = filterEvenNumbers(numberList4)
    println(evenNumbers)

    // Задание 1
    val emptySet = createEmptySet()
    println("Пустое множество: $emptySet")

    // Задание 2
    val intSet = createIntSet()
    println("Множество целых чисел: $intSet")

    // Задание 3
    val mutableStringSet = createMutableStringSet()
    println("Изменяемое множество строк: $mutableStringSet")

    // Задание 4
    addElementsToSet(mutableStringSet)
    println("Множество после добавления элементов: $mutableStringSet")

    // Задание 5
    val mutableIntSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
    removeElementFromSet(mutableIntSet, 2)
    println("Множество после удаления элемента 2: $mutableIntSet")

    // Задание 6
    println("Элементы множества:")
    iterateOverSet(setOf(1, 2, 3, 4, 5))

    // Задание 7
    val searchStringSet: Set<String> = setOf("Kotlin", "Java", "Scala")
    val searchString = "Java"
    val isPresent = containsElement(searchStringSet, searchString)
    println("Элемент '$searchString' присутствует в множестве: $isPresent")

    // Задание 8
    val set1: Set<String> = setOf("apple", "banana")
    val set2: Set<String> = setOf("cherry", "banana", "date")
    val unionSet = unionOfSets(set1, set2)
    println("Объединенное множество: $unionSet")

    // Задание 9
    val intSet1: Set<Int> = setOf(1, 2, 3, 4)
    val intSet2: Set<Int> = setOf(3, 4, 5, 6)
    val intersectionSet = intersectionOfSets(intSet1, intSet2)
    println("Пересечение множеств: $intersectionSet")

    // Задание 10
    val stringSet1: Set<String> = setOf("apple", "banana", "cherry")
    val stringSet2: Set<String> = setOf("banana", "date")
    val differenceSet = differenceOfSets(stringSet1, stringSet2)
    println("Разность множеств: $differenceSet")

    // Задание 11
    val stringSet: Set<String> = setOf("Kotlin", "Java", "Scala")
    val listFromSet = convertSetToList(stringSet)
    println("Множество, конвертированное в список: $listFromSet")
}


fun createArray(): Array<Int> {

    val array = arrayOf(1, 2, 3, 4, 5)
    return array
}

fun createEmptyArray(): Array<String?> {

    return arrayOfNulls<String>(10)
}

fun fillDoubleArray(): Array<Double> {
    val array = Array(5) { 0.0 }
    for (i in array.indices) {
        array[i] = i * 2.0
    }
    return array
}

fun modifyIntArray(): Array<Int> {
    val array = Array(5) { 0 }
    for (i in array.indices) {
        array[i] = i * 3
    }
    return array
}

fun createNullableArray(): Array<String?> {
    return arrayOf(null, "Hello", "World")
}

fun copyIntArray(): Array<Int> {
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = Array(originalArray.size) { 0 }
    for (i in originalArray.indices) {
        copiedArray[i] = originalArray[i]
    }
    return copiedArray
}

fun differenceOfArrays(): Array<Int> {
    val array1 = arrayOf(5, 10, 15, 20)
    val array2 = arrayOf(1, 2, 3, 4)
    val diffArray = Array(array1.size) { 0 }

    for (i in array1.indices) {
        diffArray[i] = array1[i] - array2[i]
    }
    return diffArray
}

fun findIndexOfElement(): Int {
    val array = arrayOf(2, 3, 5, 7, 11)
    var i = 0

    while (i < array.size) {
        if (array[i] == 5) {
            return i
        }
        i++
    }

    return -1
}

fun checkEvenOdd() {
    val array = arrayOf(1, 2, 3, 4, 5)

    for (element in array) {
        if (element % 2 == 0) {
            println("$element - чётное")
        } else {
            println("$element - нечётное")
        }
    }
}

fun findSubstring(array: Array<String>, query: String): String? {
    for (element in array) {
        if (element.contains(query)) {
            return element
        }
    }
    return null
}

fun createEmptyList(): List<Int> {

    return listOf()
}

fun createStringList(): List<String> {

    return listOf("Hello", "World", "Kotlin")
}

fun createMutableList(): MutableList<Int> {

    return mutableListOf(1, 2, 3, 4, 5)
}

fun addElementsToList(list: MutableList<Int>) {

    list.add(6)
    list.add(7)
    list.add(8)
}

fun removeElementFromList(list: MutableList<String>, element: String) {

    list.remove(element)
}

fun iterateList(list: List<Int>) {

    for (element in list) {
        println(element)
    }
}

fun getElementByIndex(list: List<String>, index: Int): String {

    return list[index]
}

fun updateElementInList(list: MutableList<Int>, index: Int, newValue: Int) {

    if (index in list.indices) {
        list[index] = newValue  // Перезаписываем элемент по индексу
    }
}

fun mergeLists(list1: List<String>, list2: List<String>): List<String> {
    val mergedList = mutableListOf<String>()


    for (element in list1) {
        mergedList.add(element)
    }


    for (element in list2) {
        mergedList.add(element)
    }

    return mergedList
}

fun findMinMax(list: List<Int>): Pair<Int?, Int?> {
    if (list.isEmpty()) return Pair(null, null)

    var min = list[0]
    var max = list[0]

    for (element in list) {
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
    }

    return Pair(min, max)
}

fun filterEvenNumbers(list: List<Int>): List<Int> {
    val evenNumbers = mutableListOf<Int>()

    for (element in list) {
        if (element % 2 == 0) {
            evenNumbers.add(element)
        }
    }

    return evenNumbers
}


fun createEmptySet(): Set<Int> {
    return setOf()
}


fun createIntSet(): Set<Int> {
    return setOf(1, 2, 3)
}


fun createMutableStringSet(): MutableSet<String> {
    return mutableSetOf("Kotlin", "Java", "Scala")
}


fun addElementsToSet(set: MutableSet<String>) {
    set.add("Swift")
    set.add("Go")
}


fun removeElementFromSet(set: MutableSet<Int>, element: Int) {
    set.remove(element)
}


fun iterateOverSet(set: Set<Int>) {
    for (element in set) {
        println(element)
    }
}


fun containsElement(set: Set<String>, element: String): Boolean {
    return set.contains(element)
}


fun unionOfSets(set1: Set<String>, set2: Set<String>): Set<String> {
    return set1.union(set2)
}


fun intersectionOfSets(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    return set1.intersect(set2)
}

fun differenceOfSets(set1: Set<String>, set2: Set<String>): Set<String> {
    return set1.subtract(set2)
}

fun convertSetToList(set: Set<String>): List<String> {
    return set.toList()
}









