package com.nikita.com.nikita.kotlincourse.lesson18.Homework18

// Базовый класс Animal
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// Подкласс Dog
class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[32mBark\u001B[0m") // Зеленый цвет
    }
}

// Подкласс Cat
class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[34mMeow\u001B[0m") // Синий цвет
    }
}

// Подкласс Bird
class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[33mTweet\u001B[0m") // Желтый цвет
    }
}

fun main() {

    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())


    for (animal in animals) {
        animal.makeSound()
    }
}
