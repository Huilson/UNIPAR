package state

import java.lang.Thread.sleep
import kotlin.random.Random

class Transportar {
    fun rastrear(pacote: Pacote, pacotes: MutableList<Pacote>) {
        pacote.estado = Estado.DESPACHADO

        println("\nPacote: ${pacote.id} recebido, enviando para ${pacote.destinatario}")
        println("Novo estado do pacote ${pacote.id}: ${pacote.estado}")

        var tempo = (10..20).random() // de 50 até 100

        //Esse while simula o tempo que o pacote leva para ser entregue
        while (tempo != 0) {
            tempo-- //diminui o tempo
            sleep(100)
            print(".")
        }

        Receber().saiuEntregar(pacote, pacotes)
    }
}