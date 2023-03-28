import br.com.vinicius.bytebank.model.customer.Address

fun main() {
    var address: Address? = Address(city = "Brasilia")
    println(address?.city?.length?.toString())
    address?.let {
        println(it.city.length.toString())
    }
}