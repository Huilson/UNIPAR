package br.unipar.pokedex.service

import br.unipar.pokedex.repository.FirebaseImage
import br.unipar.pokedex.repository.PokedexRepository
import com.google.cloud.storage.Storage
import com.google.firebase.cloud.StorageClient
import org.springframework.core.io.ByteArrayResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.net.URLConnection
import java.util.UUID

@Service
class PokedexService(
    val pokedexRepository: PokedexRepository
) {
    /**
     * Serviços que vamos usar nesse projeto
     * */
    fun mostrarArquivos(prefixo: String): List<FirebaseImage> {
        return pokedexRepository.mostraDados(prefixo)
    }

    /**
     * Serviços que NÃO vamos usar nesse projeto
     **/
    fun enviarArquivo(
        arquivo: MultipartFile,
        caminho: String = "C:/arquivos/exemplo",
        tipoArquivo: String = "png"
    ): String {
        val nomeArquivo = "$caminho/${UUID.randomUUID()}_${arquivo.originalFilename}"//cria uma chave Publica
        //NÃO VAI FUNCIONAR SE O USÁRIO NÃO ESTIVER COM PERMISSÃO
        return pokedexRepository.upload(arquivo.inputStream, nomeArquivo, tipoArquivo)
    }

    fun receberArquivo(nomeArquivo: String, caminho: String): ResponseEntity<ByteArrayResource> {
        val conteudo = pokedexRepository.download(nomeArquivo)//Retorna o conteudo da requisição
        val tipo = URLConnection.guessContentTypeFromName(caminho)
            ?: "application/octet-stream"//OCTET-STREAM é genérico, mas pode usar algo especifico como um jpeg ou pdf

        val pacoteDeDados = ByteArrayResource(conteudo)//Conteudo vindo direto do servidor

        return ResponseEntity.ok()
            .contentLength(conteudo.size.toLong())//Primeiro converte
            .contentType(MediaType.parseMediaType(tipo))//tipo do arquivo
            .header(
                "Content-Diposition",
                "attachment; filename=\"$nomeArquivo\""
            )//Gera informações do arquivo, como nome, tamanho, etc.
            .body(pacoteDeDados)
    }
}