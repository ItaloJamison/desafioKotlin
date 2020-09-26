package br.digital.house.desafioKotlin

fun main(){
    val professorTitular = ProfessorTitular("teste","Roa",2 ,23,"Testar")
    val professorAdjunto = ProfessorAdjunto("teste","Roa",2 ,23,23)
    val aluno = Aluno("Terte","ASameul",2)
    val curso = Curso("Teste",2,professorTitular,professorAdjunto,1, mutableListOf())
    println("__________________________________________")
    println(curso.adicionarUmAluno(aluno))
    println("__________________________________________")
    println(curso)
    println("__________________________________________")
    println(curso.excluirAluno(aluno))
    println("__________________________________________")
    val matricula = Matricula(aluno,curso)
    print(matricula)


}