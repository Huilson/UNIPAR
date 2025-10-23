package com.example.proxy.service

import com.example.proxy.model.User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun listUsers(): List<User> =
        //o certo desse exemplo seria resgatar do banco
        //aqui estamos apenas salvando (listando) em memória
        listOf(
            User(name = "Leonardo Folle", email = "leofolle@unipar.com"),
            User(name = "Willian Kangam", email = "wkangam@unipar.com")
        )
}