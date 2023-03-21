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
//    fun bonus(): Double {
//        return this.remuneration * 0.2
//    }

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}