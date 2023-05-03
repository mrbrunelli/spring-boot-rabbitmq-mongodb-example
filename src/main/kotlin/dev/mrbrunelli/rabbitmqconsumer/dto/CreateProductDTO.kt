package dev.mrbrunelli.rabbitmqconsumer.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateProductDTO(
    @JsonProperty("name")
    val name: String,
    @JsonProperty("qty")
    val qty: Long,
    @JsonProperty("category")
    val category: String
)
