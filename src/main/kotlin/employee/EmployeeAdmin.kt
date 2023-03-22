package employee

import Authenticated

abstract class EmployeeAdmin(
    name: String,
    documentNumber: String,
    remuneration: Double,
    private val password: Int,
) : Employee(
    name,
    documentNumber,
    remuneration
), Authenticated {

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}