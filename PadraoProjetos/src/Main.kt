import singleton.Labirinto
import state.Pacote

fun main() {
    //Labirinto.start()

    /*
    //Esses pacotes podem ser o retorno de uma API qualquer
    val pacote1 = Pacote(id = "1", destinatario = "Zelda", remetente = "Link", estado = Estado.DESCONHECIDO)
    val pacote2 = Pacote(id = "2", destinatario = "Mario", remetente = "Luigi", estado = Estado.DESCONHECIDO)
    val pacote3 = Pacote(id = "3", destinatario = "Pikachu", remetente = "Ash", estado = Estado.DESCONHECIDO)
    val listaPacotes = mutableListOf(pacote1, pacote2, pacote3) //Fila de pacote
    //Uma fila?! Mas o que é isso?
    //FILA: First In, First Out; Fila é uma estrutura de dados básica da computação
    //Pesquise sobre e veja seus conceitos e formas de implementação
    println("Alguns pacotes chegaram, verificando estado: ")
    for (pacote in listaPacotes) {
        println("Pacote: ${pacote.id}, estado: ${pacote.estado}")
    }

    Entregar().postarPacote(listaPacotes) //Enviar fila de pacotes
    verificarPacotes(listaPacotes)*/
}

fun verificarPacotes(listaPacotes: MutableList<Pacote>) {
    println("Tudo em ordem. Verificando estados dos pacotes...")
    for (pacote in listaPacotes) {
        println("Pacote: ${pacote.id}, estado: ${pacote.estado}")
    }
}
