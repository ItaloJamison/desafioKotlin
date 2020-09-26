package br.digital.house.desafioKotlin

class ProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoDeProfessor: Int,
        tempoDeCasa: Int
):Professor(
        nome,
        sobrenome,
        codigoDeProfessor,
        tempoDeCasa
){

    // Reconstruição do ToString
    override fun toString(): String = "${super.toString()} -- Tempo de Casa: $tempoDeCasa"

}