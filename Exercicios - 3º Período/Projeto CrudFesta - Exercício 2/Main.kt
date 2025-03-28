import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Calendar

val expressaoRegular =  Regex("[0-5]")

//Variavel Global
//Instância de um lista mutável vazia
var listaConvidados : MutableList<Convidado> = mutableListOf<Convidado>()
val lista = mutableListOf("b", "a", "c", "e", "d")


fun main() {
    val i = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)


    println(i)
    menu()
}

private fun menu(){
    do{
        println("--- MENU ---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("5- BUSCA")
        println("0- SAIR")
        val opcao = readln()//Aqui precisa ser String
        //por causa do REGEX

        if (expressaoRegular.matches(opcao)){
            when (opcao.toInt()) {
                1 -> {
                    println("Cadastrando...")
                    cadastrar()
                }

                2 -> {
                    println("Listando...")
                    listar()
                }

                3 -> {
                    println("Editando...")
                    editar()
                }

                4 -> {
                    println("Excluindo...")
                    excluir()
                }

                5 -> {
                    println("Buscando...")
                    busca()
                }

                0 -> print("Saindo")
            }
        } else{
            println("\n\n\nOpção inválida")
        }

    }while(opcao != "0")//PRECISA SER STRING!
}

//QUESTÃO 1 - Valida para que o usuario
//somente digite LETRAS para escrever o nome
private fun cadastrar(){
    //Instância
    var convidado = Convidado()

    print("Qual o seu nome? ")
    //val nome = readln()
    convidado.nome = readln()//QUESTÃO 1

    print("Qual vai ser o presente? ")
    //val presente = readln()
    convidado.presente = readln()

    print("Qual sua restrição alimentar? ")
    //val alimento = readln()
    convidado.alimentar = readln()

    listaConvidados.add(convidado)
}

/*fun algumaCoisa() : tipo esperasse que a função
* receba esse tipo no final dela com um return
* */
private fun listar() : String{
    var i = 0

    listaConvidados.sortBy {
        it.nome
    }

    if (validar()){
        listaConvidados.forEach { convidado ->
            print(
                "Posição: ${i++}" +
                        "Nome: ${convidado.nome}; " +
                        "Presente: ${convidado.presente} ; " +
                        "Restrição: ${convidado.alimentar}; " +
                        "Vai ir a festa? ${convidado.presenca} \n"
            )//FIM do PRINT
        }//FIM do FOREACH
    }//FIM do IF
    return "Listagem foi um sucesso"//esse é o meu retorna da função
}//FIM da FUNÇÃO LISTAR

/*QUESTÃO 2 - Validar para que a variavel posição seja sempre
numérica e a variavel resposta seja sempre "S" ou "N"*/
private fun editar() : Boolean{
    if(validar()){
        listar()
        println("Digite a posição a ser editada: ")
        val posicao = readln().toInt()

        println("O convidado vai? S/N")
        val resposta = readln()
        when(resposta){
            "S"-> listaConvidados[posicao].presenca  = true
            "N"-> listaConvidados[posicao].presenca  = false
        }//FIM do WHEN
    }//FIM do IF
    return true
}//FIM do EDITAR

/*QUESTÃO 3 - Validar para que a variavel posição seja sempre
numérica*/
private fun excluir(): Boolean{
    if(listaConvidados.isEmpty()){
        listar()

        println("Qual posição você deseja remover: ")
        val posicao = readln().toInt()
        listaConvidados.removeAt(posicao)


        println("Convidado excluido")
    }//FIM do IF
    return true
}//FIM do EXCLUIR

/*QUESTÃO 4 - Validar para que a variavel busca seja sempre
alfabética, ignora letras maiusculas e minusculas*/
private fun busca(){
    var i = 0//indice da lista
    print("Digite o nome da pessoa que você busca: ")
    val busca = readln()
    listaConvidados.forEach { convidado ->
        //O contains busca por uma string dentro de uma outra string
        if (convidado.nome.contains(busca)){
            println("Posição: $i, Nome: ${convidado.nome}")
        }
        i++
    }
}

private fun validar() : Boolean{
    if(listaConvidados.isEmpty()){
        println("Lista vazia! Finalizando...")
        return false
    }
    return true
}