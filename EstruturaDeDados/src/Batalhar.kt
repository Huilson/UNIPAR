/**
 * A função batalhar espera um mapa de mapas
 * O primeiro tem uma chave do tipo Inteiro
 * E o valor dessa chave é outro Mapa
 * Esse outro Mapa tem uma chave String
 * e o valor da chave String é uma lista de Strings
 * o sinal de ? significa que esse mapa pode vir NULO
 * */
fun batalhar(time_1: Map<Int, Map<String, List<String>>?>, time_2: Map<Int, Map<String, List<String>>?>) {

    //Como são 3 pokemons, serão repetidas 3 vezes as batalhas
    //Esse valor 1..3 em Kotlin significa um intervalo, ou seja, de 1 até 3
    for (i in 1..3) {
        //println(time_1[i]?.keys)
        //println(time_1[i]?.values)
        /**
         * As variáveis abaixo são do tipo Lista de Strings,
         * elas recebem a posição da chave i, i pode ser 1, 2 ou 3
         * O .keys significa que eu quero pegar o valor dessa chave
         * O símbolo !! significa que vou garantir que essa chave não seja NULA
         * Depois converto o valor da chave para uma lista mutável
         * */
        val tipo_1: List<String> = time_1[i]?.keys!!.toMutableList()
        val tipo_2: List<String> = time_2[i]?.keys!!.toMutableList()
        println("Tipagem time 1: ${tipo_1}")
        println("Tipagem time 2: ${tipo_2}")

        /**
         * Usando da mesma lógica pego o valor do mapa, ou seja, o valor do valor
         * e converto para uma lista.
         * O nosso values, nesse caso, vai retornar uma coleção de dados, mas
         * queremos uma lista, para isso usamos o .flatten para transformar
         * a coleção em uma lista de String, a própria função flatten
         * elemina os elementos repetidos.
         *
         * ?: Elvis Operator se o valor do lado esquerdo for nula eu mando para
         * a variável o valor do lado direito
         * */
        val vantagem_1: List<String> = time_1[i]?.values?.flatten() ?: emptyList()
        val vantagem_2: List<String> = time_2[i]?.values?.flatten() ?: emptyList()
        println("Vantagem time 1: ${vantagem_1}")
        println("Vantagem time 1: ${vantagem_2}")
        var pontosP1 = 0
        var pontosP2 = 0

        val tamanho1 = tipo_1.size//Variáveis para pegar o tamanho de cada lista
        val tamanho2 = tipo_2.size//Mesma coisa

        //Compara para ver se o tipo do Pokemon do Jogador 1 tem vatagem sobre o tipo do
        //Pokemon do Jogador 2, e se o Pokemon do Jogador 2 só tem um único tipo
        if (vantagem_1.contains(tipo_2[0]) && tamanho2 == 1) {
            pontosP1++
            //Se o Pokemon do Jogador 2 tiver mais que 1 tipo faz esse bloco
            //Para vencer, o Pokemon do Jogador 1 precisa ganhar nas comparações
            //Se desejar mudar para somente 1 comparação use o operador OU -> ||
        } else if (vantagem_1.contains(tipo_2[0]) || vantagem_1.contains(tipo_2[1])) {
            pontosP1++
        }

        //Segue a mesma lógica
        if (vantagem_2.contains(tipo_1[0]) && tamanho1 == 1) {
            pontosP2++
        } else if (vantagem_2.contains(tipo_1[0]) && vantagem_2.contains(tipo_1[1])) {
            pontosP2++
        }

        /**
         * O pokemon que fez mais pontos ganha
         * */
        when {
            pontosP1 > pontosP2 -> println("Pokemon do time 1 venceu\n\n")//Se o pokemon do Jogador 1 tem mais pontos, ele ganha
            pontosP1 < pontosP2 -> println("Pokemon do time 2 venceu\n\n")//Se o pokemon do Jogador 1 tem menos pontos, ele perde
            else -> println("Empatou!\n\n")//Senão dá empate
        }
    }
}
