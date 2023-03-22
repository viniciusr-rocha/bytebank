class Customer(
    val name: String,
    val documentNumber: String,
    override var password: Int,
) : Authenticated