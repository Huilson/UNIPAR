package br.unipar.pokedex.controller

import br.unipar.pokedex.model.Pokemon
import br.unipar.pokedex.service.PokedexService
import br.unipar.pokedex.service.PokemonService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/pokemon")
class PokedexController(
    private val pokemonService: PokemonService,
    private val pokedexService: PokedexService

) {

    @GetMapping("/tipo/{tipo}")
    fun getUsersByType(@PathVariable tipo: String): ResponseEntity<List<Pokemon>> {
        val pokemons = pokemonService.buscarPorTipos(tipo.uppercase())
        return ResponseEntity.ok(pokemons)
    }

    @PostMapping
    fun cadastrarPokemons(@RequestBody pokemon: Pokemon): ResponseEntity<Pokemon> {
        return ResponseEntity.ok(
            pokemonService.registrarPokemon(
                pokemon.numeroPokedex!!, pokemon.nome, pokemon.tipo_1,
                pokemon.tipo_2, pokemon.poder, pokemon.descricao
            )
        )
    }

    @GetMapping("/{numeroPokedex}")
    fun buscarPokemon(@PathVariable numeroPokedex: String): ResponseEntity<Pokemon> {
        val pokemon = pokemonService.encontrarPokemon(numeroPokedex)
        return if (pokemon != null) {
            ResponseEntity.ok(pokemon)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping
    fun buscarTodos(): ResponseEntity<List<Pokemon>> {
        val pokemons = pokemonService.encontrarTodos()
        return ResponseEntity.ok(pokemons)//Não precisa de if
        //porque ele retorna uma lista, se não houver nada a lista vem vazia
    }

    @DeleteMapping("/{numeroPokedex}")
    fun excluirPokemon(@PathVariable numeroPokedex: String): ResponseEntity<Void> {
        return if (pokemonService.excluirRegistro(numeroPokedex)) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }

    /**
     *Uso do Storage
     */
    @GetMapping("/pokedex")
    fun listarImagens(model: Model) : String{
        val images = pokedexService.mostrarArquivos("")//aqui vai a pasta que esta no bucket, se for raiz deixa vazio
        model.addAttribute("images", images)
        return "pokedex"
    }
}