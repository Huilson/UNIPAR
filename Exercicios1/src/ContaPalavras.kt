fun main(){
    var count = 0

    println("Informe o texto: ")
    var texto = readln().lowercase()

    print("\nInforme a palavra que você deseja buscar por repetições: ")
    val busca = readln().lowercase()

    do {
        //Reparte o texto em frações menores enquanto a palavra buscada existir
        texto = texto.substringAfter(busca)
        count++
    }while(texto.contains(busca))
    println(count)
}