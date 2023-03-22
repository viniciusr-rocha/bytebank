package account

open class Account(
    var owner: String,
    val number: Int,
) {
    var balanceAvailable = 0.0
        private set

    fun deposit(amount: Double) {
        this.balanceAvailable += amount
    }

    open fun withdraw(amount: Double) {
        if (amount > this.balanceAvailable) {
            throw RuntimeException("Saldo insufificente para saque. Saldo ${this.balanceAvailable}, valor $amount")
        }
        this.balanceAvailable -= amount
        return
    }

    fun balanceTransfer(amount: Double, target: Account): Boolean {
        this.withdraw(amount)
        target.deposit(amount)
        return true;
    }
}