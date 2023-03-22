package br.com.vinicius.bytebank.basic_of_language

fun createAccount(i: Int) {
    val owner = "Kotlin $i"
    val accountNumber = 1000 + i
    val balanceAvailable = 50.0 + i

    println("Owner: $owner")
    println("br.com.vinicius.bytebank.Account number: $accountNumber")
    println("Balance available: $balanceAvailable")
    println()
}