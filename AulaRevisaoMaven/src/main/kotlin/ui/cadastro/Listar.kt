package org.example.ui.cadastro

import org.example.entidadeGerenciadora.EntidadeJDBC

fun listarCaixas(){
    val banco = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/revisao",
        user = "postgres",
        password = "5432"//no caso de vocês provavelmente será postgres
    )
    banco.listarCaixa()
}