package br.com.vinicius.bytebank.model.customer

import br.com.vinicius.bytebank.model.authentication.Authenticated

class Customer(
    var name: String,
    val documentNumber: String,
    val password: Int,
) : Authenticated {
    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}