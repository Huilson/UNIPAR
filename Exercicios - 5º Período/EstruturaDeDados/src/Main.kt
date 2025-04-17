import java.util.LinkedList

fun main() {
    //Crio uma pilha
    val pilha = LinkedList<String>()

    //Adicionando produtos na prateleira
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")

    //Acessar primeiro elemento da Pilha
    println(pilha.peek())

    //Ver tamanho da Pilha
    println(pilha.size)

    //Remover um elemento da prateleira(Pilha)
    val esgotado = pilha.pop()
    println("Esgotados: $esgotado")
    println("Novo produto no topo da pilha: ${pilha.peek()}")

    //Verifica se existem produtos na prateleira (Pilha)
    if(pilha.isEmpty()){
        println("Acabou os produtos!")
    }else{
        println("Ainda existem produtos!")
    }

    //Verica tudo o que tem na prateleira (Pilha)
    println(pilha)


    //crio um Fila
    val fila = LinkedList<String>()

    //Adicionar usuários a Fila
    fila.addLast("Joãozinho")
    fila.addLast("Mariazinha")
    fila.addLast("Pedrinho")

    //Vejo o primeiro usuário da Fila
    println(fila.peek())

    //Ver todos os usuarios da Fila
    println(fila)

    do {
        //Faz duas coisas ao mesmo tempo, imprime o usuário e remove ele
        println("O user ${fila.removeFirst()} entrou no servidor")
        Thread.sleep(5000)//Faz o processador parar por 5 segundos
    }while(fila.isNotEmpty())//Enquanto tiver gente na fila, repita!
}