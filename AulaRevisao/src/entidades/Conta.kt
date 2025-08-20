package entidades

import java.math.BigDecimal

class Conta(
    val pessoa: Pessoa,//opcional
    val saldo : BigDecimal,
    val id : Long
)