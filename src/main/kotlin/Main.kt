import employee.Manager

fun main() {
    val manager = Manager(
        "Kotlin",
        "111.111.111-11",
        1000.0,
        123
    )

    val internalSystem = InternalSystem()
    internalSystem.authenticate(manager, 123)
}