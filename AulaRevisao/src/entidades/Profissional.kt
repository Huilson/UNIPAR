package entidades

import enumeradores.Setor
import enumeradores.Funcao
import enumeradores.Sexo
import java.math.BigDecimal
class Profissional (
    cpf: String,
    nome : String,
    idade : Int,
    sexo : Sexo,
    val funcao : Funcao,
    val salario : BigDecimal,
    val experiencia : Int,
    val habilidade : String,
    val setor : Setor
) : Pessoa(
    cpf = cpf,
    idade = idade,
    nome = nome,
    sexo = sexo
){
    //Comportamentos do Profissional
    fun instalarCaixaDAgua(clt : Profissional){
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("Profissional habilitado")
        } else {
            println("Profissional desqualifcado")
        }
    }
}