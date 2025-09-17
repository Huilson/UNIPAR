package prototype

data class Quadrado (
    private val lados : Int
) : Forma {
    override fun clonar(): Forma = copy()
}