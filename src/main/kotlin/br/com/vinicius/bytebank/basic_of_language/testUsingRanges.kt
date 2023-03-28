package br.com.vinicius.bytebank.basic_of_language

fun testUsingRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()

    val numerosPares = 2.until(100) step 2
    for (s in numerosPares) {
        print("$s ")
    }

    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Esta dentro do intervalo")
    } else {
        println("Nao esta dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}