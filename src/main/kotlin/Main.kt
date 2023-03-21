fun main() {
    println("Welcome to Bytebank")
    val accountKotlin = Account()
    accountKotlin.owner = "Kotlin"
    accountKotlin.number = 1000
    accountKotlin.balance = 200.0
    println(accountKotlin.owner)
    println(accountKotlin.number)
    println(accountKotlin.balance)

    println()

    val accountJava = Account()
    accountJava.owner = "Java"
    accountJava.number = 10001
    accountJava.balance = 300.0
    println(accountJava.owner)
    println(accountJava.number)
    println(accountJava.balance)

    println("Depositando na conta Java")
    deposit(accountJava, 50.0)
    println(accountJava.balance)

}

private fun deposit(account: Account, amount: Double) {
    account.balance += amount
}

private fun testCopyAndReference() {
    val number = 10.0
    var numberCopy = number
    numberCopy += 5
    println(number)
    println(numberCopy)

    val maria = Account()
    maria.owner = "Maria"
    val joao = maria
    maria.owner = "joao"
    println(maria.owner)
    println(joao.owner)
}

class Account {
    var owner = ""
    var number = 0
    var balance = 0.0
}

private fun nestedLoopUsingBreak() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

private fun whileLoop() {
    var i = 0
    while (i < 5) {
        createAccount(i)
        i++
    }
}

private fun forLoopStep() {
    for (i in 5 downTo 1 step 2) {
        createAccount(i)
    }
}

private fun forLoopDescending() {
    for (i in 5 downTo 1) {
        createAccount(i)
    }
}

private fun forLoopInRange() {
    for (i in 1..5) {
        createAccount(i)
    }
}

private fun createAccount(i: Int) {
    val owner = "Kotlin $i"
    val accountNumber = 1000 + i
    val balanceAvailable = 50.0 + i

    println("Owner: $owner")
    println("Account number: $accountNumber")
    println("Balance available: $balanceAvailable")
    println()
}

private fun testConditions(balanceAvailable: Double) {
    if (balanceAvailable == 0.0) {
        println("The account is neutral")
    } else if (balanceAvailable < 0) {
        println("The account is negative")
    } else {
        println("The account is positive")
    }

    when {
        balanceAvailable == 0.0 -> println("The account is neutral")
        balanceAvailable < 0 -> println("The account is negative")
        else -> println("The account is positive")
    }
}