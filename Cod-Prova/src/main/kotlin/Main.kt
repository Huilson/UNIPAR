package org.example

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

fun main() {

    val animal = "Cachorro"
    val peso = 10.25
    val vacinado = true

    val exemplo = mapOf(
        vacinado to "Belinha",
        peso to "Belinha",
        animal to "Belinha"
    )

    println(exemplo)

    try {
        val conexao: Connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/aula", "postgres", "5432")
        println("A conexão foi um sucesso!")

        val salvarNota = "INSERT INTO nota_final (id, nota1, nota2, aluno, aprovado) VALUES (6, 10, 10, 'Juca da Silva', false)"
        conexao.createStatement().execute(salvarNota)

        val query: ResultSet = conexao.createStatement().executeQuery("SELECT * FROM nota_final")

        while (query.next()) {
            val id = query.getInt("id")
            val nota1 = query.getDouble("nota1")
            val nota2 = query.getDouble("nota2")
            val media = (nota1 + nota2) / 2
            var atualizarSituacao: String = ""
            if (media >= 6.0) {
                atualizarSituacao = "UPDATE nota_final SET aprovado = true WHERE id = $id"
            } else if (media == 0.0) {
                atualizarSituacao = "DELETE FROM nota_final WHERE id = $id"
            }
            conexao.createStatement().execute(atualizarSituacao)
        }
        query.close()
        conexao.close()
    } catch (e: Exception) {
        println("Não foi possível conectar, motivo: ")
        e.printStackTrace()
    }
}