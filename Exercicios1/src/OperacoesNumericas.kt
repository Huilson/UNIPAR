import kotlin.math.absoluteValue

val regex = Regex("^[-+?0-9*.0-9]+$")//Aceita FLOAT ou DOUBLE
fun main(){
    do {
        println("Digite uma opção: ")
        println("1 - Somar números")
        println("2 - Gerar número aleatório")
        println("3 - Separa positivos e negativos")
        println("4 - Sair")
        val opcao = readln().toInt()

        when(opcao){
            1->{somar()}
            2->{gerar()}
            3->{armazenar()}
            4->{println("Saindo...")}
        }
    }while (opcao != 4)
}

fun somar(){
    val lista = mutableListOf<Double>()

    print("Quantidade de números? ")
    val quantidade = readln()
    if (regex.matches(quantidade) && quantidade.toDouble().toInt() > 0){
        while(lista.size < quantidade.toDouble().toInt().absoluteValue){
            print("Digite um número real: ")
            val num = readln()
            if(regex.matches(num))
                lista.add(num.toDouble())
            else
                print("\nTente novamente\n")
        }
        println(lista.sum())
    }else{
        print("\nNúmero desconhecido ou negativo\n")
        return
    }
}

fun gerar(){
    println("Informe o iníco do intervalo")
    val x = readln().toInt().absoluteValue
    println("Informe o fim do intervalo")
    val y = readln().toInt().absoluteValue

    println("Gerando número aleatório dentro do intervalo...")
    println((x..y).random())
}

fun armazenar(){
    val listaPositiva = mutableListOf<Int>()
    val listaNegativa = mutableListOf<Int>()

    val regexInt = Regex("^[+-]?[0-9]*$")//apenas INTEGERS

    do {
        println("Digite um número inteiro: ")
        val num = readln()
        if(!regexInt.matches(num)){
            println("Número inválido!")
            continue
        }
        if(num.toInt() > 0)
            listaPositiva.add(num.toInt())
        else
            listaNegativa.add(num.toInt())
    }while (num != "0")
    listaPositiva.sort()
    listaNegativa.sort()
    println("Positivos: $listaPositiva")
    println("Negativos: $listaNegativa")
}