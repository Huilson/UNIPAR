package org.example.ui.cadastro

import entidades.CaixaDAgua
import org.example.entidadeGerenciadora.EntidadeJDBC

fun excluirCaixa(){
    println("Qual caixa deseja excluir? Informe o ID:")
    val id = readln().toLong()
    val banco = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/revisao",
        user = "postgres",
        password = "5432"//no caso de vocês provavelmente será postgres
    )
    banco.excluirCaixa(id)
}