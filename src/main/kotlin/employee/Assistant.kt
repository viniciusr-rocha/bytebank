package employee

class Assistant(
    name: String,
    documentNumber: String,
    remuneration: Double,
) : Employee(
    name,
    documentNumber,
    remuneration
) {
    override val bonus: Double get() = this.remuneration * 0.5
}