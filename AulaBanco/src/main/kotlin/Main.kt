import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

fun main() {
    val url = "jdbc:postgresql://localhost:5432/pessoa"
    val user = "postgres"
    val password = "5432"

    try {
        val connection: Connection = DriverManager.getConnection(url, user, password)
        println("Conectado com sucesso!")

        val statement = connection.createStatement()
        val resultSet: ResultSet = statement.executeQuery("SELECT * FROM cpf")
        //val result = statement.execute(
            "INSERT INTO cpf (numero, dia, mes, ano)\n" +
                    "VALUES ('999.999.999-99', 1, 1, 1999);"
        //)
        //println(result)
        /*if(!result){
            println("Adicionada com sucesso!")
        } else {
            println("Erro no SQL")
        }*/

        while (resultSet.next()) {
            val coluna = resultSet.getString("numero")
            println(coluna)
        }

        //resultSet.close()
        statement.close()
        connection.close()

    } catch (e: Exception) {
        e.printStackTrace()
    }
}
