import br.com.vinicius.bytebank.basic_of_language.testAccounts
import br.com.vinicius.bytebank.model.account.Account
import br.com.vinicius.bytebank.model.account.SavingsAccount
import br.com.vinicius.bytebank.model.authentication.Authenticated
import br.com.vinicius.bytebank.model.authentication.InternalSystem
import br.com.vinicius.bytebank.model.customer.Customer

fun main() {

    val fran = object : Authenticated {
        val name: String = "Fran"
        val documentNumber: String = ""
        val password: Int = 100

        override fun authenticate(password: Int) = this.password == password
    }

    val internalSystem = InternalSystem()
    internalSystem.authenticate(fran, 100)

    println("Nome do cliente ${fran.name}")

    val kotlin = Customer("kotlin", "", 1)
    val savingsAccount = SavingsAccount(kotlin, 2323)
    testAccounts()
    println("Total de contas ${Account.total}")

}