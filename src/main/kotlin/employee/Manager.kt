package employee

import Authenticated

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
), Authenticated {
    override val bonus: Double = this.remuneration

    override fun authenticate(password: Int): Boolean {
        return super<Authenticated>.authenticate(password)
    }
}