//Variavel Global
var listaDeConvidados = mutableListOf<Convidado>()

fun main() {
    menu()
}

private fun menu() {
    do {
        println("1- CRIAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("0- SAIR")
        val op = readln()//VALIDAR!

        when (op.toInt()) {//Opções do menu
            1 -> criar()
            2 -> print("LISTAR")
            3 -> print("EDITAR")
            4 -> print("EXCLUIR")
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

    print("Sexo: M ou F")
    val sexo = readln()
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
}