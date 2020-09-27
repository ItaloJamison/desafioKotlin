package br.digital.house.desafioKotlin

// class contendo as informações:
// listaDeAlunos: MutableList<Aluno>
// listaDeProfessores: MutableList<Professor>
// listaDeCursos: MutableList<Curso>
// listaDeMatriculas: MutableList<Matricula>

class DigitalHouseManager{

    val listaDeAlunos = mutableListOf<Aluno>()
    val listaDeProfessores = mutableListOf<Professor>()
    val listaDeCursos = mutableListOf<Curso>()
    val listaDeMatriculas = mutableListOf<Matricula>()

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
        var achouAluno = false
        var tinhaVaga = false
        listaDeAlunos.forEach{
            aluno-> if(aluno.equals(codigoAluno)){
                achouAluno = true
                listaDeCursos.forEach{
                    curso -> if(curso.equals(codigoCurso)){
                        if(curso.adicionarUmAluno(aluno)){
                                tinhaVaga = true
                                listaDeMatriculas.add(Matricula(aluno,curso))
                                println("Matricula Realizada com sucesso")
                        }
                        if(!tinhaVaga)
                            println("Matricula não realizada: Sem vaga")
                    }
                }
            }
        }
        if(!achouAluno)
            println("Matricula não realizada: Aluno não encontrado")
    }

    // Permite alocar professores a um curso.
    // O método recebe como parâmetros:
    // O código do curso, o código do professor titular e o código do professor adjunto
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        var achou = false
        listaDeCursos.forEach{
            curso-> if(curso.equals(codigoCurso)){
                listaDeProfessores.forEach{
                    professorTitular -> if(professorTitular.equals(codigoProfessorTitular) && professorTitular is ProfessorTitular){
                        listaDeProfessores.forEach{
                            professorAdjunto-> if(professorAdjunto.equals(codigoProfessorAdjunto) && professorAdjunto is ProfessorAdjunto) {
                                achou = true
                                curso.professorTitular = professorTitular
                                curso.professorAdjunto = professorAdjunto
                                println("Alocação realizada com sucesso")
                            }//else println("Alocação não realizada: Um dos professores não encontrados")
                        }
                    }
                }
            }
        }
        if(!achou)
            println("Alocação não realizada: Curso não encontrado")
    }

    override fun toString(): String = "\n$listaDeCursos \n$listaDeMatriculas"
}