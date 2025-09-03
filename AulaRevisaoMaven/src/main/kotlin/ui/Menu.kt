package ui

import org.example.ui.cadastro.editarrCaixaDAgua
import org.example.ui.cadastro.excluirCaixa
import ui.cadastro.cadastrarCaixaDAgua
import ui.cadastro.cadastrarPessoa

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
        println("10- Excluir Caixa d'Água")
        val escolha: Int = readln().toInt()
        when (escolha) {
            0 -> println("Encerrando...")
            1 -> cadastrarPessoa()
            2 -> cadastrarCaixaDAgua()
            3 -> println("Abrindo cadastro de serviços")
            4 -> println("Abrindo lista de pessoa")
            5 -> println("Abrindo lista de caixas")
            6 -> println("Abrindo lista de serviços")
            7 -> println("Abrindo edição de pessoa")
            8 -> editarrCaixaDAgua()
            9 -> println("Abrindo edição de serviços")
            10 -> excluirCaixa()
        }
    }while (escolha != 0)
}
