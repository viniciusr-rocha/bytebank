package br.com.vinicius.bytebank.basic_of_language.collections.lists

val listaDeLivros = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),

    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),

    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),

    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946,
    )
)

val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),

    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946,
    )
)