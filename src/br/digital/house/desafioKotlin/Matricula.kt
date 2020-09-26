package br.digital.house.desafioKotlin

import java.util.*

// Data class contendo as informações:
// aluno: Aluno
// curso: Curso

data class Matricula(
        var aluno: Aluno,
        var curso: Curso,
){
    // Atributo contendo a data atual
    var data = Date()

    // Reconstruição do ToString
    override fun toString(): String = "${aluno} \n ${curso} \n Data: $data"
}