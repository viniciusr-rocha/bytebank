import br.com.vinicius.bytebank.model.customer.Address

fun main() {
    val address = Address("Miami 404")

    println(address.hashCode())

    println(address.toString())
}

fun print(value: Any): Any {
    println(value)
    return value
}