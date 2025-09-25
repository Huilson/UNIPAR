package br.com.unipar.exemplo.controller

import br.com.unipar.exemplo.database.PessoaRepository
import br.com.unipar.exemplo.model.Pessoa
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

//A anotação RestController não pode usar VIEW, basicamente é para construir APIs
//A anotação Controller permite ter VIEW, para construir Web Applications
@Controller
@RequestMapping("/pessoa")
class PessoaController(
    private val pessoaRepository : PessoaRepository
    /**Uma injeção de dependência é necessária quando
     * usamos uma classe externa, essa injeção (variável)
     * deve ser privada, por uma questão de segurança.
    */
) {
    @PostMapping
    fun cadastrarPessoa(@RequestBody pessoa: Pessoa)
    : ResponseEntity<Pessoa> {
        println("salvo")
        return ResponseEntity.ok(
            pessoaRepository.save<Pessoa>(pessoa))
    }

    @GetMapping
    fun listarPessoas() : List<Pessoa>{
        return pessoaRepository.findAll()
    }
}