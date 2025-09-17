package org.example

import org.example.entidadeGerenciadora.EntidadeJDBC
import ui.menu

object Banco {
    fun conect() = EntidadeJDBC(url = "", user = "", password = "")
}
fun main() {
    Banco.conect().conectar()//Executa uma vez
    Banco.conect().criarTabela()//Quando terminar a execução de cima, sobreescreve
    menu()
}