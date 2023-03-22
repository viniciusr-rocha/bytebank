package account

class CheckingAccount(
    owner: String,
    number: Int,
) : Account(
    owner,
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