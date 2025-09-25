package state

class Receber {
    fun saiuEntregar(pacote: Pacote){
        pacote.estado = Estado.RECEBIDO

        println("\n\nPacote chegou ao destino: ${pacote.destinatario}")
        println("Novo estado do pacote ${pacote.id}: ${pacote.estado}")
        //Entregar().postarPacote(pacotes) //caso queira usar recursividade
        //Nesse exemplo não precisa, pois estamos trabalhando com Threads
        /**
         * Se quiser usar recursividade você não pode usar Threads,
         * e nem mesmo for-each, mas existem outros caminhos como,
         * por exemplo: o uso do try-catch
         * */
    }
}