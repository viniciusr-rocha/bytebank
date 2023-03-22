package basic_of_language

import account.BonusCalculator
import employee.Analyst
import employee.Employee
import employee.Manager

fun testEmployees() {
    val kotlinEmployee = Analyst(
        "Kotlin",
        "121212121-12",
        1000.0
    )
    println("Name: ${kotlinEmployee.name}")
    println("Document number: ${kotlinEmployee.documentNumber}")
    println("Remuneration: ${kotlinEmployee.remuneration}")
    println("Bonificacao")
    println(kotlinEmployee.bonus)

    println()

    val kotlinManager = Manager(
        "Kotlin Manager",
        "3434343434-34",
        2000.0,
        12345
    )
    println("Name: ${kotlinManager.name}")
    println("Document number: ${kotlinManager.documentNumber}")
    println("Remuneration: ${kotlinManager.remuneration}")
    println("Bonificacao")
    println(kotlinManager.bonus)

    if (kotlinManager.authenticate(kotlinManager.password)) {
        println("Autenticado")
    } else {
        println("Falha na autenticacao")
    }

    val analyst = Analyst(
        "Analyst",
        "121212121-12",
        3000.0
    )
    BonusCalculator().execute(analyst)
}