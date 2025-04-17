package br.unipar.pokedex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokedexApplication

fun main(args: Array<String>) {
	runApplication<PokedexApplication>(*args)
}
