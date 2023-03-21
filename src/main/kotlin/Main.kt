fun main() {
    println("Welcome to Bytebank")

    val owner: String = "Kotlin"
    val accountNumber: Int = 11325893
    var balanceAvailable: Double = 0.0
    balanceAvailable = 100 + 100.0
    balanceAvailable += 50

    println("Owner: $owner")
    println("Account number: $accountNumber")
    println("Balance available: $balanceAvailable")

    when {
        balanceAvailable == 0.0 -> println("The account is neutral")
        balanceAvailable < 0 -> println("The account is negative")
        else -> println("The account is positive")
    }

}