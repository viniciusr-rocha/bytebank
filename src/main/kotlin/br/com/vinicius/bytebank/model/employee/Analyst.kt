package br.com.vinicius.bytebank.model.employee

import br.com.vinicius.bytebank.model.employee.Employee

class Analyst(
    name: String,
    documentNumber: String,
    remuneration: Double,
) : Employee(
    name = name,
    documentNumber = documentNumber,
    remuneration = remuneration
) {
    override val bonus: Double get() = this.remuneration * 0.1;
}