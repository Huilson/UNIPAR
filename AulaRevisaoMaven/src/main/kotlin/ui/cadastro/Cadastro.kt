package ui.cadastro

import entidades.Pessoa
import enumeradores.Sexo

fun cadastrarPessoa(){
    println("Nome: ")
    val nome = readln()

    println("Idade: ")
    val idade = readln().toInt()

    println("cpf: ")
    val cpf = readln()

    println("Escolha seu sexo: ")
    println("1 - Masculino")
    println("2 - Feminino")
    val sexo = readln().toInt()
    var opcao = Sexo.MASCULINO
    
    when(sexo){
        2 -> opcao = Sexo.FEMENINO
    }
    Pessoa(
        nome = nome,
        idade = idade,
        cpf = cpf,
        sexo = opcao
    )
}