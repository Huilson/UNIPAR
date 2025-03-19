fun main(){
    var gato = Gato()
    gato.nome = "Gato"
    gato.dieta = "Peixe"
    gato.habitat = "Apartamento"
    gato.especie = "Felino"
    //val gato: Gato = animal as Gato //NAO RECOMENDADO
    println(gato.nome)
    println(gato.somAnimal())

    var cachorro = Cachorro()
    cachorro.nome = "Cachorro"
    cachorro.dieta = "Gato"
    cachorro.habitat = "Canil"
    cachorro.especie = "Canino"

    println(cachorro.nome)
    println(cachorro.somAnimal())

    //Salvar animais em uma lista (Gato, Cachorro e +1)
    val lista = listOf<Animal>(gato, cachorro)
    println("LISTA: ${lista.first().somAnimal()}")

}