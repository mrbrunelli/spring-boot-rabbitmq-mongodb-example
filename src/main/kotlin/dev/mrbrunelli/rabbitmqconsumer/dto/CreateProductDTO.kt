package dev.mrbrunelli.rabbitmqconsumer.dto

import java.io.Serializable

data class CreateProductDTO(
    val name: String,
    val qty: Long,
    val category: String
) : Serializable
