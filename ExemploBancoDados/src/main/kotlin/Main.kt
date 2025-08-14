package org.example

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

fun main() {
    /**
     * Primeiro vai o nome do driver JDBC
     * Depois o nome do banco, nesse caso, POSTGRESQL
     * Depois o IP que o banco está localizado, nesse caso, na nossa máquina
     * Por último a porta que o banco está e o nome do banco. Exemplo 5432/meu-banco
     * */
    val url = "jdbc:postgresql://localhost:5432/aula"
    val user = "postgres" //POR PADRÃO A SENHA É: postgres
    val senha = "5432" //POR PADRÃO A SENHA É: postgres

    try {
        val conexao : Connection = DriverManager.getConnection(url, user, senha)
        println("A conexão foi um sucesso!")

        val salvar = "INSERT INTO pessoa (id, cpf, nome)" +
                "VALUES (2, '000.000.000-01', 'Raissa da Silva')"
        val atualizar = "UPDATE pessoa SET cpf = '000.000.000-10' WHERE id = 2"
        val excluir = "DELETE FROM pessoa WHERE cpf = '000.000.000-10'"

        val salvarBanco = conexao.createStatement().execute(excluir)

        //O ReultSet é um ARRAY de RESULTADOS
        val query : ResultSet = conexao.createStatement().executeQuery("SELECT * FROM pessoa")

        while(query.next()){
            val informacao = query.getString("cpf")
            println(informacao)
        }

        query.close() //Encerra a query
        conexao.close() //Encerra a conexão

    } catch (e: Exception){
        e.printStackTrace()
    }
}