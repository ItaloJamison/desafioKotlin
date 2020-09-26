package br.digital.house.desafioKotlin

// Data class contendo as informações: nome: String,sobrenome: String e codigoDeAluno: Int
abstract class Professor(
        open var nome: String,
        open var sobrenome: String,
        open val codigoDeProfessor: Int,
        open val tempoDeCasa: Int
){
    // Um Professor será igual a outro se seus codigoDeProfessor forem iguais
    override fun equals(other: Any?): Boolean = (other is Aluno) && codigoDeProfessor == other.codigoDeAluno

    // Reconstruição do ToString
    override fun toString(): String = "Professor: $nome $sobrenome -- CodigoDeAluno: $codigoDeProfessor -- TempoDeCasa: $tempoDeCasa"
}
