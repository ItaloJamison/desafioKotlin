package br.digital.house.desafioKotlin

// Data class contendo as informações: nome: String,sobrenome: String e codigoDeAluno: Int
data class Professor(
        var nome: String,
        var sobrenome: String,
        val codigoDeProfessor: Int,
        val tempoDeCasa: Int
){
    // Um Professor será igual a outro se seus codigoDeProfessor forem iguais
    override fun equals(other: Any?): Boolean = (other is Aluno) && codigoDeProfessor == other.codigoDeAluno

    // Reconstruição do ToString
    override fun toString(): String = "Professor: $nome $sobrenome -- CodigoDeAluno: $codigoDeProfessor -- TempoDeCasa: $tempoDeCasa"
}
