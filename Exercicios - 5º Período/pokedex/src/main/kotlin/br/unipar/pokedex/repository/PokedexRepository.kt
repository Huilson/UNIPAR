package br.unipar.pokedex.repository

import com.google.cloud.storage.Storage
import com.google.firebase.cloud.StorageClient
import org.springframework.stereotype.Repository
import java.io.InputStream

data class FirebaseImage(
    val name: String,
    val url: String
)

@Repository
class PokedexRepository {
    //Acessa a classe CONFIG, abre o arquivo JSON e acessa nosso Storage
    //private val bucketName = "spring-firebase-bb699.firebasestorage.app"
    private val bucket = StorageClient.getInstance().bucket()

    /**
     * Serviços que vamos usar nesse projeto
     * */
    fun mostraDados(prefixo : String): List<FirebaseImage> {

        return bucket.list(Storage.BlobListOption.prefix(prefixo)).iterateAll().filter {arquivo ->
            !arquivo.isDirectory //itera para ver se o arquivo existe
        }.map {arquivo ->
            FirebaseImage(
                name = arquivo.name.substringAfterLast('/'),
                url = "https://storage.googleapis.com/${bucket.name}/${arquivo.name}"
            )
        }//Esse MAP retorna o nome do arquivo dentro do BUCKET

    }
        //Retorna todos os nomes de arquivo sem VALIDAR os tipos de arquivo


    /**
     * Serviços que NÃO vamos usar nesse projeto
     * */
    //O download nada mais é do que um GET
    fun download(nomeArquivo: String) : ByteArray{
        //BLOB é um tipo de dado que armazena dados em formato binário, como imagens, vídeos, e documentos.
        //"blob" significa "Binary Large Object" (Objeto Binário Grande)
        val blob = bucket.get(nomeArquivo) ?:
        throw IllegalArgumentException("Arquivo não encontrado")
        return blob.getContent()//Coverte BLOB para um Array de Bytes
    }

    //O upload nada mais que um POST
    fun upload(
        caminhoArquivo : InputStream,//Serializa o arquivo
        nomeArquivo: String,
        tipoArquivo: String
    ) : String{
        val blob = bucket.create(nomeArquivo, caminhoArquivo, tipoArquivo)
        //Envia o arquivo para o bucket, somente um por vez, no seguinte endereço:
        return "http://storage.googleapis.com/${bucket.name}/$nomeArquivo"
    }
    fun delete(nomeArquivo: String) : Boolean{
        val blob = bucket.get(nomeArquivo) ?: //o GET pega o caminho HTTP do arquivo
        return false
        return blob.delete()//Com o caminho excluo o arquivo encontrado
    }
}