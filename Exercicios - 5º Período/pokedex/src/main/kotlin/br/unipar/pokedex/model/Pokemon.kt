package br.unipar.pokedex.model

data class Pokemon (
    val numeroPokedex: String? = null,//ID do documento

    val nome: String = "",

    val tipo_1: Tipo = Tipo.NORMAL,

    val tipo_2: Tipo? = null, //Ou ele tem um segundo TIPO ou vai ser nulo

    val poder: Int = 0,

    val descricao: String? = null
)