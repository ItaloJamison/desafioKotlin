package br.digital.house.desafioKotlin

// class contendo as informações:
// listaDeAlunos: MutableList<Aluno>
// listaDeProfessores: MutableList<Professor>
// listaDeCursos: MutableList<Curso>
// listaDeMatriculas: MutableList<Matricula>

class DigitalHouseManager(
        val listaDeAlunos: MutableList<Aluno>,
        val listaDeProfessores: MutableList<Professor>,
        val listaDeCursos: MutableList<Curso>,
        val listaDeMatriculas: MutableList<Matricula>
)