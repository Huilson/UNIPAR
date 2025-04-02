class PedraPapelTesoura (
    val movimento: Elemento
){
    fun lutaRegex(movimento: String){
        this.movimento.name.contains("TESOURA")
    }
    fun luta(movimentoPlayer: Elemento, movimentoPC: Int) : Int{
        when(movimentoPlayer.name){
            "PEDRA"-> {
                if(movimentoPC == 1){
                    return 0
                }else if(movimentoPC == 2){
                    return -1
                }
                return 1
            }
            "PAPEL"-> {
                if(movimentoPC == 1){
                    return 1
                }else if(movimentoPC == 2){
                    return 0
                }
                return -1
            }
            "TESOURA"-> {
                if(movimentoPC == 1){
                    return -1
                }else if(movimentoPC == 2){
                    return 1
                }
                return 0
            }
            else -> return 0
        }
    }
}