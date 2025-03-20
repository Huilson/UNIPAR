fun main(){
    val regex = Regex("^(?:[2-9]|/d{2,})$")
    var numero : String

    do {
        print("Digite um numero acima de 1: ")
        numero = readln()
    }while (!regex.matches(numero))

    //F(n) = F(n-1)+F(n-2)
    fun fibonacci(n: Int) : Int{
        //criterio de parada
        if(n <= 1){
            return n
        }
        return fibonacci(n-1)+fibonacci(n-2)
    }
}