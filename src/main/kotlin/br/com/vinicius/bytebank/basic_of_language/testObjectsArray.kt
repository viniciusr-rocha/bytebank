package br.com.vinicius.bytebank.basic_of_language

import java.math.BigDecimal
import java.math.RoundingMode

fun testObjectsArray() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println("Salarios: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println("Salarios com aumento: ${salariosComAumento.contentToString()}")
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}