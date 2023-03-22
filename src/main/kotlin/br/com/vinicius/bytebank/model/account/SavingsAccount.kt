package br.com.vinicius.bytebank.model.account

import br.com.vinicius.bytebank.model.customer.Customer

class SavingsAccount(
    customer: Customer,
    number: Int,
) : Account(
    customer,
    number
) {
    override fun withdraw(amount: Double) {
        if (this.balanceAvailable >= amount) {
            this.balanceAvailable -= amount
            return
        }
        throw RuntimeException("Saldo insuficiente")
    }
}