package basic_of_language

import account.Account

fun testBehavior() {
    println("Welcome to Bytebank")
    val accountMaria = Account(number = 1000, owner = "Maria")
    accountMaria.deposit(200.0)
    println(accountMaria.owner)
    println(accountMaria.number)
    println(accountMaria.balanceAvailable)

    println()

    val accountJoao = Account(owner = "Joao", number = 10001)
    accountJoao.deposit(300.0)
    println(accountJoao.owner)
    println(accountJoao.number)
    println(accountJoao.balanceAvailable)

    println("Depositando na conta Java")
    accountJoao.deposit(50.0)
    println(accountJoao.balanceAvailable)

    if (accountMaria.balanceTransfer(amount = 200.0, target = accountJoao)) {
        println("Transferencia realizada com sucesso")
    }


    accountJoao.withdraw(350.0)
    println(accountJoao.balanceAvailable)
}