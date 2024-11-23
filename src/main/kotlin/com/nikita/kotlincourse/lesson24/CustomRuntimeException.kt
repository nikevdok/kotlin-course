package com.nikita.com.nikita.kotlincourse.lesson24


class CustomRuntimeException(cause: ArrayIndexOutOfBoundsException) : RuntimeException("Custom exception caused by: ${cause.message}", cause)