package com.nikita.com.nikita.kotlincourse.lesson19.Homework19

class GameMachine(
    val color: String,
    val model: String,
    var isOn: Boolean = false,
    private var isOSLoaded: Boolean = false,
    private val gamesList: List<String>,
    val hasJoystick: Boolean,
    private var balance: Double = 0.0,
    val owner: String,
    val supportPhone: String
) {

    // Включить автомат
    fun powerOn() {
        if (!isOn) {
            isOn = true
            println("Игровой автомат включен")
        } else {
            println("Автомат уже включен")
        }
    }

    // Выключить автомат
    fun powerOff() {
        if (isOn) {
            isOn = false
            isOSLoaded = false
            println("Игровой автомат выключен")
        }
    }

    // Загрузить операционную систему
    fun loadOS() {
        if (isOn && !isOSLoaded) {
            isOSLoaded = true
            println("ОС загружена")
        }
    }

    // Завершить работу операционной системы
    fun shutdownOS() {
        if (isOn && isOSLoaded) {
            isOSLoaded = false
            println("ОС завершила работу")
        }
    }

    // Показать список доступных игр
    fun showGamesList(): List<String> {
        return if (isOSLoaded) {
            gamesList
        } else {
            println("ОС не загружена")
            emptyList()
        }
    }

    // Включить игру
    fun startGame(gameName: String): Boolean {
        return if (isOSLoaded && gameName in gamesList) {
            println("Игра '$gameName' запущена")
            true
        } else {
            println("Невозможно запустить игру: либо ОС не загружена, либо игра отсутствует")
            false
        }
    }

    // Оплатить игровой сеанс
    fun payForSession(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Оплачено $amount крон за игровой сеанс")
        }
    }

    // Выплатить выигрыш
    fun payoutWinnings(amount: Double): Boolean {
        return if (amount <= balance) {
            balance -= amount
            println("Выплачено $amount крон")
            true
        } else {
            println("Недостаточно средств для выплаты")
            false
        }
    }

    // Открыть сейф и выдать наличные (только для владельца)
    private fun openSafeAndWithdrawCash(): Double {
        val cash = balance
        balance = 0.0
        println("Сейф открыт, выдано $cash крон")
        return cash
    }

    // Получить баланс вырученных средств (только для владельца)
    fun getBalance(ownerName: String): Double {
        return if (ownerName == owner) {
            balance
        } else {
            println("Доступ запрещен")
            0.0
        }
    }
}
