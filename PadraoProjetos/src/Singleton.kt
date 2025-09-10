/*class Singleton private constructor() {
    companion object{
        @Volatile
        //Aqui vai que você for usar
        //Atributos privatos precisam de um método GET para serem acessados
        private var instance : Singleton? = null

        //Essa função acessa a variável acima
        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: Singleton().also { instance = it }
            }
    }
}

val exemplo: Singleton = Singleton.getInstance()*/

object Singleton {
    fun imprimirAlgumaCoisa() = "teste de singleton"
}

//Mais comum em programação Mobile
/*class Singleton private constructor(){
    companion object{
        val instance by lazy {
            Singleton()
        }
    }
    fun imprimirAlgumaCoisa() = "teste de singleton"
}*/

