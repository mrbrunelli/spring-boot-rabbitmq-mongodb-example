package dev.mrbrunelli.rabbitmqconsumer.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("products")
data class Product(
    @Id
    val id: String? = null,
    val name: String,
    val quantity: Long,
    val category: String,
    @CreatedDate
    val createdAt: Instant? = null,
    @LastModifiedDate
    val updatedAt: Instant? = null
)