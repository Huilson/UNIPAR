package br.com.unipar.exemplo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExemploApplication

fun main(args: Array<String>) {
	runApplication<ExemploApplication>(*args)
}
