package br.digital.house.desafioKotlin

// Data class contendo as informações: nome: String e codigoDeCurso: Int
data class Curso(
        var nome: String,
        val codigoDeCurso: Int
){
    // Um curso será igual a outro se seus codigoDealuno forem iguais
    override fun equals(other: Any?): Boolean = (other is Curso) && codigoDeCurso == other.codigoDeCurso

    // Reconstruição do ToString
    override fun toString(): String = "Curso: $nome -- codigoDeCurso: $codigoDeAluno"
}