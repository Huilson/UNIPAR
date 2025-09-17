package singleton/*class singleton.Singleton private constructor() {
    companion object{
        @Volatile
        //Aqui vai que você for usar
        //Atributos privatos precisam de um método GET para serem acessados
        private var instance : singleton.Singleton? = null

        //Essa função acessa a variável acima
        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: singleton.Singleton().also { instance = it }
            }
    }
}

val exemplo: singleton.Singleton = singleton.Singleton.getInstance()*/

object Singleton {
    fun imprimirAlgumaCoisa() = "teste de singleton"
}

//Mais comum em programação Mobile
/*class singleton.Singleton private constructor(){
    companion object{
        val instance by lazy {
            singleton.Singleton()
        }
    }
    fun imprimirAlgumaCoisa() = "teste de singleton"
}*/

