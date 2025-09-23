object MazeGame {
    private val maze = arrayOf(
        "#########",
        "#     # #",
        "# ### # #",
        "# #   # #",
        "# # ### #",
        "#     # #",
        "#########"
    )

    private var playerX = 1
    private var playerY = 1

    fun start() {
        while (true) {
            render()

            print("Movimento (WASD): ")
            when (readLine()?.uppercase()) {
                "W" -> if (maze[playerY - 1][playerX] == ' ') playerY--
                "S" -> if (maze[playerY + 1][playerX] == ' ') playerY++
                "A" -> if (maze[playerY][playerX - 1] == ' ') playerX--
                "D" -> if (maze[playerY][playerX + 1] == ' ') playerX++
            }

            println("\n".repeat(5)) // simula limpar tela
        }
    }

    private fun render() {
        for (y in maze.indices) {
            for (x in maze[y].indices) {
                if (x == playerX && y == playerY) {
                    print("P")
                } else {
                    print(maze[y][x])
                }
            }
            println()
        }
    }
}

fun main() {
    MazeGame.start()
}