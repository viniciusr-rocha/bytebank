package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}