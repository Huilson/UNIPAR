fun batalhar(time_1: Map<Int, Map<String, List<String>>?>, time_2: Map<Int, Map<String, List<String>>?>) {

    for (i in 1..3) {
        //println(time_1[i]?.keys)
        //println(time_1[i]?.values)
        val tipo_1: List<String> = time_1[i]?.keys!!.toMutableList()
        val tipo_2: List<String> = time_2[i]?.keys!!.toMutableList()
        println("Tipagem time 1: ${tipo_1}")
        println("Tipagem time 2: ${tipo_2}")

        val vantagem_1: List<String> = time_1[i]?.values?.flatten() ?: emptyList()
        val vantagem_2: List<String> = time_2[i]?.values?.flatten() ?: emptyList()
        println("Vantagem time 1: ${vantagem_1}")
        println("Vantagem time 1: ${vantagem_2}")
        var pontosP1 = 0
        var pontosP2 = 0

        val tamanho1 = tipo_1.size
        val tamanho2 = tipo_2.size

        if (vantagem_1.contains(tipo_2[0]) && tamanho2 == 1) {
            pontosP1++
        } else if (vantagem_1.contains(tipo_2[0]) && vantagem_1.contains(tipo_2[1])) {
            pontosP1++
        }

        if (vantagem_2.contains(tipo_1[0]) && tamanho1 == 1) {
            pontosP2++
        } else if (vantagem_2.contains(tipo_1[0]) && vantagem_2.contains(tipo_1[1])) {
            pontosP2++
        }

        when {
            pontosP1 > pontosP2 -> println("Pokemon do time 1 venceu\n\n")
            pontosP1 < pontosP2 -> println("Pokemon do time 2 venceu\n\n")
            else -> println("Empatou!\n\n")
        }
    }
}
