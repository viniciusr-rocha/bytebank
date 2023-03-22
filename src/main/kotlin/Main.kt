import br.com.vinicius.bytebank.model.authentication.InternalSystem
import br.com.vinicius.bytebank.model.customer.Customer
import br.com.vinicius.bytebank.model.employee.Manager

fun main() {
    val manager = Manager(
        "Kotlin",
        "111.111.111-11",
        1000.0,
        123
    )

    val internalSystem = InternalSystem()
    internalSystem.authenticate(manager, 123)

    val customer = Customer(
        "br.com.vinicius.bytebank.model.customer.Customer",
        "333.333.333-33",
        123
    )

    internalSystem.authenticate(customer, 123)
}