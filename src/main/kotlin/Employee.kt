class Employee(
    val name: String,
    val documentNumber: String,
    val remuneration: Double
) {
    fun bonus(): Double {
        return this.remuneration * 0.1
    }
}