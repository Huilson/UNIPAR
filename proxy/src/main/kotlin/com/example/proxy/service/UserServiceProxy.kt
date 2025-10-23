package com.example.proxy.service

import com.example.proxy.model.User
import org.springframework.stereotype.Component

@Component
class UserServiceProxy(
    private val userServiceImpl: UserServiceImpl
) : UserService{
    override fun listUsers(): List<User> {
        println("Proxy: Verificando permissões antes de acessar o serviço real")
        //aqui poderia validar com um token, permissões, cache, etc.
        return userServiceImpl.listUsers()
    }
}