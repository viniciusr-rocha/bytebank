import br.com.vinicius.bytebank.model.customer.Address

fun main() {
    val address = Address()

    print(Any())

    print(1)
    print(1.0)
    print(address)
}

fun print(value: Any): Any {
    println(value)
    return value
}