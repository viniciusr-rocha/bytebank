package br.com.vinicius.bytebank.model.employee

class Manager(
    name: String,
    documentNumber: String,
    remuneration: Double,
    password: Int,
) : EmployeeAdmin(
    name,
    documentNumber,
    remuneration,
    password
) {
    override val bonus: Double = this.remuneration
}