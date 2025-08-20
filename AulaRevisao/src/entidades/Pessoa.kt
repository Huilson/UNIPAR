package entidades

import enumeradores.Sexo

open class Pessoa(
//Atributos repetidos do Entidade.Profissional e Entidade.Cliente vão aqui
    val nome : String,
    val idade : Int,
    val sexo : Sexo,//Podemos usar CTRL+SHIFT+R para substituir em massa
    val cpf : String
)