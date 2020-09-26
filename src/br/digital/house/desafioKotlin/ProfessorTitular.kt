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
        val especialidade: String
):Professor(
        nome,
        sobrenome,
        codigoDeProfessor,
        tempoDeCasa
){

    // Reconstruição do ToString
    override fun toString(): String = "${super.toString()} -- -- especialidade: $especialidade"

}