package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946,
        )
    )
    livros.imprimeComMarcadores()

    livros.remove(livro1)
    livros.imprimeComMarcadores()

    livros.sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos = listaDeLivros
        .filter { it.autor.startsWith("João") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)

}