package br.digital.house.desafioKotlin

// class contendo as informações:
// nome: String
// sobrenome: String
// codigoDeProfessor: Int
// tempoDeCasa: Int
// quantHorasMonitoria: Int

class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoDeProfessor: Int,
        tempoDeCasa: Int,
        val quantHorasMonitoria: Int
):Professor(
        nome,
        sobrenome,
        codigoDeProfessor,
        tempoDeCasa
){

    // Reconstruição do ToString
    override fun toString(): String = "${super.toString()} -- Quantidade de Horas: Monitoria: $quantHorasMonitoria"

}