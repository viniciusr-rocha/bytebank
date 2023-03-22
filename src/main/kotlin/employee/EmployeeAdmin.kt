package employee

abstract class EmployeeAdmin(
    val name: String,
    val documentNumber: String,
    val remuneration: Double,
    val password: Int
) {
    abstract val bonus: Double

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}