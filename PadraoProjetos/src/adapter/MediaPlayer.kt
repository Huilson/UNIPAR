package adapter

class MediaPlayer (tipoArquivo: String): AppPlayer {
    private var advancedMediaPlayer : AdvancedMediaPlayer? = null

    init {
        if (tipoArquivo.equals("avi")){
            advancedMediaPlayer = AviPlayer()
        } else if (tipoArquivo.equals("mp4")){
            advancedMediaPlayer = Mp4Player()
        }
    }

    override fun play(tipoArquivo: String, nomeArquivo: String) {
        if(tipoArquivo.equals("avi", true)){
            advancedMediaPlayer?.playAvi(nomeArquivo)
        } else if(tipoArquivo.equals("mp4", true)){
            advancedMediaPlayer?.playMp4(nomeArquivo)
        }
    }
}