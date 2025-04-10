fun main() {
    val lista = mutableListOf<String>()
    //expressão que só aceita letras, mas não acentos
    val regex = Regex("^[A-Za-z]+$")
    do {
        print("Digite um nome: ")
        val nome = readln()

        if (regex.matches(nome))
            lista.add(nome)
        else
            print("\nNome inválido\n")

        print("Precione 's' para continuar ")
        val resposta = readln()
    } while(resposta == "s")

    lista.sort()//Organiza a lista em ordem alfabética

    lista.forEach {
        println(it)
    }
}