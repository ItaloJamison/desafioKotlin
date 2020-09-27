package br.digital.house.desafioKotlin

fun main(){
    //Classe principal
    val digitalHouseManager = DigitalHouseManager()

    //Professores Titulares
    println("--------------------------------------------------")
    digitalHouseManager.registrarProfessorTitular("José","Roberto",2,"Algebra")
    digitalHouseManager.registrarProfessorTitular("Marina","Silva",5,"Geografia")

    //Professores Professor Adjunto
    println("--------------------------------------------------")
    digitalHouseManager.registrarProfessorAdjunto("Tereza","Nascimento",8,2)
    digitalHouseManager.registrarProfessorAdjunto("Carlos","Nobrega",5,8)

    //Registrando cursos
    println("--------------------------------------------------")
    println(digitalHouseManager.registrarCurso("Full Stack",20001,3))
    println(digitalHouseManager.registrarCurso("Android",20002,2))

    //matriculando Alunos
    println("--------------------------------------------------")
    println(digitalHouseManager.matricularAluno("Eliel","Carvalho",1))
    println(digitalHouseManager.matricularAluno("Karina","Arruda",2))
    println(digitalHouseManager.matricularAluno("Raquel","Cristina",3))
    println(digitalHouseManager.matricularAluno("Eduardo","Pereira",4))
    println(digitalHouseManager.matricularAluno("Victor","Henrique",5))

    //Alocando professores
    println("--------------------------------------------------")
    digitalHouseManager.alocarProfessores(20001,2,8)
    digitalHouseManager.alocarProfessores(20002,5,5)

    //Matriculando dois alunos no curso de Full Stack
    println("--------------------------------------------------")
    digitalHouseManager.matricularAluno(1,20001)
    digitalHouseManager.matricularAluno(3,20001)

    //Matriculando Três alunos no curso de Android
    println("--------------------------------------------------")
    digitalHouseManager.matricularAluno(2,20002)
    digitalHouseManager.matricularAluno(4,20002)
    digitalHouseManager.matricularAluno(5,20002)

    println(digitalHouseManager)


}