package com.nikita.com.nikita.kotlincourse.lesson26

/*
fun main () {

   val increment = fun (a: Int): Int {
       return a + 1
   }

    val increment1: (Int) -> Int = { a ->
        a + 1


    }
       println(increment(1))


    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }
    val findIndex1: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, 0, ignoreCase)
    }

    val findIndex2 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }

    class OrderProcessor(val deliveryAddress: String) {

        fun calculateDeliveryTime(productId: Int): String {
            val deliveryTimeDays = when (productId) {
                in 1..100 -> 3
                else -> 5
            }
            return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
        }
    }
    val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
    fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
    val calculateDeliveryTime: OrderProcessor.(Int) -> String = {
   val deliveryTimeDays = when (it) {
       in 1..100 -> 3
       else -> 5
   }
   "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}
val op = OrderProcessor("my address")
op.calculateDeliveryTime1(34)
 */

// Обычное объявление функции
    //fun increment(a: Int): Int {
      //  return a + 1

/*fun main (){
val function1 = fun() {
    println("Hello world!")
}
val function11: () -> Unit = {
    println("Hello world!")
}
val function12 = {
    println("Hello world!")
}


}

val newName = "1"

fun function1 (): Unit {
    println("Hello world!")
}*/


/*
fun main() {
    val function1 = fun (arg: String): Int{
        return arg.length
    }
    val function11: (String) -> Int = {
        it.length
    }
    val function12 = {arg: String ->
        arg.length
    }
}

fun function1 (arg: String): Int{
    return arg.length
}*/

fun main() {
    val function5 = fun String.(a: Int, b: Int): Boolean {
        println(this)
        println(a)
        println(b)
        return a==b
    }
    val function123: String.(Int, Int) -> Boolean = {a,b ->
        println(this)
        println(a)
        println(b)
        a==b
    }
    println("Hello world1".function123(3,5))
}

fun String.function5(a: Int, b: Int): Boolean {
    println(this)
    println(a)
    println(b)
    return a==b
}