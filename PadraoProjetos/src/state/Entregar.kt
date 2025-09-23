package state

class Entregar() {
    fun postarPacote(pacotes: MutableList<Pacote>) {
        pacotes.forEach { pacote ->
            Thread {//O uso de threads permite fazer várias chamadas de função ao mesmo tempo
                pacote.estado = Estado.POSTADO//A primeira coisa a fazer é mudar o estado

                println("\nPacote postado por ${pacote.remetente}, enviando para a transportadora")
                println("Novo estado do pacote ${pacote.id}: ${pacote.estado}")
                Transportar().rastrear(pacote, pacotes)
            }.start() //Quando se trabalha com threads é preciso dar um START nelas

        }//Fim do for-each
        Thread.currentThread().join()
    }//fim da função
}