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
    override val bonus: Double get() = super.bonus * 0.3 + this.remuneration + this.plr

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}