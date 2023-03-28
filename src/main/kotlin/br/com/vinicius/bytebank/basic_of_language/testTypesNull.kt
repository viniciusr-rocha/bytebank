package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.customer.Address

fun testTypesNull() {
    var address: Address? = null
    val addressNotNull: Address = address!!
    addressNotNull.city
}