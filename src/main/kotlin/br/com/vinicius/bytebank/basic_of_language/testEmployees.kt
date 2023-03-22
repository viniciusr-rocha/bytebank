package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.account.BonusCalculator
import br.com.vinicius.bytebank.model.employee.Analyst
import br.com.vinicius.bytebank.model.employee.Manager

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

    val analyst = Analyst(
        "Analyst",
        "121212121-12",
        3000.0
    )
    BonusCalculator().execute(analyst)
}