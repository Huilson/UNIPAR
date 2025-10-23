package com.example.proxy.service

import com.example.proxy.model.User

interface UserService {
    fun listUsers() : List<User>
}