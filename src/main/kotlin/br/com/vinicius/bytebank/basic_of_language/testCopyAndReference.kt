package br.com.vinicius.bytebank.basic_of_language

import br.com.vinicius.bytebank.model.account.CheckingAccount
import br.com.vinicius.bytebank.model.customer.Customer

private fun testCopyAndReference() {
    val number = 10.0
    var numberCopy = number
    numberCopy += 5
    println(number)
    println(numberCopy)

    var maria = Customer(
        "Maria",
        "234534534",
        123
    )

    val mariaAccount = CheckingAccount(maria, 1000)
    mariaAccount.customer.name = "Maria"
    println(mariaAccount.customer.name)
}