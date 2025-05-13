package br.unipar.pokedex.repository

import br.unipar.pokedex.model.Pokemon
import br.unipar.pokedex.model.Tipo
import com.google.cloud.firestore.Firestore
import com.google.firebase.cloud.FirestoreClient
import org.springframework.stereotype.Repository

@Repository
class PokemonRepository(
    //Essa val é a instância do banco
    private val firestore : Firestore //= FirestoreClient.getFirestore()//Buscar em um JSON
) {
    private val collectionName = "pokedex" //O nome da coleção é o que esta no Firebase

    fun salvar(pokemon : Pokemon) : Pokemon{
        val documento = firestore.collection(collectionName).document(pokemon.numeroPokedex!!)//Busca um documento pelo ID

        val pokemonRegistrado = pokemon.copy(numeroPokedex = documento.id)//Copia do que foi resgatado do banco
        documento.set(pokemonRegistrado)//Edita ou cria os valores de cada CHAVE
        return pokemonRegistrado//retorna as alterações ou criações
    }

    fun buscarId(numeroPokedex: String) : Pokemon?{
        val documento = firestore.collection(collectionName)
            .document(numeroPokedex).get().get()//Retorna os dados da referência
        return if (documento.exists())
            documento.toObject(Pokemon::class.java)
        else
            null
    }

    fun buscarTodos() : List<Pokemon>{
        val query = firestore.collection(collectionName)
            .get().get()//Retorna todos os documentos da coleção
        //a query vem em vários JSON, basta converte para uma lista
        //um de cada vez
        return query.documents.mapNotNull {pokemons ->
            pokemons.toObject(Pokemon::class.java)
        }
    }

    fun buscarPorTipos(tipo: String) : List<Pokemon>{ //busca personalizada
        val query = firestore.collection(collectionName).whereEqualTo("tipo_1", tipo.uppercase())
            .get().get()//Retorna todos os documentos da coleção
        return query.documents.mapNotNull {pokemons ->
            pokemons.toObject(Pokemon::class.java)
        }
    }

    fun excluirId(numeroPokedex: String): Boolean{
        //Busca um documento igual na buscaID, mas aqui deleta ele
        firestore.collection(collectionName).document(numeroPokedex).delete()
        return true
    }
}