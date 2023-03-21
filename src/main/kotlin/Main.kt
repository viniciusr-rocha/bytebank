fun main() {
    println("Welcome to Bytebank")
    val accountMaria = Account("Maria", 1000)
    accountMaria.deposit(200.0)
    println(accountMaria.owner)
    println(accountMaria.number)
    println(accountMaria.balanceAvailable)

    println()

    val accountJoao = Account("Joao", 10001)
    accountJoao.deposit(300.0)
    println(accountJoao.owner)
    println(accountJoao.number)
    println(accountJoao.balanceAvailable)

    println("Depositando na conta Java")
    accountJoao.deposit(50.0)
    println(accountJoao.balanceAvailable)

    if (accountMaria.balanceTransfer(200.0, accountJoao)) {
        println("Transferencia realizada com sucesso")
    }


    accountJoao.withdraw(350.0)
    println(accountJoao.balanceAvailable)
}

class Account(
    var owner: String,
    var number: Int
) {
    var balanceAvailable = 0.0
        private set

    constructor(owner: String, number: Int, balanceAvailable: Double) : this(owner, number) {

    }

    init {
        println("Criando Account")
    }

    fun deposit(amount: Double) {
        this.balanceAvailable += amount
    }

    fun withdraw(amount: Double) {
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

private fun testCopyAndReference() {
    val number = 10.0
    var numberCopy = number
    numberCopy += 5
    println(number)
    println(numberCopy)

    val maria = Account("Maria", 1000)
    maria.owner = "Maria"
    val joao = maria
    maria.owner = "joao"
    println(maria.owner)
    println(joao.owner)
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