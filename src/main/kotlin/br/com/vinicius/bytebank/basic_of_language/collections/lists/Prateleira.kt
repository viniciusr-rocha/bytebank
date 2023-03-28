package br.com.vinicius.bytebank.basic_of_language.collections.lists

data class Prateleira(
    val genero: String,
    val livros: List<Livro>,
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoDePublicaca(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}