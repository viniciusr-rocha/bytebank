package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.account.CheckingAccount
import br.com.vinicius.bytebank.model.account.SavingsAccount
import br.com.vinicius.bytebank.model.customer.Customer

fun testBehavior() {
    println("Welcome to Bytebank")

    val maria = Customer(
        "Maria",
        "cpf",
        123
    )

    val accountMaria = CheckingAccount(number = 1000, customer = maria)
    accountMaria.deposit(200.0)

    println()

    val joao = Customer(
        "Joao",
        "cpf",
        456
    )

    val accountJoao = SavingsAccount(customer = joao, number = 10001)
    accountJoao.deposit(300.0)

    println("Depositando na conta Java")
    accountJoao.deposit(50.0)
    println(accountJoao.balanceAvailable)

    if (accountMaria.balanceTransfer(amount = 200.0, target = accountJoao)) {
        println("Transferencia realizada com sucesso")
    }


    accountJoao.withdraw(350.0)
    println(accountJoao.balanceAvailable)
}