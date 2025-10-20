package br.com.unipar.exemplo.database

import br.com.unipar.exemplo.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PessoaRepository : JpaRepository<Pessoa, Long> {
    //Aqui vai a herança da JPA com o nome da Entidade, e o tipo da PK
}