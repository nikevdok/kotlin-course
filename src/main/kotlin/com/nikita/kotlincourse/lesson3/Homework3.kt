package com.nikita.com.nikita.kotlincourse.lesson3

class Homework {
    //Название мероприятия
    val eventName: String = "Hackathon Survival 2024"
    //Дата проведения
    val eventDate: String = "24 December"
    //Место проведения
    var eventLocation: String = "Strip Club"
    //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    var detailedBudget: Double = 5000000.0
    //Количество участников
    var numberOfParticipants: Int = 100000
    //Длительность хакатона
    var duration: Int = 24
    //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    var contactsSeller: String = "+89129039920 Michael, 5000 dollars"
    //Текущее состояние хакатона (статус)
    var hackathonStatus: String = "Registration Open"
    //Список спонсоров
    val sponsors: String = "Google, Amazon"
    //Бюджет мероприятия
    var budget: Double = 6000000.0
    //Текущий уровень доступа к интернету
    var internetAccessLevel: String = "High-Speed Available"
    //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    var transportationInfo: String = "Equipment delivered by 14th Dec"
    //Количество команд
    var numberOfTeams: Int = 50
    //Перечень задач
    var taskList: String = "not die"
    //План эвакуации
    val evacuationPlan: String = "No plans, just run"
    //Список доступного оборудования
    var availableEquipment: String = "Drinks, laptops"
    //Список свободного оборудования
    var freeEquipment: String = "Wifi"
    //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    var mealSchedule: String = "Day 1 Lunch to 12:00 PM, Day 1 Dinner to 6:00 PM"
    //План мероприятий на случай сбоев
    val backupPlan: String = "go to museum"
    //Список экспертов и жюри
    val juryList: String = "Bred Pitt, Angelina Joli"
    //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
    val feedbackMethods: String = "Anonymous survey anf Post-event interview"
    //Политика конфиденциальности
    val privacyPolicy: String = "All data is protected and only accessible by the event organizers."
    //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    var privateFeedback: String = ""
    //Текущая температура в помещении
    var currentTemperature: Double = 22.5
    //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    var networkPerformance: String = "Stable, 98% uptime"
    //Уровень освещения
    var lightingLevel: Int = 80
    //Лог событий мероприятия
    var eventLog: String = "Event started, Wi-Fi setup completed, First keynote speaker presented"
    //Доступность медицинской помощи
    val medicalSupportAvailable: String = "true"
    //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    val securityPlan: String = "Security personnel at all entrances, emergency contact list ready"
    //Регистрационный номер мероприятия
    val eventRegistrationNumber: String = "12434549"
    //Максимально допустимый уровень шума в помещении хакатона.
    val maxNoiseLevel: Int = 80
    //Индикатор превышения уровня шума в помещениях
    var noiseExceeded: String = "false"
    //Формат мероприятия (зависит от геополитической обстановки)
    var eventFormat: String = "In-person"
    //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
    var freeSeats: Int = 30
        get() = field
        set(value) {
            if (value < 0) {

            }
            field = value
        }
    //План взаимодействия с прессой
    val pressPlan: String = "Press briefing scheduled for the second day, 5 PM"
    //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    var projectDetails: String = "Plan of the teams"
    //Статус получения всех необходимых разрешений
    var permitsAcquired: String = "yes"
    //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
    var exclusiveAccessGranted: String = "yes"
    //Список партнеров мероприятия
    val partners: String = "Ministry of Education, City Government"
    //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    lateinit var eventReportGenerated: String
    //План распределения призов
    val prizePlan: String = "Top 3 teams receive cash prizes, gifts from sponsors"
    //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
    val emergencyContacts: String = "Ambulance: 911, Fire Dept: 112, Security: +123456789"
    //Особые условия для участников с ограниченными возможностями
    val specialConditions: String = "Accessible restrooms, wheelchair ramps"
    //Общее настроение участников (определяется опросами)
    var participantMood: String = "Excited"
    //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
    val lazyPlan: String by lazy {
        "Plan of the event"
    }
    //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
    val lazyGuest: String by lazy {
        "Special guest"
    }
    //Максимальное количество людей, которое может вместить место проведения.
    val maxCapacity: Int = 300
    //Стандартное количество часов, отведенное каждой команде для работы над проектом.
    val standardWorkingHours: Int = 24
    //Текущая температура в помещении
    val currentTemperatureNow: Double = 23.0
}
