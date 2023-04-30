package dev.mrbrunelli.rabbitmqconsumer.repository

import dev.mrbrunelli.rabbitmqconsumer.model.Product
import org.springframework.data.mongodb.repository.MongoRepository

interface ProductRepository : MongoRepository<Product, String>