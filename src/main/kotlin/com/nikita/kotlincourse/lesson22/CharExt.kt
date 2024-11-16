package com.nikita.com.nikita.kotlincourse.lesson22

fun Char?.processWithArguments(arg1: Int, arg2: Int, flag: Boolean) {
    if (this != null) {
        println("Char: $this, Arg1: $arg1, Arg2: $arg2, Flag: $flag")
    } else {
        println("Char is null")
    }
}
