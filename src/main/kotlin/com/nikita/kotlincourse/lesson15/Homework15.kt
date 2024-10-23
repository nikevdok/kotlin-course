package com.nikita.com.nikita.kotlincourse.lesson15

class Homework15 {
}

// Событие: Вечеринка
class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Вечеринка проводится в $location с количеством гостей $attendees.")
    }
}

// Аспект реальности: Эмоция
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        val intensityDescription = when (intensity) {
            in 1..3 -> "слабая"
            in 4..6 -> "умеренная"
            else -> "сильная"
        }
        println("Эмоция: $type, Интенсивность: $intensity ($intensityDescription)")
    }
}

// Природное явление: Луна
object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Луна видна. Текущая фаза: $phase.")
        } else {
            println("Луна не видна.")
        }
    }
}

// Покупка: Продукт
data class Product(val name: String, val price: Double, val quantity: Int)

// Мероприятие: Концерт
class Concert(val band: String, val location: String, val ticketPrice: Double, val venueCapacity: Int) {
    private var soldTickets = 0

    fun concertDetails() {
        println("Концерт группы $band, место проведения: $location, стоимость билета: $$ticketPrice, вместимость: $venueCapacity.")
    }

    fun buyTicket() {
        if (soldTickets < venueCapacity) {
            soldTickets++
            println("Билет куплен! Продано билетов: $soldTickets")
        } else {
            println("Билеты распроданы!")
        }
    }
}

// Дополнительное задание: Работа со Стеллажами и Полками
class Shelf(val capacity: Int) {
    private val items = mutableListOf<Item>()

    fun addItem(item: Item): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(itemName: String): Boolean {
        val item = items.find { it.name == itemName }
        return if (item != null) {
            items.remove(item)
            true
        } else {
            false
        }
    }

    fun canAccommodate(item: Item): Boolean {
        val currentCapacity = items.sumOf { it.size }
        return currentCapacity + item.size <= capacity
    }

    fun containsItem(itemName: String): Boolean {
        return items.any { it.name == itemName }
    }

    fun getItems(): List<Item> {
        return items.toList()
    }

    fun remainingCapacity(): Int {
        val usedCapacity = items.sumOf { it.size }
        return capacity - usedCapacity
    }
}

class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): Boolean {
        return if (index in shelves.indices) {
            shelves.removeAt(index)
            true
        } else {
            false
        }
    }

    fun addItem(item: Item): Boolean {
        val shelf = shelves.sortedByDescending { it.remainingCapacity() }
            .find { it.canAccommodate(item) }
        return shelf?.addItem(item) ?: false
    }

    fun removeItem(itemName: String): Boolean {
        val shelf = shelves.find { it.containsItem(itemName) }
        return shelf?.removeItem(itemName) ?: false
    }

    fun containsItem(itemName: String): Boolean {
        return shelves.any { it.containsItem(itemName) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        shelves.forEachIndexed { index, shelf ->
            println("Полка $index, Вместимость: ${shelf.capacity}, Оставшаяся вместимость: ${shelf.remainingCapacity()}, Предметы: ${shelf.getItems().joinToString(", ") { it.name }}")
        }
    }
}

data class Item(val name: String, val size: Int)

fun main() {
    // Party
    val party = Party("Нью-Йорк", 50)
    party.details()

    // Emotion
    val emotion = Emotion("радость", 5)
    emotion.express()

    // Moon
    Moon.isVisible = true
    Moon.phase = "Full Moon"
    Moon.showPhase()

    // Product
    val product = Product("Телефон", 699.99, 3)
    println("Продукт: ${product.name}, Цена: ${product.price}, Количество: ${product.quantity}")

    // Concert
    val concert = Concert("The Beatles", "London", 100.0, 500)
    concert.concertDetails()
    concert.buyTicket()
    concert.buyTicket()

    // Shelf and Rack
    val shelf1 = Shelf(30)
    val shelf2 = Shelf(50)
    val item1 = Item("Книга", 10)
    val item2 = Item("Лампа", 15)
    val item3 = Item("Ковер", 25)

    shelf1.addItem(item1)
    shelf2.addItem(item2)

    val rack = Rack(5)
    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addItem(item3)

    rack.printContents()
}
