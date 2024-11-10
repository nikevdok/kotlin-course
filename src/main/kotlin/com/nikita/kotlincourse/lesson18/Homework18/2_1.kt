package com.nikita.com.nikita.kotlincourse.lesson18.Homework18

class Cart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemMap: Map<Int, Int>) {
        for ((itemId, amount) in itemMap) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    fun addToCart(itemList: List<Int>) {
        for (itemId in itemList) {
            items[itemId] = items.getOrDefault(itemId, 0) + 1
        }
    }

    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("Корзина товаров:\n")
        builder.append("+--------+----------+\n")
        builder.append("| ID     | Кол-во   |\n")
        builder.append("+--------+----------+\n")

        var totalItems = 0
        var totalQuantity = 0

        for ((itemId, quantity) in items) {
            builder.append(String.format("| %-6d | %-8d |\n", itemId, quantity))
            totalItems++
            totalQuantity += quantity
        }

        builder.append("+--------+----------+\n")
        builder.append("Итого товаров: $totalItems\n")
        builder.append("Общее количество: $totalQuantity\n")

        return builder.toString()
    }
}

fun main() {
    val cart = Cart()

    // Добавление товара по одному
    cart.addToCart(101)
    cart.addToCart(102)

    // Добавление товара с количеством
    cart.addToCart(103, 5)

    // Добавление товаров из словаря
    val itemsMap = mapOf(104 to 3, 105 to 7)
    cart.addToCart(itemsMap)

    // Добавление товаров из списка
    val itemsList = listOf(106, 107, 108, 101)
    cart.addToCart(itemsList)

    // Печать содержимого корзины
    println(cart)
}