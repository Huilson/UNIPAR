package com.example.Mapa.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MapaController (
    @Value("\${google.maps.api}")
    private val apiKey : String
){
    @GetMapping
    fun mostrarMapa(model: Model) : String{
        model.addAttribute("apiKey", apiKey)
        return "mapa"
    }
}