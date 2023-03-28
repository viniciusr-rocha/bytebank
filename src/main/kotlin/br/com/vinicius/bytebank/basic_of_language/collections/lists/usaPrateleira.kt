package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAutor = prateleira.organizarPorAutor()
    val porPublicacao = prateleira.organizarPorAnoDePublicaca()
    porAutor.imprimeComMarcadores()
    porPublicacao.imprimeComMarcadores()
}