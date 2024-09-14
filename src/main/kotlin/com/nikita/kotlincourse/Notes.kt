package com.nikita.com.nikita.kotlincourse.lesson3

val name: String = "Alice"

var age: Int = 30

const val PI = 3.14 // comment

lateinit var userInfo: String

val lazyValue: String by lazy {
    "Hello, this is a lazy string"
}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >=0) field = value
    }

fun countUp(){
    count = -1
}

val vin: String = "12345abc"

var carcolour: String = "blue"

var distance: Double = 0.0

lateinit var ownername: String

const val WHEELS: Int = 4

val report: String by lazy {
    "Car final report"
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value >0) field += value
    }





