class Papel {
    fun luta(elemento: String) : Int{
        if(elemento.equals("TESOURA")){
            println("Você perdeu!")
            return -1 //perdi pontos
        }
        if(elemento.equals("PEDRA")){
            println("Você ganhou!")
            return 1 //ganha pontos
        }
        println("Você empatou!")
        return 0//empate
    }
}