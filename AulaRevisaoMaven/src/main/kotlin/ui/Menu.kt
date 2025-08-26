package org.example.ui

import org.example.ui.cadastro.cadastrarPessoa

fun menu() {
    do {
        println("0- Sair")
        println("1- Cadastrar Pessoa")
        println("2- Cadastrar Caixa d'Água")
        println("3- Cadastrar Serviço")
        println("4- Listar Pessoas")
        println("5- Listar Caixas d'Água")
        println("6- Listar Serviços")
        println("7- Editar Pessoa")
        println("8- Editar Caixa d'Água")
        println("9- Editar Serviço")
        val escolha: Int = readln().toInt()
        when (escolha) {
            0 -> println("Encerrando...")
            1 -> cadastrarPessoa()
            2 -> println("Abrindo cadastro de caixas")
            3 -> println("Abrindo cadastro de serviços")
            4 -> println("Abrindo lista de pessoa")
            5 -> println("Abrindo lista de caixas")
            6 -> println("Abrindo lista de serviços")
            7 -> println("Abrindo edição de pessoa")
            8 -> println("Abrindo edição de caixas")
            9 -> println("Abrindo edição de serviços")
        }
    }while (escolha != 0)
}
