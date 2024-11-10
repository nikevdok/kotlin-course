package com.nikita.com.nikita.kotlincourse.lesson20.Homework20

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

// Абстрактный класс для включаемого оборудования
abstract class PowerDevice : Powerable {
    var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("Устройство включено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("Устройство выключено")
    }
}

// Абстрактный класс для программируемого оборудования
abstract class ProgrammableDevice : PowerDevice(), Programmable {
    private var currentAction: String? = null

    override fun programAction(action: String) {
        if (isPoweredOn) {
            currentAction = action
            println("Устройство запрограммировано на действие: $action")
        } else {
            println("Ошибка: Устройство выключено")
        }
    }

    override fun execute() {
        if (isPoweredOn && currentAction != null) {
            println("Выполнение действия: $currentAction")
        } else {
            println("Ошибка: Устройство выключено или не запрограммировано")
        }
    }
}

// Абстрактный класс оборудования с возможностью открываться и устанавливать температуру
abstract class TemperatureControlledDevice : ProgrammableDevice(), Openable, TemperatureRegulatable {
    override val maxTemperature: Int = 300
    private var currentTemperature: Int = 0
    private var isOpen = false

    override fun setTemperature(temp: Int) {
        if (isPoweredOn) {
            if (temp <= maxTemperature) {
                currentTemperature = temp
                println("Температура установлена на $temp градусов")
            } else {
                println("Ошибка: Превышена максимальная температура")
            }
        } else {
            println("Ошибка: Устройство выключено")
        }
    }

    override fun open() {
        isOpen = true
        println("Устройство открыто")
    }

    override fun close() {
        isOpen = false
        println("Устройство закрыто")
    }
}
// Класс Холодильник
class Refrigerator : TemperatureControlledDevice() {
    override val maxTemperature = 10

    fun coolDown() {
        if (isPoweredOn) {
            println("Холодильник охлаждает до $maxTemperature градусов")
        } else {
            println("Ошибка: Холодильник выключен")
        }
    }
}

// Класс Стиральная Машина
class WashingMachine : TemperatureControlledDevice() {
    fun startWashing() {
        if (isPoweredOn) {
            println("Стиральная машина запущена")
        } else {
            println("Ошибка: Стиральная машина выключена")
        }
    }
}

// Класс Чайник
class Kettle : TemperatureControlledDevice() {
    override val maxTemperature = 100

    fun boilWater() {
        if (isPoweredOn) {
            println("Чайник кипятит воду до $maxTemperature градусов")
        } else {
            println("Ошибка: Чайник выключен")
        }
    }
}

// Класс Духовка
class Oven : TemperatureControlledDevice() {
    override val maxTemperature = 250

    fun bake() {
        if (isPoweredOn) {
            println("Духовка разогрета до $maxTemperature градусов и готова к выпечке")
        } else {
            println("Ошибка: Духовка выключена")
        }
    }
}
fun main() {
    val fridge = Refrigerator()
    val washingMachine = WashingMachine()
    val kettle = Kettle()
    val oven = Oven()

    // Тестируем холодильник
    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.coolDown()
    fridge.close()
    fridge.powerOff()

    println()

    // Тестируем стиральную машину
    washingMachine.powerOn()
    washingMachine.programAction("Стирка хлопка")
    washingMachine.execute()
    washingMachine.startWashing()
    washingMachine.powerOff()

    println()

    // Тестируем чайник
    kettle.powerOn()
    kettle.setTemperature(90)
    kettle.boilWater()
    kettle.powerOff()

    println()

    // Тестируем духовку
    oven.powerOn()
    oven.setTemperature(180)
    oven.bake()
    oven.powerOff()
}
