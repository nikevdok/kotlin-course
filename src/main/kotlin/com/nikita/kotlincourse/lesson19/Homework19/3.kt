package com.nikita.com.nikita.kotlincourse.lesson19.Homework19

// Абстрактный класс для операций
abstract class Operation {
    abstract fun execute(operand1: String, operand2: String): String
    abstract fun isApplicable(expression: String): Boolean
    abstract fun getOperator(): String

    fun splitExpression(expression: String): Pair<String, String>? {
        val operator = getOperator()
        val parts = expression.split(operator)
        return if (parts.size == 2) parts[0].trim() to parts[1].trim() else null
    }
}

// Класс для сложения
class Addition : Operation() {
    override fun execute(operand1: String, operand2: String): String {
        return try {
            (operand1.toDouble() + operand2.toDouble()).toString()
        } catch (e: NumberFormatException) {
            "Ошибка: некорректные операнды"
        }
    }

    override fun isApplicable(expression: String): Boolean {
        return expression.contains(" + ")
    }

    override fun getOperator(): String = " + "
}

// Класс для вычитания
class Subtraction : Operation() {
    override fun execute(operand1: String, operand2: String): String {
        return try {
            (operand1.toDouble() - operand2.toDouble()).toString()
        } catch (e: NumberFormatException) {
            "Ошибка: некорректные операнды"
        }
    }

    override fun isApplicable(expression: String): Boolean {
        return expression.contains(" - ")
    }

    override fun getOperator(): String = " - "
}

// Класс для умножения
class Multiplication : Operation() {
    override fun execute(operand1: String, operand2: String): String {
        return try {
            (operand1.toDouble() * operand2.toDouble()).toString()
        } catch (e: NumberFormatException) {
            "Ошибка: некорректные операнды"
        }
    }

    override fun isApplicable(expression: String): Boolean {
        return expression.contains(" * ")
    }

    override fun getOperator(): String = " * "
}

// Класс для деления
class Division : Operation() {
    override fun execute(operand1: String, operand2: String): String {
        return try {
            if (operand2.toDouble() == 0.0) "Ошибка: деление на ноль"
            else (operand1.toDouble() / operand2.toDouble()).toString()
        } catch (e: NumberFormatException) {
            "Ошибка: некорректные операнды"
        }
    }

    override fun isApplicable(expression: String): Boolean {
        return expression.contains(" / ")
    }

    override fun getOperator(): String = " / "
}

// Класс для вычисления остатка от деления
class Modulus : Operation() {
    override fun execute(operand1: String, operand2: String): String {
        return try {
            (operand1.toDouble() % operand2.toDouble()).toString()
        } catch (e: NumberFormatException) {
            "Ошибка: некорректные операнды"
        }
    }

    override fun isApplicable(expression: String): Boolean {
        return expression.contains(" % ")
    }

    override fun getOperator(): String = " % "
}

// Класс Калькулятора
class Calculator(private val operations: MutableList<Operation> = mutableListOf()) {

    init {
        // Добавляем стандартные операции по умолчанию
        operations.addAll(
            listOf(
                Addition(),
                Subtraction(),
                Multiplication(),
                Division(),
                Modulus()
            )
        )
    }

    fun addOperation(operation: Operation) {
        operations.add(operation)
    }

    fun calculate(expression: String): String {
        for (operation in operations) {
            if (operation.isApplicable(expression)) {
                val parts = operation.splitExpression(expression)
                if (parts != null) {
                    return operation.execute(parts.first, parts.second)
                }
            }
        }
        return "Ошибка: неподдерживаемая операция"
    }
}

// Тестирование калькулятора
fun main() {
    val calculator = Calculator()

    println(calculator.calculate("3 + 5")) // Ожидается: 8.0
    println(calculator.calculate("10 - 4")) // Ожидается: 6.0
    println(calculator.calculate("6 * 7")) // Ожидается: 42.0
    println(calculator.calculate("8 / 2")) // Ожидается: 4.0
    println(calculator.calculate("10 % 3")) // Ожидается: 1.0
    println(calculator.calculate("8 / 0")) // Ожидается: Ошибка: деление на ноль
    println(calculator.calculate("abc + def")) // Ожидается: Ошибка: некорректные операнды
    println(calculator.calculate("5 ^ 2")) // Ожидается: Ошибка: неподдерживаемая операция
}
