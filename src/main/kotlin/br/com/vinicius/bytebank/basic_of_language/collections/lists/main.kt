package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun main() {
    val assistiramCursoAndoid = listOf("Alex", "Fran", "Maria", "Gui")
    val assistiramCursoKotlin = listOf("Alex", "Bia", "Maria", "Jao")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoKotlin
    println(assistiramAmbos.distinct())
}