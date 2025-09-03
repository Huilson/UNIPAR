package org.example.ui.cadastro

import entidades.CaixaDAgua
import entidades.Pessoa
import enumeradores.Material
import enumeradores.Sexo
import org.example.entidadeGerenciadora.EntidadeJDBC

fun editarrCaixaDAgua(){
    println("Digite a capacidade: ")
    val litros = readln().toDouble()

    println("Digite a altura: ")
    val alt = readln().toDouble()

    println("Digite a largura: ")
    val larg = readln().toDouble()

    println("Digite a profundidade: ")
    val prof = readln().toDouble()

    println("Digite o blabla: ")
    val blabla = readln()

    println("MATERIAIS: ")
    println("1 - PLASTICO")
    println("2 - PVC")
    println("3 - METAL")
    println("4 - ARGAMASSA")
    println("Escolha o número do material: ")
    val opcaoMaterial = readln().toInt()
    var material : Material = Material.PLASTICO
    when(opcaoMaterial){
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
    }

    println("Digite o ID da caixa: ")
    val id = readln().toLong()

    val banco = EntidadeJDBC(
        url = "jdbc:postgresql://localhost:5432/revisao",
        user = "postgres",
        password = "5432"//no caso de vocês provavelmente será postgres
    )
    banco.editarCaixa(
        CaixaDAgua(
            id = id,
            material = material,
            largura = larg,
            altura = alt,
            profundidade = prof,
            capacidade = litros,
            blabla = blabla
        )
    )
}

