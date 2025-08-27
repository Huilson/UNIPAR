package org.example

import org.example.entidadeGerenciadora.EntidadeJDBC
import ui.menu

fun main() {                               // A URL é divida em Driver, IP, porta, e nome do BD
    val em : EntidadeJDBC = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/revisao",
        user = "postgres",
        password = "5432")
    em.conectar()
    menu()
}