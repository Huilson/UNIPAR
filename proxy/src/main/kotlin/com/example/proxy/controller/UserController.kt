package com.example.proxy.controller

import com.example.proxy.model.User
import com.example.proxy.service.UserServiceProxy
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController (
    private val proxy : UserServiceProxy
){

    @GetMapping
    fun listUsers(): List<User> = proxy.listUsers()
}