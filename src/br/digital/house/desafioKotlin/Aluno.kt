package br.digital.house.desafioKotlin

// Data class contendo as informações:
// nome: String
// sobrenome: String
// codigoDeAluno: Int

data class Aluno(
        var nome: String,
        var sobrenome: String,
        val codigoDeAluno: Int
){
    // Um aluno será igual a outro se seus codigoDealuno forem iguais
    override fun equals(other: Any?): Boolean = ((other is Aluno) && codigoDeAluno == other.codigoDeAluno) || codigoDeAluno == other

    // Reconstruição do ToString
    override fun toString(): String = "\nAluno: $nome $sobrenome -- CodigoDeAluno: $codigoDeAluno"
}