package dev.mrbrunelli.rabbitmqconsumer.service

import dev.mrbrunelli.rabbitmqconsumer.model.Product
import dev.mrbrunelli.rabbitmqconsumer.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class CreateNewProduct(private val productRepository: ProductRepository) {
    fun exec(p: Product) {
        productRepository.save(p)
    }
}