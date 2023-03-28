package br.com.vinicius.bytebank.basic_of_language.collections.lists

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>,
) {
    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortedBy { it.autor }
        return livros
    }

    fun organizarPorAnoDePublicaca(): MutableList<Livro> {
        livros.sortedBy { it.anoPublicacao }
        return livros
    }
}