package adapter

class AviPlayer : AdvancedMediaPlayer {
    override fun playAvi(nomeArquivo: String) {
        println("Tocando vídeo $nomeArquivo em AVI")
    }

    override fun playMp4(nomeArquivo: String) {
    }
}