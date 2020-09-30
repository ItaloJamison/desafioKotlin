package br.digital.house.desafioKotlin

// class contendo as informações:
// listaDeAlunos: MutableList<Aluno>
// listaDeProfessores: MutableList<Professor>
// listaDeCursos: MutableList<Curso>
// listaDeMatriculas: MutableList<Matricula>

class DigitalHouseManager{

    private val listaDeAlunos = mutableListOf<Aluno>()
    private val listaDeProfessores = mutableListOf<Professor>()
    private val listaDeCursos = mutableListOf<Curso>()
    private val listaDeMatriculas = mutableListOf<Matricula>()

    // Permite registrar um curso.
    // O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    fun registrarCurso(nome: String, codigoCurso: Int, quantMaximaDeAlunos: Int) = listaDeCursos.add(Curso(nome,codigoCurso,quantMaximaDeAlunos))

    // Permite excluir um curso.
    fun excluirCurso(codigoCurso: Int) = listaDeCursos.removeIf{it.equals(codigoCurso)}

    // Permite registrar um professor adjunto.
    // O método recebe como parâmetros:
    // O nome do professor, o sobrenome, o código e a quantidade de horas disponíveis para monitoria.
    // O tempo de casa inicial do professor será zero
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantDeHoras: Int) = listaDeProfessores.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,0,quantDeHoras))

    // Permite registrar um professor Titular.
    // O método recebe como parâmetros:
    // O nome do professor, o sobrenome, o código e a especialidade.
    // O tempo de casa inicial do professor será zero
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) = listaDeProfessores.add(ProfessorTitular(nome,sobrenome,codigoProfessor,0,especialidade))

    // Permite registrar um aluno
    // O método recebe como parâmetros:
    // o nome, o sobrenome e o código do aluno.
    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int) = listaDeAlunos.add(Aluno(nome,sobrenome,codigoAluno))

    // Permite matricular um aluno em um curso.
    // O método recebe como parâmetros:
    // o código do aluno e o código do curso em que ele está se matriculando.
    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        try {
            val findAluno = listaDeAlunos.find{aluno -> aluno.equals(codigoAluno)}
            val findCurso = listaDeCursos.find{curso -> curso.equals(codigoCurso)}
            if(findCurso!!.adicionarUmAluno(findAluno!!)){
                listaDeMatriculas.add(Matricula(findAluno,findCurso))
                println("Matricula Realizada com sucesso")
            }
            else{
                println("Matricula Não Realizada:Sem vaga")
            }
        }catch(e: NullPointerException) {
            println("Matricula Não Realizada")
        }
    }

    // Permite alocar professores a um curso.
    // O método recebe como parâmetros:
    // O código do curso, o código do professor titular e o código do professor adjunto
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        try{
            val findCurso = listaDeCursos.find{curso -> curso.equals(codigoCurso)}
            val findProfessorTitular = listaDeProfessores.find{professorTitular ->  (professorTitular.equals(codigoProfessorTitular) && professorTitular is ProfessorTitular)}
            val findProfessorAdjunto = listaDeProfessores.find{professorAdjunto ->  (professorAdjunto.equals(codigoProfessorAdjunto) && professorAdjunto is ProfessorAdjunto)}
            findCurso!!.professorTitular = (findProfessorTitular as ProfessorTitular?)!!
            findCurso.professorAdjunto = (findProfessorAdjunto as ProfessorAdjunto?)!!
            println("Alocação realizada com sucesso")
        }catch(e: NullPointerException){
            println("Alocação não realizada")
        }
    }

    override fun toString(): String = "\n$listaDeCursos \n$listaDeMatriculas"
}