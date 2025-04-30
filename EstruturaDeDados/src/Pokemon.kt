fun main(){
    val bulbasaur = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),//a minha CHAVE é uma String
        "VENENO" to listOf("FADA", "PLANTA"),//o meu VALOR é uma lista de String
    )
    val ivysaur = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venosaur = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val charmander = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val charmeleon = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val charizard = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val squirtle = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val wartodle = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val blastoise = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val caterpie = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
    )
    val metapod = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        //CHAVE TO VALOR
    )
    val butterfree = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
        //CHAVE TO VALOR
    )
    val weedle = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
        //CHAVE TO VALOR
    )
    val kakuna = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val beedrill = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val pidgey = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val pidgeotto = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val pidgeot = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val rattata = mapOf(
        "NORMAL" to listOf("")
    )
    val raticate = mapOf(
        "NORMAL" to listOf("")
    )
    val spearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val fearow = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val ekans = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val arbok = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val pikachu = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val raichu = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val sandshrew = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val sandslash = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val nidoran_f = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidorana = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidoqueen = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val nidoran_m = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidorano = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val nidoking = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "FOGO")
    )
    val clefairy = mapOf(
        "FADA" to listOf("DRAGÃO", "LUTADOR", "SOMBRIO")
    )
    val clefable = mapOf(
        "FADA" to listOf("DRAGÃO", "LUTADOR", "SOMBRIO")
    )
    val vulpix = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val ninetales = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val jigglypuff = mapOf(
        "FADA" to listOf("DRAGÃO", "LUTADOR", "SOMBRIO")
    )
    val wigglytuff = mapOf(
        "FADA" to listOf("DRAGÃO", "LUTADOR", "SOMBRIO")
    )
    val zubat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val golbat = mapOf(
        "VENENO" to listOf("FADA", "PLANTA"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val oddish = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val gloom = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val vileplume = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val paras = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val parasect = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venonat = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venomoth = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val diglett = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val dugtrio = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val meowth = mapOf(
        "NORMAL" to listOf("")
    )
    val persian = mapOf(
        "NORMAL" to listOf("")
    )
    val psyduck = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val golduck = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val mankey = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val primeape = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val poliwag = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val poliwhril = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val poliwrath = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val abra = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val kadabra = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val alazakazam = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val machop = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val machoke = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val machamp = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val bellsprout = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val weepinbell = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val victreebel = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val tentacool = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val tentacruel = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val geodude = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val graveler = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val golem = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val ponyta = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val rapidash = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val slowpoke = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val slowbro = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val magnemite = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "METAL" to listOf("FADA", "PEDRA", "GELO")
    )
    val magneton = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "METAL" to listOf("FADA", "PEDRA", "GELO")
    )
    val farfetchd = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val doduo = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val dodrio = mapOf(
        "NORMAL" to listOf(""),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val seel = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val dewgong = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "GELO" to listOf("TERRA", "GRAMA", "DRAGÃO", "VOADOR")
    )
    val grimer = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val muk = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val shellder = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val cloyter = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "GELO" to listOf("TERRA", "GRAMA", "DRAGÃO", "VOADOR")
    )
    val gastly = mapOf(
        "FANTASMA" to listOf("PSÍQUICO", "FANTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val haunter = mapOf(
        "FANTASMA" to listOf("PSÍQUICO", "FANTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val gengar = mapOf(
        "FANTASMA" to listOf("PSÍQUICO", "FANTASMA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val onix = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val drowzee = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val hypno = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val krabby = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val kingler = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val voltorb = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val electrode = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val exeggcute = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val exeggutor = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val cubone = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val maroak = mapOf(
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val hitmonlee = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val hitmontop = mapOf(
        "LUTADOR" to listOf("NORMAL", "PEDRA", "METAL")
    )
    val licktung = mapOf(
        "NORMAL" to listOf("")
    )
    val koffing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val weezing = mapOf(
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val rhyhorn = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val rhydon = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "TERRA" to listOf("ELÉTRICO", "PEDRA", "VENENO", "METAL", "FOGO")
    )
    val chansey = mapOf(
        "NORMAL" to listOf("")
    )
    val tangela = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
    )
    val kangaskhan = mapOf(
        "NORMAL" to listOf("")
    )
    val horsea = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val seadra = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val goldeen = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val seaking = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val staryu = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA")
    )
    val starmie = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val mr_mine = mapOf(
        "FADA" to listOf("DRAGÃO", "LUTADOR", "SOMBRIO"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val scyther = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val jynx = mapOf(
        "GELO" to listOf("TERRA", "GRAMA", "DRAGÃO", "VOADOR"),
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val electabuzz = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val magmar = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val pinsir = mapOf(
        "INSETO" to listOf("GRAMA", "PSÍQUICO", "SOMBRIO")
    )
    val tauros = mapOf(
        "NORMAL" to listOf("")
    )
    val magikarp = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val gyarados = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val lapras = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
        "GELO" to listOf("TERRA", "GRAMA", "DRAGÃO", "VOADOR")
    )
    val ditto = mapOf(
        "NORMAL" to listOf("")
    )
    val eevee = mapOf(
        "NORMAL" to listOf("")
    )
    val vaporeon = mapOf(
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val flareon = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO")
    )
    val jolteon = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR")
    )
    val porygon = mapOf(
        "NORMAL" to listOf("")
    )
    val omanyte = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val omastar = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val kabuto = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val kabutops = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "ÁGUA" to listOf("FOGO", "PEDRA", "TERRA"),
    )
    val aerodactyl = mapOf(
        "PEDRA" to listOf("VOADOR", "GELO", "FOGO", "INSETO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val snorlax = mapOf(
        "NORMAL" to listOf("")
    )
    val articuno = mapOf(
        "GELO" to listOf("TERRA", "GRAMA", "DRAGÃO", "VOADOR"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val zapdos = mapOf(
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val moltres = mapOf(
        "FOGO" to listOf("METAL", "GRAMA", "INSETO", "GELO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val dratini = mapOf(
        "DRAGÃO" to listOf("DRAGÃO")
    )
    val dragonair = mapOf(
        "DRAGÃO" to listOf("DRAGÃO")
    )
    val dragonite = mapOf(
        "DRAGÃO" to listOf("DRAGÃO"),
        "VOADOR" to listOf("GRAMA", "INSETO", "LUTADOR")
    )
    val mewtwo = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )
    val mew = mapOf(
        "PSÍQUICO" to listOf("VENENO", "LUTADOR")
    )

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
    //val time1_4 = readln().lowercase()
    //val time1_5 = readln().lowercase()
    //val time1_6 = readln().lowercase()
    //Map de Maps
    val time_1 = mapOf(
        1 to pokemons[time1_1],
        2 to pokemons[time1_2],
        3 to pokemons[time1_3]
        //4 to time1_4,
        //5 to time1_5,
        //6 to time1_6
    )

    println("Jogador 2 - Escolha seu time: ")
    val time2_1 = readln().lowercase()
    val time2_2 = readln().lowercase()
    val time2_3 = readln().lowercase()
    //val time2_4 = readln().lowercase()
    //val time2_5 = readln().lowercase()
    //val time2_6 = readln().lowercase()
    val time_2 = mapOf(
        1 to pokemons[time2_1],
        2 to pokemons[time2_2],
        3 to pokemons[time2_3]
        //4 to time2_4,
        //5 to time2_5,
        //6 to time2_6
    )

    time_1.forEach { t, u ->
        //println(t)
        println(u?.values)
        time_2[1]?.values
    }
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