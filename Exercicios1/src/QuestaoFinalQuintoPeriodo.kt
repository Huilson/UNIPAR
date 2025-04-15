/*
Separar números reais positivos e números reais negativos em duas listas distintas
(ou em qualquer tipo de array), uma lista guardará os positivos e a outra os negativos.
O usuário será o responsável por digitar os números, a leitura desses números só deve
ser interrompida quando o usuário digitar o número ZERO.
Validar para que o usuário seja capaz de digitar somente números
(dígitos, sinais negativos e pontos) usando expressão regular.
Aplique a seguinte expressão: ^[-+]?[0-9]*\.?[0-9]+$ tal expressão ainda precisa ser
alterada para pode ser validada pela biblioteca de expressões regulares de sua
 linguagem escolhida.
Mostrar todos os elementos das listas (ou arrays) no console.
*/
fun main() {
    val regex = Regex("^([-+]?[0-9]*\\.?[0-9])+$")
    val numerosPositovos = mutableListOf<Double>()
    val numerosNegativos = mutableListOf<Double>()
    do {
        println("Digite um numero real: ")
        val numero = readln()
        if (!regex.matches(numero)) {
            println("Número inválido!")
            continue//É um break que não quebra o laço, apenas ignora o que tem abaixo
        }
        if (numero.toDouble() > 0) {
            numerosPositovos.add(numero.toDouble())
        } else if (numero.toDouble() < 0) {
            numerosNegativos.add(numero.toDouble())
        }
    } while (numero != "0")
    println("NEGATIVOS")
    numerosNegativos.forEach { negativo ->
        println("$negativo")
    }
    println("POSITIVOS")
    for(positovo in numerosPositovos){
        println("$positovo")
    }
}