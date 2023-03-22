package br.com.vinicius.bytebank.model.account

import br.com.vinicius.bytebank.model.customer.Customer

var accountsTotal = 0
    private set

abstract class Account(
    var customer: Customer,
    val number: Int,
) {
    var balanceAvailable = 0.0
        protected set

    init {
        println("Criando conta")
        accountsTotal++
    }

    fun deposit(amount: Double) {
        this.balanceAvailable += amount
    }

    abstract fun withdraw(amount: Double)

    fun balanceTransfer(amount: Double, target: Account): Boolean {
        this.withdraw(amount)
        target.deposit(amount)
        return true;
    }
}