package adapter

class AudioPlayer : AppPlayer {
    private var mediaPlayer: MediaPlayer? = null

    override fun play(tipoArquivo: String, nomeArquivo: String) {
        if (tipoArquivo.equals("mp3")) {
            println("Tocando a música $nomeArquivo .mp3")
        } else if (tipoArquivo.equals("ogg")) {
            println("Tocando a música $nomeArquivo .ogg")
        } else{
            mediaPlayer = MediaPlayer(tipoArquivo)
            mediaPlayer?.play(tipoArquivo, nomeArquivo)
        }
    }


}