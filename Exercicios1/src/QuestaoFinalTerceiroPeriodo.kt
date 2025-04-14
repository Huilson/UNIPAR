/**
 * Ler o nome completo do usuário através do teclado
 * Separar nome e sobrenome em 3 variáveis (Strings) diferentes.
 * Dica, se estiver usando Kotlin use os métodos substringBefore() e/ou substringAfter().
 * Considere o nome do meio, ou nomes compostos como sobrenome
 * Armazene todos os sobrenomes (ou seja, todos os nomes que venham após o nome inicial)
 * em uma lista (ou array).
 * Mostrar todos os elementos das listas (ou arrays) no console ordenas em ordem
 * alfebética. Em Kotlin você pode usar a função sort() caso esteja usando listas.
 */
fun main(){
    val listaNomes = mutableListOf<String>()
    val listaNomesDoMeio = mutableListOf<String>()
    val listaSobrenomes = mutableListOf<String>()

    do{
        println("Digite seu nome completo: (digite sair para sair)")
        val nomeCompleto = readln()

        println("Seu nome é composto? s/n")
        val resposta = readln().lowercase()
        if(resposta == "s" && nomeCompleto != "sair"){//Ele tem nome composto
            listaNomes.add(nomeCompleto.substringBefore(" "))//Quebro o nome e fico somente com o que vem antes do espaço

            //EXEMPLO JOÃO MATEUS SILVEIRO
            val aux = nomeCompleto.substringAfter(" ")//a nova String sera MATEUS SILVEIRO
            listaNomesDoMeio.add(aux.substringBefore(" "))//finalmente pegamos o nome do meio
            listaSobrenomes.add(aux.substringAfter(" "))

        }else if(nomeCompleto != "sair"){//não tem nome composto
            listaNomes.add(nomeCompleto.substringBefore(" "))
            listaSobrenomes.add(nomeCompleto.substringAfter(" "))
        }
    }while (nomeCompleto != "sair")
    //Ordena as listas em ordem alfabética
    listaNomes.sort()
    listaNomesDoMeio.sort()
    listaSobrenomes.sort()

    println("\nOs nomes são: ")
    listaNomes.forEach { nome ->
        print("$nome - ")
    }//FIM NOMES

    println("\nOs nomes do meio são: ")
    listaNomesDoMeio.forEach { nomeDoMeio ->
        print("$nomeDoMeio - ")
    }//FIM NOME DO MEIO

    println("\nOs sobrenomes são: ")
    listaSobrenomes.forEach { sobrenome ->
        print("$sobrenome - ")
    }//FIM SOBRENOME

}
