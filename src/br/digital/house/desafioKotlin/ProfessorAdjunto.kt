package br.digital.house.desafioKotlin

// class contendo as informações:
// nome: String
// sobrenome: String
// codigoDeProfessor: Int
// tempoDeCasa: Int
// quantHorasMonitoria: Int
// O tempo de casa inicial do professor será zero
class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoDeProfessor: Int,
        tempoDeCasa: Int,
        private var quantHorasMonitoria: Int
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
    override fun toString(): String = "${super.toString()} -- Quantidade de Horas da Monitoria: $quantHorasMonitoria"

}