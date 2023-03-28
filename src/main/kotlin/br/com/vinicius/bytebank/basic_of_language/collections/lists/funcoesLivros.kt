package br.com.vinicius.bytebank.basic_of_language.collections.lists

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "- ${it.titulo} de ${it.autor}"
        }
    println()
    println(" #### Lista de Livros #### \n$textoFormatado")
}