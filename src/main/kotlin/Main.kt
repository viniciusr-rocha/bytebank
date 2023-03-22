import br.com.vinicius.bytebank.basic_of_language.testAccounts
import br.com.vinicius.bytebank.model.account.SavingsAccount
import br.com.vinicius.bytebank.model.account.accountsTotal
import br.com.vinicius.bytebank.model.customer.Customer

fun main() {

    val kotlin = Customer("kotlin", "", 1)
    val savingsAccount = SavingsAccount(kotlin, 2323)
    testAccounts()
    println("Total de contas $accountsTotal")

}