package dev.mrbrunelli.rabbitmqconsumer.consumer

import com.fasterxml.jackson.databind.ObjectMapper
import dev.mrbrunelli.rabbitmqconsumer.dto.CreateProductDTO
import dev.mrbrunelli.rabbitmqconsumer.mapper.ProductMapper
import dev.mrbrunelli.rabbitmqconsumer.service.CreateNewProduct
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class ProductConsumer(
    private val createNewProduct: CreateNewProduct,
    private val productMapper: ProductMapper,
    private val objectMapper: ObjectMapper
) {
    @RabbitListener(queues = ["\${rabbitmq.queue.name}"])
    fun receive(message: String) {
        val dto =
            objectMapper.readValue(message, CreateProductDTO::class.java) ?: throw RuntimeException("Errou aqui bitcho")
        val product = createNewProduct.exec(productMapper.map(dto))
        println(product)
    }
}