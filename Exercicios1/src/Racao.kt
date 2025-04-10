open class Racao(
    var preco: Double,
    var peso: Double,
    var sabor: String
) {
    open fun desconto() {
        preco *= 0.90
    }
}

class RacaoDeGato(
    private val paraCastrado: Boolean,
    private val ricaEmFerro: Boolean,
    //Quando usamos properties (no construtor) devemos declarar os atributos
    preco: Double,
    peso: Double,
    sabor: String
) : Racao(preco, peso, sabor) {
    override fun desconto() {
        preco = if (paraCastrado)
            preco * 0.85
        else
            preco * 0.80
    }
}

class RacaoDeCachorro(
    private val fortalePelos: Boolean,
    private val pedacosComCarne: Boolean,
    //Quando usamos properties (no construtor) devemos declarar os atributos
    preco: Double,
    peso: Double,
    sabor: String
) : Racao(preco, peso, sabor) {
    override fun desconto() {
        preco = if(pedacosComCarne)
            preco * 0.95
        else
            preco * 0.75
    }
}