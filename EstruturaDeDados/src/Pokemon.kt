fun main(){
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

    var i = 1
    pokemons.forEach { t, u ->
        println("${i++} - $t")
    }

    println("Jogador 1 - Escolha seu time: ")
    val time1_1 = readln().lowercase()
    val time1_2 = readln().lowercase()
    val time1_3 = readln().lowercase()

    //Map de Maps
    val time_1 = mapOf(
        1 to pokemons[time1_1],
        2 to pokemons[time1_2],
        3 to pokemons[time1_3]
    )

    println("Jogador 2 - Escolha seu time: ")
    val time2_1 = readln().lowercase()
    val time2_2 = readln().lowercase()
    val time2_3 = readln().lowercase()

    val time_2 = mapOf(
        1 to pokemons[time2_1],
        2 to pokemons[time2_2],
        3 to pokemons[time2_3]
    )

    batalhar(time_1, time_2)
    /*println("1º Pokemon do time 1")
    println(time_1[1])//Tipo do Pokemon
    //println(time_1[1])//De quem ele ganha

    println("1º Pokemon do time 2")
    println(time_2[1])//Tipo do Pokemon
    //println(time_2[1])//De quem ele ganha*/

    //Para a comparação na hora da batalha, faça um FOR
/*
    println("\n\n ${bulbasaur["GRAMA"]}")
    println(bulbasaur["VENENO"])

    if(charmander.containsKey("GRAMA")){
        println("Ele é do tipo GRAMA!")
    }else{
        println("Ele não é do tipo GRAMA")
    }

    if("FOGO" in charmander){
        println("Sim ele é FOGO")
    }

    if(charmander["FOGO"]?.contains("GRAMA")!!){
        println("Ele é forte contra GRAMA")
    }else{
        println("Ele não é forte contra GRAMA")
    }

    for((chave, valor) in  mew){
        println("A chave é $chave -> o valor é $valor")
    }


    //EXEMPLOS
    val carro = mapOf(
        "PNEU" to 32,
        "VOLANTE" to true,
        "MOTOR" to 2.4,
        "PLACA" to "AS124A"
        )
    for((caracteristica, descricao) in carro){
        println("Caracteristca -> $caracteristica; Descricao -> $descricao")
    }*/

}