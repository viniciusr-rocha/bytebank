import br.com.vinicius.bytebank.exceptions.InsufficientAmountException

fun main() {
    funcao1()
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: InsufficientAmountException) {
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val address = Any()
        throw InsufficientAmountException()
    }
    println("fim funcao2")
}