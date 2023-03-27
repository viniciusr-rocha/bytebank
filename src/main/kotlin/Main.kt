import br.com.vinicius.bytebank.model.customer.Address

fun main() {
    println("início main")

    val input = "5"
    val receiveAmount: Double? = try {
        input.toDouble()
    } catch (e: NumberFormatException) {
        println("Probelma na conversao")
        e.printStackTrace()
        null
    }

    val amountTax: Double? = if (receiveAmount != null) {
        receiveAmount + 0.1
    } else {
        null
    }

    println("Valor com taxa: $amountTax")

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    try {
        for (i in 1..5) {
            println(i)
            val address = Any()
            address as Address
        }
    } catch (e: ClassCastException) {
//        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao2")
}