package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun main() {
    val assistiramCursoAndoid = setOf("Alex", "Fran", "Maria", "Gui")
    val assistiramCursoKotlin = setOf("Alex", "Bia", "Maria", "Jao")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoKotlin
    println(assistiramAmbos)
}