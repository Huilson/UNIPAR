open class Animal(){
    //atributos são caracteristicas de uma Classe
    var nome: String = ""
    var especie: String = ""
    var dieta: String = ""
    var habitat: String = ""

    //metodos ou funções são comportamentos
    open fun somAnimal() : String{
        return("Som do animal!")
    }
}