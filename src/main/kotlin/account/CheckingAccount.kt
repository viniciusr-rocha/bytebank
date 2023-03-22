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
        super.withdraw(amountWithTax)
    }
}