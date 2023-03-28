package br.com.vinicius.bytebank.basic_of_language.collections

import java.math.BigDecimal
import java.math.RoundingMode

fun testObjectsArray() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println("Salarios: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println("Salarios com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto incial: $gastoInicial")
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}