package basic_of_language

import account.CheckingAccount

private fun testCopyAndReference() {
    val number = 10.0
    var numberCopy = number
    numberCopy += 5
    println(number)
    println(numberCopy)

    val maria = CheckingAccount("Maria", 1000)
    maria.owner = "Maria"
    val joao = maria
    maria.owner = "joao"
    println(maria.owner)
    println(joao.owner)
}