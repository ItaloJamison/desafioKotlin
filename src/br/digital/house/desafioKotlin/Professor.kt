package br.digital.house.desafioKotlin

// abstract class contendo as informações:
// nome: String
// sobrenome: String
// codigoDeProfessor: Int
// tempoDeCasa: Int

abstract class Professor(
        open var nome: String,
        open var sobrenome: String,
        open val codigoDeProfessor: Int,
        open var tempoDeCasa: Int
){
    // Um Professor será igual a outro se seus codigoDeProfessor forem iguais
    override fun equals(other: Any?): Boolean = ((other is Professor) && codigoDeProfessor == other.codigoDeProfessor) || other == codigoDeProfessor

    // Reconstruição do ToString
    override fun toString(): String = "\nProfessor: $nome $sobrenome -- codigoDeProfessor: $codigoDeProfessor -- TempoDeCasa: $tempoDeCasa"
}
