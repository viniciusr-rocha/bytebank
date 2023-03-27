import br.com.vinicius.bytebank.model.customer.Address

fun main() {
    println("início main")
    10/0
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
    for (i in 1..5) {
        println(i)
        val address = Any()
        address as Address
    }
    println("fim funcao2")
}