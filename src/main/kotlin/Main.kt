fun main() {
    println("Welcome to Bytebank")

    val kotlinEmployee = Employee("Kotlin", "121212121-12", 1000.0)
    println("Name: ${kotlinEmployee.name}")
    println("Document number: ${kotlinEmployee.documentNumber}")
    println("Remuneration: ${kotlinEmployee.remuneration}")

    println("Bonificacao")
    println(kotlinEmployee.bonus())
}