//Versão Sofisticada
/*open class Racao(
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
}*/

//Versão simplificada
open class Racao(){
    var preco: Double = 0.0
    var peso: Double = 0.0
    var sabor: String = ""
    open fun desconto() {
        preco *= 0.90
    }
}

class RacaoGato(): Racao() {
    var castrado: Boolean = true
    var ricaFerro: Boolean = false
    override fun desconto() {
        preco = if (castrado)
            preco * 0.85
        else
            preco * 0.80
    }
}

class RacaoCachorro(): Racao() {
    var pedacosCarne: Boolean = true
    var fortalecePelos: Boolean = false
    override fun desconto() {
        preco = if(pedacosCarne)
            preco * 0.95
        else
            preco * 0.75
    }

}