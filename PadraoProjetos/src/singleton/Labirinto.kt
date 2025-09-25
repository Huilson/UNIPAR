package singleton

import kotlin.random.Random

object Labirinto {
    private val map = mapOf(
        0 to arrayOf("██████", "███████", "███████"),
        1 to arrayOf("█   ███", "█    ██", "█    ██"),
        2 to arrayOf("██   ██", "███   █", "█ █  ██"),
        3 to arrayOf("███   █", "█ █ █ █", "█    ██"),
        4 to arrayOf("████□██", "███□███", "████□██")
    )
    private val labCompleto = gerarLab()

    private var eixoX = 1
    private var eixoY = 1
    private var vitoria = false

    fun start() {
        while (true) {
            val labRenderizado = render()
            if(labRenderizado[eixoY - 1][eixoX] == '□'){
                vitoria = true
            }else if(labRenderizado[eixoY + 1][eixoX] == '□'){
                vitoria = true
            }else if(labRenderizado[eixoY][eixoX - 1] == '□'){
                vitoria = true
            }else if(labRenderizado[eixoY][eixoX + 1] == '□'){
                vitoria = true
            }
            print("Movimento (WASD): ")
            when (readLine()?.uppercase()) {
                "W" -> if (labRenderizado[eixoY - 1][eixoX] == ' ') eixoY--
                "S" -> if (labRenderizado[eixoY + 1][eixoX] == ' ') eixoY++
                "A" -> if (labRenderizado[eixoY][eixoX - 1] == ' ') eixoX--
                "D" -> if (labRenderizado[eixoY][eixoX + 1] == ' ') eixoX++
            }
            if (vitoria){
                println("Parabéns você ganhou!")
                break
            }

            println("\n".repeat(5)) // simula limpar tela
        }
    }
    /**
     * 0 1 2 3 4 5
     * 1 2 3 4 5 6
     * 2 3 4 5 6 7
     * 3 4 5 6 7 8
     * 4 5 6 7 8 9
     * 5 6 7 8 9 0
     * */

    private fun gerarLab(): Array<String> {
        val lab = arrayOfNulls<String>(5)

        println("Montando labirinto...")
        for ((id, parte) in map) {
            val semente = Random.nextInt(2)
            println("Semente gerada: $semente")
            lab[id] = parte[semente]
            println("Parte $id criada...\n")
        }
        return lab as Array<String>
    }

    private fun render(): Array<String> {
        for (y in labCompleto.indices) {
            for (x in labCompleto[y].indices) {
                if (x == eixoX && y == eixoY) {
                    print("P")
                }
                else {
                    print(labCompleto[y][x])
                }
            }
            println()
        }
        return labCompleto
    }
}
//MazeGame.start()
