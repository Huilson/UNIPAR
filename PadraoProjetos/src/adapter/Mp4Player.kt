package adapter

class Mp4Player : AdvancedMediaPlayer {
    override fun playAvi(nomeArquivo: String) {
    }

    override fun playMp4(nomeArquivo: String) {
        println("Tocando vídeo $nomeArquivo em MP4")
    }

}