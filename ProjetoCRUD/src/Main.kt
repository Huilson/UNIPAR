//Variavel Global
var listaDeConvidados: MutableList<Convidado> = mutableListOf<Convidado>()

fun main() {
    menu()
}

private fun menu() {
    do {
        println("\n1- CRIAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("5 - BUSCAR")
        println("0- SAIR")
        val op = readln()//VALIDAR!

        when (op.toInt()) {//Opções do menu
            1 -> criar()
            2 -> listar()
            3 -> editar()
            4 -> excluir()
            5 -> buscar()
            0 -> print("Saindo...")
        }
    } while (op.toInt() != 0)
}

private fun criar() {
    println("CRIAR")
    print("Nome do convidado: ")
    val nome = readln()

    print("Qual o seu presente: ")
    val presente = readln()

    print("Alguma restrição alimentar? ")
    val alimentar = readln()

    print("Sexo: M ou F: ")
    val regex = Regex("^[MF]$")
    val sexo = readln().uppercase()
    //fazer um loop caso a opção seja inválida
    if(regex.matches(sexo)){
        when (sexo) {
            "M" -> {
                var homem = Homem()
                homem.nome = nome
                homem.restricao = alimentar
                homem.vestuario = presente

                listaDeConvidados.add(homem)
            }

            "F" -> {
                var mulher = Mulher()
                mulher.nome = nome
                mulher.restricao = alimentar
                mulher.brinquedo = presente

                listaDeConvidados.add(mulher)
            }
        }
    } else {
        println("opção inválida")
    }

}

private fun listar(){
    var i = 0//para poder usar o indice no FOREACH
    listaDeConvidados.forEach { convidado ->//a setinha se chama LAMBDA
        println("Posição: ${i++}, " +
                "Nome: ${convidado.nome}, " +
                "Restrição Alimentar: ${convidado.restricao}, " +
                "Presença: ${convidado.presenca}")
                //Como fazer para mostrar o presente?
                //Exercicio: Listar o brinquedo e o vestuário
    }
}

private fun editar(){
    if(validar()){
        listar()
        println("Qual posição deseja alterar a presença: ")
        val posicao = readln().toInt()
        val regex = Regex("^[sn]$")
        //fazer um loop caso a opção seja inválida
        println("Essa pessoa vai ou não na festa? (S/N)")
        val resposta = readln().lowercase()
        if (regex.matches(resposta)) {
            when (resposta) {
                "s" -> { listaDeConvidados[posicao].presenca = true }

                "n" -> { listaDeConvidados[posicao].presenca = false }
            }
        } else {
            println("Opção inválida")
        }
    }
}

private fun excluir(){
    if(validar()) {
        listar()
        println("Qual posição deseja remover o convidado: ")
        val regex = Regex("\\d")
        val posicao = readln()
        if(regex.matches(posicao)){
            listaDeConvidados.removeAt(posicao.toInt())
        }
    }
}

private fun validar(): Boolean{
    if(listaDeConvidados.isEmpty()){
        println("Sem convidados!")
        return false
    }
    return true
}

private fun buscar(){
    listar()
    if(validar()){
        println("Por quem você deseja buscar: ")
        val busca = readln().toRegex(RegexOption.IGNORE_CASE)
        var i = 0

        listaDeConvidados.forEach { convidado ->
            if(convidado.nome.contains(busca)){
                println("Nome: ${convidado.nome}, Posição: $i")
            }
            i++
        }
    }
}