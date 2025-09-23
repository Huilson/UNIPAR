package model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity //Essa anotação significa que essa classe será uma tabela no Banco de Dados
data class Pessoa ( //Por padrão deixar como data class
    @Id //Toda classe Entity precisa informar o id
    @GeneratedValue(strategy = GenerationType.AUTO)//Os ids precisam saber o tipo de geração de Primary Key
    val id : Long? = null,//Usamos o valor nulo para informar a JPA que novos objetos serão novas linhas no banco
    val nome : String,
    val idade : Int,
    val cpf : String
){
}