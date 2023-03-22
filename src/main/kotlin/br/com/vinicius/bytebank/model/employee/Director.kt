package br.com.vinicius.bytebank.model.employee

class Director(
    name: String,
    documentNumber: String,
    remuneration: Double,
    val plr: Double,
    password: Int,
) : EmployeeAdmin(
    name,
    documentNumber,
    remuneration,
    password
) {
    override val bonus: Double get() = this.remuneration + this.plr
}