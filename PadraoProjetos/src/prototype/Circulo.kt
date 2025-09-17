package prototype

data class Circulo (
    private val raio : Double //Não podemos usar esse atributo
    //pois o objetivo é economizar espaço na memória
) : Forma {
 override fun clonar() : Forma = copy()
    //Com isso podemos usar o espaço de memória da FORMA
}