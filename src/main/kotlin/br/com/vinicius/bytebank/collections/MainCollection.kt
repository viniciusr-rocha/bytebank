package br.com.vinicius.bytebank.collections

fun main() {
    val ages = IntArray(4)
    ages[0] = 25
    ages[1] = 19
    ages[2] = 33
    ages[3] = 26

    ages.forEach {
        println(it)
    }
}