package account

abstract class Account(
    var owner: String,
    val number: Int,
) {
    var balanceAvailable = 0.0
        protected set

    fun deposit(amount: Double) {
        this.balanceAvailable += amount
    }

    abstract fun withdraw(amount: Double)

    fun balanceTransfer(amount: Double, target: Account): Boolean {
        this.withdraw(amount)
        target.deposit(amount)
        return true;
    }
}