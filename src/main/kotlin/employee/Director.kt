package employee

import Authenticated

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
), Authenticated {
    override val bonus: Double get() = this.remuneration + this.plr
}