package br.com.vinicius.bytebank.model.employee

abstract class Employee(
    val name: String,
    val documentNumber: String,
    val remuneration: Double,
) {
    abstract val bonus: Double
}