package employee

abstract class EmployeeAdmin(
    name: String,
    documentNumber: String,
    remuneration: Double,
    val password: Int,
) : Employee(
    name,
    documentNumber,
    remuneration
) {

    open fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}