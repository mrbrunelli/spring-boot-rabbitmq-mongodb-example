package dev.mrbrunelli.rabbitmqconsumer.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("products")
data class Product(
    @Id
    val id: String? = null,
    val name: String,
    val quantity: Long,
    val category: String
)