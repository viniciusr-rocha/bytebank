package employee

class Director(
    name: String,
    documentNumber: String,
    remuneration: Double,
    val password: Int,
    val plr: Double
) : Employee(
    name = name,
    documentNumber = documentNumber,
    remuneration = remuneration
) {
    override val bonus: Double get() = this.remuneration * 0.3

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}