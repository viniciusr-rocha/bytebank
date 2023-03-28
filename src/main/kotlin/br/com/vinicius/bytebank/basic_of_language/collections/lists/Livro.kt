package br.com.vinicius.bytebank.basic_of_language.collections.lists

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null,
) {
}