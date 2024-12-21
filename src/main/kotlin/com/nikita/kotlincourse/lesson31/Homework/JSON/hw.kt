import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

// Enum для типов должностей
enum class CharacterTypes {
    CTO, TEAM_LEAD, DEVELOPER, DESIGNER, TESTER
}

// Data class для сотрудника
data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val dateOfBirth: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = listOf()
)

fun main() {
    val developer1 = Employee("John Developer", true, "1990-01-01", CharacterTypes.DEVELOPER)
    val developer2 = Employee("Jane Developer", true, "1992-02-02", CharacterTypes.DEVELOPER)
    val designer = Employee("Alice Designer", true, "1995-03-03", CharacterTypes.DESIGNER)
    val tester = Employee("Bob Tester", true, "1993-04-04", CharacterTypes.TESTER)

    val teamLead1 = Employee(
        "Eve TeamLead1",
        true,
        "1988-06-06",
        CharacterTypes.TEAM_LEAD,
        listOf(developer1, designer)
    )

    val teamLead2 = Employee(
        "Adam TeamLead2",
        true,
        "1985-05-05",
        CharacterTypes.TEAM_LEAD,
        listOf(developer2, tester)
    )

    val cto = Employee(
        "Sophia CTO",
        true,
        "1980-01-01",
        CharacterTypes.CTO,
        listOf(teamLead1, teamLead2)
    )

    // Сериализация объекта CTO
    val gson: Gson = GsonBuilder().setPrettyPrinting().create()
    val serializedCTO = gson.toJson(cto)

    // Запись сериализованного текста в файл
    val fileName = "cto.json"
    File(fileName).writeText(serializedCTO)
    println("Сериализованный объект записан в файл $fileName")

    // Чтение из файла и десериализация
    val deserializedCTO = gson.fromJson(File(fileName).readText(), Employee::class.java)
    println("Десериализованный объект:")
    println(deserializedCTO)
}