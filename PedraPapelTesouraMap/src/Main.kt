//Variavel goblal
var playerMap = mutableMapOf<String, Int>()
var playerList = mutableListOf<String>()
var scoreList = mutableListOf<Int>()

fun main() {
    do{
        println("\n1-JOGAR!")
        println("2-PLACAR")
        println("3-SAIR!")

        val opcao = readln()//USUARIO DIGITA A OPÇÃO

        when(opcao.toInt()){
            1 -> jogar() //A SETINHA SE CHAMA LAMBDA
            2 -> mostrarPlacarComMap()
            3 -> print("saindo...")
        }
    }while(opcao != "0")
}

fun jogar(){
    var pontos = 0
    println("Digite seu nickname: ")
    val nickname = readln() //O USUARIO DIGITA SEU NICK

    println("QUE OS JOGOS COMEÇEM!")
    var rodadas = 1
    do {
        println("O que você quer jogar? ")
        println("Pedra, papel ou tesoura?!")
        var jogada = readln().uppercase()//Movimento do jogador

        //instâncias dos elementos do jogo


        var movimentoPC = computador()//movimento do PC
        println("O computador jogou: $movimentoPC")

        when(jogada){
            "PEDRA" -> {

            }
            "PAPEL"-> {

            }
            "TESOURA"-> {

            }
        }
        println("Você tem: $pontos pontos!")
        println("Próxima rodada!")
        rodadas++ //no final da rodada incrementa
    }while(rodadas <= 3)
    validaPontos(nickname, pontos)
}

fun computador(): String{
    /**
     * Aqui temos um RANGE que é determinado por (1..3)
     * um range é um intervalo númerico, neste caso de 1 a 3
     * a função .random ira gerar um número aleatório dentro
     * desse intervalo que determinamos*/
    val movimento = (1..3).random()
    when(movimento){
        1-> return "TESOURA"
        2-> return "PEDRA"
        3-> return "PAPEL"
        else -> return ""
    }
}

fun validaPontos(nickname: String, pontos: Int): Boolean{
    if (playerMap.isEmpty()){
        return false
    }
    playerMap.forEach { (t, u) ->
        if (t == nickname){
            if (u > pontos){
                println("NEW RECORD $t!")
                playerMap[nickname] = pontos
            }
        }
    }
    return true
}

fun mostrarPlacarComMap(){
    println("\n\n\n")
    println("PLAYER \t PONTOS")
    playerMap.forEach { t, u ->
        println("$t \t $u")
    }
}

fun mostrarPlacarSemMap(){
    println("\n\n\n")
    println("PLAYER \t PONTOS")

    var i = 0
    for(player in playerList){
        println("$player \t ${scoreList[i]}")
    }
}