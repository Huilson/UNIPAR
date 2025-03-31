class Tesoura {
    fun luta(elemento: String) : Int{
        if(elemento.equals("PEDRA")){//PERDE
            println("Você perdeu!")
            return -1
        }
        if(elemento.equals("PAPEL")){//GANHA
            println("Você ganhou!")
            return 1
        }
        println("Você empatou!")
        return 0
    }
}