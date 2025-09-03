package entidades

import enumeradores.Material

class CaixaDAgua (
    val id : Long = 0L,
    val material: Material,
    val capacidade: Double?,
    val altura: Double,
    val largura: Double,
    val profundidade: Double,
    val blabla: String,
)