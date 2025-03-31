class Pedra {

    fun luta(elemento: String) : Int{
        if(elemento.equals("PAPEL")){//PERDE
            println("Você perdeu!")
            return -1 //perca de pontos
        }
        if(elemento.equals("TESOURA")){//GANHA
            println("Você ganhou!")
            return 1//ganho de pontos
        }
        println("Você empatou!")
        return 0//empate
    }
}