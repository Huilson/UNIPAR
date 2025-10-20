fun main() {
    var numero = 1
    var fator = 10
    var soma = 0

    for (i in 1..10) {
        when {
            numero == fator -> soma *= i
            numero > fator -> soma -= numero
            numero < fator -> soma += fator
        }
        numero++
        fator--
        println(soma)
    }
}