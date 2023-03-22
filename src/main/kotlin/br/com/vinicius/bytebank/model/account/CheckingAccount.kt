package br.com.vinicius.bytebank.model.account

import br.com.vinicius.bytebank.model.customer.Customer

class CheckingAccount(
    customer: Customer,
    number: Int,
) : Account(
    customer,
    number
) {
    override fun withdraw(amount: Double) {
        val amountWithTax = amount + 0.1
        if (this.balanceAvailable >= amountWithTax) {
            this.balanceAvailable -= amountWithTax
            return
        }
        throw RuntimeException("Saldo insuficiente")
    }
}