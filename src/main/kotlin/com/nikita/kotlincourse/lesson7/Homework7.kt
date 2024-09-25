package com.nikita.com.nikita.kotlincourse.lesson7

fun main() {
    // Первая задача: вывод чисел от 1 до 5
    println("Числа от 1 до 5:")
    for (i in 1..5) {
        println(i)
    }

    // Вторая задача: вывод четных чисел от 1 до 10
    println("Четные числа от 1 до 10:")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // Третья задача: вывод чисел от 5 до 1
    println("Числа от 5 до 1:")
    for (i in 5 downTo 1) {
        println(i)
    }

    // Четвертая задача: вывод чисел от 10 до 1 с уменьщением на 2
    println("Числа от 10 до 1 с уменьшением на 2:")
    for (i in 10 downTo 1) {
        if (i % 2 != 0) {
            continue
        }
        println(i)
    }


    // Пятая задача: вывод чисел от 1 до 9 с шагом 2
    println("Числа от 1 до 9 с шагом 2:")
    for (i in 1..9 step 2) {
        println(i)
    }


    // Шестая задача: вывод каждого третьего числа от 1 до 20
    println("Каждое третье число от 1 до 20:")
    for (i in 1..20 step 3) {
        println(i)
    }
    // Седьмая задача: вывод чисел от 1 до 9 (9 не включается)
    println("Числа от 1 до 9 (9 не включается):")
    for (i in 1 until 9) {
        println(i)
    }

    // Восьмая задача: вывести числа от 3 до 15, не включая 15.
    println("Числа от 3 до 15 (15 не включается):")
    for (i in 3 until 15) {
        println(i)
    }

    // Девятая задача: Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    println("Квадраты чисел от 1 до 5:")
    var number = 1
    for (i in 1 until 5) {
        println(number * number)
        number++
    }

    //Десятая задача:  Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    println("Уменьшение от 10 до 5")
    var number2 = 10
    while (number2 >= 5) {
        println(number2)
        number2--
    }

    // Задача 11:Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    println("вывод чисел от 5 до 1")
    var number3 = 5

    do {
        println(number3)
        number3--
    } while (number3 >= 1)


// Задача 12: Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    println("счетчик от 10 до 5")
    var counter = 5

    do {
        println(counter)
        counter++
    } while (counter < 10)


    // Задача 12: Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    println("цикл от 1 до 10")
        for (i in 1..10) {
            if (i == 6) {
                break
            }
            println(i)
        }

    // Задача 13: Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
println("прерывается на 10")
    var number4 = 1

    while (true) {
        if (number4 == 10) {
            break
        }
        println(number4)
        number4++
    }

//Задача 14: В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
println("от 1 до 10 без четных")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }

//Задача 15: Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
        println("числа от 1 до 10 с пропуском кратных 3")
        var number5 = 1

        while (number5 <= 10) {
            if (number5 % 3 == 0) {
                number5++
                continue
            }
            println(number5)
            number5++
        }


//Задача 16: Большой цикл
println("Большой цикл чисел")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}

