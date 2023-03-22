package employee

abstract class Employee(
    val name: String,
    val documentNumber: String,
    val remuneration: Double,
) {
    open val bonus: Double get() = this.remuneration * 0.1
}