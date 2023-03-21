package employee

class Manager(
    name: String,
    documentNumber: String,
    remuneration: Double,
    val password: Int
) : Employee(
    name = name,
    documentNumber = documentNumber,
    remuneration = remuneration
) {
    override val bonus: Double = super.bonus + this.remuneration

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}