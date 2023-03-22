package br.com.vinicius.bytebank.model.employee

import br.com.vinicius.bytebank.model.employee.Employee

class Assistant(
    name: String,
    documentNumber: String,
    remuneration: Double,
) : Employee(
    name,
    documentNumber,
    remuneration
) {
    override val bonus: Double get() = this.remuneration * 0.5
}