package br.digital.house.desafioKotlin

// Data class contendo as informações:
// nome: String
// codigoDeCurso: Int
// professorTitular: ProfessorTitular
// professorAdjunto: ProfessorAdjunto
// quantMaximaDeAlunos: Int
// listaDeAlunos: MutableList<Aluno>

class Curso(
        var nome: String,
        val codigoDeCurso: Int,
        val professorTitular: ProfessorTitular,
        val professorAdjunto: ProfessorAdjunto,
        val quantMaximaDeAlunos: Int,
        val listaDeAlunos: MutableList<Aluno>
){
    // Um curso será igual a outro se seus codigoDealuno forem iguais
    override fun equals(other: Any?): Boolean = (other is Curso) && codigoDeCurso == other.codigoDeCurso

    // Reconstruição do ToString
    override fun toString(): String = "\nCurso: $nome -- codigoDeCurso: $codigoDeCurso \n-- Prof.Titular: $professorTitular\n-- Prof.Adjunto: $professorAdjunto\nlistaDeAlunos: $listaDeAlunos\n"

   // permite adicionar um aluno à lista
   // O método retornará true se o aluno puder ser adicionado ou false caso não haja vagas disponíveis.
    fun adicionarUmAluno(umAluno: Aluno): Boolean = if (quantMaximaDeAlunos>= listaDeAlunos.size) listaDeAlunos.add(umAluno) else false

    fun excluirAluno(umAluno: Aluno) =  listaDeAlunos.remove(umAluno)
}