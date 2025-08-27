package org.example.entidadeGerenciadora

import java.sql.Connection
import java.sql.DriverManager

class EntidadeJDBC (
    val url : String,
    val user : String,
    val password : String
) {
    fun conectar(){
        try {
            val coneccao : Connection =
                DriverManager.getConnection(this.url, this.user, this.password)

            println("Conectou!")
        }catch (e : Exception){
            e.printStackTrace()
        }
    }

}