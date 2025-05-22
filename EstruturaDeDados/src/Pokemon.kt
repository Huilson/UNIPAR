fun main(){
    /*MAPAS de MAPAS onde cada chave é uma String
    *e cada valor é um MAPA do pokemon específico
    */
    val pokemons = mapOf(
        "bulbasaur" to bulbasaur,
        "charmander" to charmander,
        "squirtle" to squirtle,
        "caterpie" to caterpie,
        "weedle" to weedle,
        "abra" to abra,
        "ekans" to ekans,
        "eevee" to eevee,
        "seel" to seel,
        "oddish" to oddish,
        "bellsprout" to bellsprout,
        "zubat" to zubat,
        "vulpix" to vulpix,
        "gastly" to gastly,
        "spearow" to spearow,
        "pidgey" to pidgey,
        "ponyta" to ponyta,
        "tangela" to tangela,
        "dratini" to dratini,
        "rattata" to rattata
    )

    var i = 1 //Variável de índice
    pokemons.forEach { chave, valor ->
        println("${i++} - $chave")
    }

    println("Jogador 1 - Escolha seu time: ")
    val time1_1 = readln().lowercase()//Aqui precisa escrever a chave do mapa de mapas
    val time1_2 = readln().lowercase()//Aqui precisa escrever a chave do mapa de mapas
    val time1_3 = readln().lowercase()//Aqui precisa escrever a chave do mapa de mapas

    //Map de Maps
    val time_1 = mapOf(
        1 to pokemons[time1_1],//Chave númerica onde busca o nome do pokemon dentro do Mapa de Mapas
        2 to pokemons[time1_2],//A posição do pokemon que eu quero é a própria chave
        3 to pokemons[time1_3]
    )

    /**
     * EXEMPLO: VETOR -> vetor[1] = valor da posição 1
     *          MAPA -> mapa[chave] = valor da posição da chave
     * Resumindo, a minha pode ser qualquer valor, ou qualquer tipo de dado
     * CHAVES são identificadores únicos, e não podem repetir.
     * Analogia: imagine um conjunto de baús, onde cada baú tem um nome
     * e uma chave, a chave de cada baú só funciona no mesmo nome.
     * Exemplo: O báu 1 só abre com a chave 1,
     * O baú "abelha" só abre com a chave "abelha".
     * */


    println("Jogador 2 - Escolha seu time: ")
    val time2_1 = readln().lowercase()
    val time2_2 = readln().lowercase()
    val time2_3 = readln().lowercase()

    val time_2 = mapOf(
        1 to pokemons[time2_1],//Segue a mesma lógica
        2 to pokemons[time2_2],
        3 to pokemons[time2_3]
    )

    batalhar(time_1, time_2)//Chama a função BATALHA, que está em outro arquivo
}