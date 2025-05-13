package br.unipar.pokedex.configuration

import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.firestore.Firestore
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.cloud.FirestoreClient
import com.google.firebase.cloud.StorageClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.io.FileInputStream

@Configuration
class FirebaseConfig {
    @Bean
    fun firebaseApp(): FirebaseApp {
        if (FirebaseApp.getApps().isEmpty()) {
            val arquivoJson = FileInputStream("src/main/resources/firebase-service.json")

            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(arquivoJson))
                .setStorageBucket("spring-firebase-bb699.firebasestorage.app") // <-- substitua pelo seu, sem o gs://
                .build()
            return FirebaseApp.initializeApp(options)
        }
        return FirebaseApp.getInstance()
    }

    @Bean
    fun firestore(): Firestore {
        return FirestoreClient.getFirestore(firebaseApp())
    }

    @Bean
    fun firebaseStorage(): StorageClient {
        return StorageClient.getInstance(firebaseApp())
    }
}
