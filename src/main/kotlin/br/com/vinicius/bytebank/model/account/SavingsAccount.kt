package br.com.vinicius.bytebank.model.account

class SavingsAccount(
    owner: String,
    number: Int,
) : Account(
    owner,
    number
) {
    override fun withdraw(amount: Double) {
        if (this.balanceAvailable >= amount) {
            this.balanceAvailable -= amount
            return
        }
        throw RuntimeException("Saldo insuficiente")
    }
}