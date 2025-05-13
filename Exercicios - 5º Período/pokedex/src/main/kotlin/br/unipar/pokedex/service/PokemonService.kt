package br.unipar.pokedex.service

import br.unipar.pokedex.model.Pokemon
import br.unipar.pokedex.model.Tipo
import br.unipar.pokedex.repository.PokemonRepository
import org.springframework.stereotype.Service

@Service
class PokemonService(
    private val pokemonRepository: PokemonRepository//Injeção do Repository
) {

    fun buscarPorTipos(tipo: String): List<Pokemon> {
        return pokemonRepository.buscarPorTipos(tipo)
    }

    fun registrarPokemon(
        numeroPokedex: String,
        nome: String,
        tipo_1 : Tipo,
        tipo_2 : Tipo?,//pode ser nulo
        poder : Int,
        descricao : String?//pode ser nulo
    ) : Pokemon {
        return pokemonRepository.salvar(
            Pokemon(
                numeroPokedex = numeroPokedex,
                nome = nome,
                tipo_1 = tipo_1,
                tipo_2 = tipo_2,
                poder = poder,
                descricao = descricao
            )
        )
    }

    fun encontrarPokemon(numeroPokedex: String) : Pokemon?{
        return pokemonRepository.buscarId(numeroPokedex)
    }

    fun encontrarTodos() : List<Pokemon>{
        return pokemonRepository.buscarTodos()
    }

    fun excluirRegistro(numeroPokedex: String) : Boolean{
        return pokemonRepository.excluirId(numeroPokedex)
    }
}