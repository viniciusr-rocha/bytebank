package br.com.vinicius.bytebank.basic_of_language.collections

fun testAggregatorOperations() {
    val idades = intArrayOf(10, 12, 15, 31, 54, 18)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Media das idades: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any { it > 18 }
    println("Alguem e maior de idade: $existeMaior")

    val valoresMaiores = idades.filter { it >= 18 }
    println("Valores maiores que 18: $valoresMaiores")

    val busca = idades.find { it == 18 }
    println("Busca: $busca")
}