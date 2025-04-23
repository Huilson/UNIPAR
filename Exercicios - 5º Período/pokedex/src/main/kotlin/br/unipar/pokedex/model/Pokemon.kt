package br.unipar.pokedex.model

import jakarta.persistence.Entity
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PositiveOrZero

@Entity
data class Pokemon (
    @Id
    var numeroPokedex: String? = null,//ID do documento

    @NotBlank
    var nome: String,

    @NotBlank
    var tipo_1: Tipo,

    var tipo_2: Tipo?, //Ou ele ter um segundo ou vai ser nulo

    @PositiveOrZero
    var poder: Int,

    var descricao: String? = null
)