class Manager(
    val name: String,
    val documentNumber: String,
    val remuneration: Double,
    val password: Int
) {
    fun bonus(): Double {
        return this.remuneration * 0.2
    }

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}