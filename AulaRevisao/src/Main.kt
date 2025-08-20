import entidades.Profissional
import entidades.Servico
import enumeradores.Funcao
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

fun main() {
    //Classes aninhadas é quando temos uma classe dentro da outra.
    val instalacao : Servico = Servico(
        condicao = "boa",
        preco = "200.00".toBigDecimal(),
        profissional = Profissional(
            nome = "Pedro",
            cpf = "464684654",
            sexo = Sexo.MASCULINO,
            salario = BigDecimal("3000.99"),
            idade = 20,
            experiencia = 2,
            habilidade = "Forte, Corajoso, Rápido",
            funcao = Funcao.OPERADOR,
            setor = Setor.MONTAGEM
        )
    )
}