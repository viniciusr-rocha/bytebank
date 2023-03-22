import account.CheckingAccount
import account.SavingsAccount

fun main() {
    println("Welcome to Bytebank")

    val savingsAccount = SavingsAccount(
        "Kotlin",
        1000
    )
    val checkingAccount = CheckingAccount(
        "Java",
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