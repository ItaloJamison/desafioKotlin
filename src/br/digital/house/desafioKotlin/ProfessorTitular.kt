package br.digital.house.desafioKotlin

// class contendo as informações:
// nome: String
// sobrenome: String
// codigoDeProfessor: Int
// tempoDeCasa: Int
// especialidade: String

class ProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoDeProfessor: Int,
        tempoDeCasa: Int,
        private var especialidade: String
):Professor(
        nome,
        sobrenome,
        codigoDeProfessor,
        tempoDeCasa
){
    init {
        println(toString())
    }

    // Reconstruição do ToString
    override fun toString(): String = "${super.toString()} -- especialidade: $especialidade"

}