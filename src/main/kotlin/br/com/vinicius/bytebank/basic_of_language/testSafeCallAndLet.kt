package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.customer.Address

fun testSafeCallAndLet() {
    var address: Address? = Address(city = "Brasilia")
    println(address?.city?.length?.toString())
    address?.let {
        println(it.city.length.toString())
    }
}