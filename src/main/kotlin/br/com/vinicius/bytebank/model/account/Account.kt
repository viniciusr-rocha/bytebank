package br.com.vinicius.bytebank.model.account

import br.com.vinicius.bytebank.exceptions.FailureAuthenticationException
import br.com.vinicius.bytebank.exceptions.InsufficientAmountException
import br.com.vinicius.bytebank.model.authentication.Authenticated
import br.com.vinicius.bytebank.model.customer.Customer

abstract class Account(
    var customer: Customer,
    val number: Int,
) : Authenticated {
    var balanceAvailable = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    override fun authenticate(password: Int): Boolean {
        return customer.authenticate(password)
    }

    fun deposit(amount: Double) {
        this.balanceAvailable += amount
    }

    abstract fun withdraw(amount: Double)

    fun balanceTransfer(amount: Double, target: Account, password: Int): Boolean {
        if (balanceAvailable < amount) {
            throw InsufficientAmountException(message = "O saldo e insuficiente, saldo atual: $balanceAvailable, valor a ser subtraido $amount")
        }
        if (!authenticate(password)) {
            throw FailureAuthenticationException()
        }

        this.withdraw(amount)
        target.deposit(amount)
        return true;
    }
}