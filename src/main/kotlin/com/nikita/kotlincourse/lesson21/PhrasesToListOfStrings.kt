package com.nikita.com.nikita.kotlincourse.lesson21


class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(input: String): List<String> {
        return input.split(" ")
    }

    override fun transformList(input: List<String>): List<List<String>> {
        return input.map { it.split(" ") }
    }
}