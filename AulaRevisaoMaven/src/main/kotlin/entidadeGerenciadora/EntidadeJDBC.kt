package org.example.entidadeGerenciadora

import entidades.CaixaDAgua
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

class EntidadeJDBC(
    val url: String,
    val user: String,
    val password: String
) {
    fun conectar(): Connection? {
        try {
            val coneccao: Connection =
                DriverManager.getConnection(this.url, this.user, this.password)

            println("Conectou!")
            return coneccao
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }

    fun criarTabela() {
        val conecao = conectar()
        val statement = conecao!!.createStatement()

        val jpql = statement.execute(
            "CREATE TABLE IF NOT EXISTS" +
                    " CaixaDaAgua (" +
                    " id serial NOT NULL PRIMARY KEY," +
                    " material varchar(255)," +
                    " capacidade double precision, " +
                    " altura double precision," +
                    " largura double precision," +
                    " profundidade double precision, "+
                    " blabla varchar(255))"
        )
        println("Resposta do banco: $jpql")

        statement.close()
        conecao.close()
    }

    fun cadastrarCaixa(c: CaixaDAgua) {
        val conecao = conectar()
        val jpql = "INSERT INTO CaixaDaAgua" +
                " (material, capacidade, altura, largura, profundidade, blabla)" +
                " VALUES (?, ?, ?, ?, ?, ?)"
        val statement = conecao!!.prepareStatement(jpql)
        //ENUM pode salvar como String
        statement.setString(1, c.material.name)
        statement.setDouble(2, c.capacidade!!)
        statement.setDouble(3, c.altura)
        statement.setDouble(4, c.largura)
        statement.setDouble(5, c.profundidade)
        statement.setString(6, c.blabla)
        statement.executeUpdate()

        statement.close()
        conecao.close()
    }

    fun listarCaixa(){
        val conecao = conectar()
        val jpql = "SELECT * FROM CaixaDaAgua"

        val resultados : ResultSet = conecao!!.createStatement().executeQuery(jpql)
        while (resultados.next()) {
            println("Material: ${resultados.getString("material")}")
            println("Capacidade: ${resultados.getString("capacidade")}")
            println("Altura: ${resultados.getString("altura")}")
            println("Largura: ${resultados.getString("largura")}")
            println("Profundidade: ${resultados.getString("profundidade")}")
            println("Comentário: ${resultados.getString("blabla")}")
        }

        conecao.close()
    }

    fun editarCaixa(c: CaixaDAgua) {
        val conecao = conectar()
        val jpql = "UPDATE CaixaDaAgua" +
                " SET (material = ?, capacidade = ?, altura = ?, " +
                "largura = ?, profundidade = ?, blabla = ?)" +
                " WHERE id = ?"
        val statement = conecao!!.prepareStatement(jpql)
        //ENUM pode salvar como String
        statement.setString(1, c.material.name)
        statement.setDouble(2, c.capacidade!!)
        statement.setDouble(3, c.altura)
        statement.setDouble(4, c.largura)
        statement.setDouble(5, c.profundidade)
        statement.setString(6, c.blabla)
        statement.setLong(7, c.id)
        statement.executeUpdate()

        statement.close()
        conecao.close()
    }

    fun excluirCaixa(id : Long){
        val conecao = conectar()
        val jpql = "DELETE FROM CaixaDaAgua WHERE id = ?"
        val statement = conecao!!.prepareStatement(jpql)
        statement.setLong(1, id)
        statement.executeUpdate()

        statement.close()
        conecao.close()
    }
}