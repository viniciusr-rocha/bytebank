package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.account.CheckingAccount
import br.com.vinicius.bytebank.model.account.SavingsAccount
import br.com.vinicius.bytebank.model.customer.Customer

fun testAccounts() {
    val kotlin = Customer(
        "Kotlin",
        "324234",
        1
    )

    val java = Customer(
        "Java",
        "324234",
        1
    )

    val savingsAccount = SavingsAccount(
        kotlin,
        1000
    )
    val checkingAccount = CheckingAccount(
        java,
        1001
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Saldo corrente: ${checkingAccount.balanceAvailable}")
    println("Saldo poupanca: ${savingsAccount.balanceAvailable}")

    checkingAccount.withdraw(100.0)
    savingsAccount.withdraw(100.0)

    println("Saldo apos saque corrente: ${checkingAccount.balanceAvailable}")
    println("Saldo apos saque poupanca: ${savingsAccount.balanceAvailable}")

    checkingAccount.balanceTransfer(100.0, savingsAccount)
    println("Saldo corrente apos transferir para poupanca: ${checkingAccount.balanceAvailable}")
    println("Saldo poupanca apos receber transferencia da corrente: ${savingsAccount.balanceAvailable}")

    savingsAccount.balanceTransfer(100.0, checkingAccount)
    println("Saldo poupanca apos transferir para corrente: ${savingsAccount.balanceAvailable}")
    println("Saldo corrente apos receber transferencia da poupanca: ${checkingAccount.balanceAvailable}")
}
