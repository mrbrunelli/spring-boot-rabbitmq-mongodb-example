package dev.mrbrunelli.rabbitmqconsumer.consumer

import dev.mrbrunelli.rabbitmqconsumer.dto.CreateProductDTO
import dev.mrbrunelli.rabbitmqconsumer.mapper.CreateProductMapper
import dev.mrbrunelli.rabbitmqconsumer.service.CreateNewProduct
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ProductConsumer(
    private val createNewProduct: CreateNewProduct,
    private val createProductMapper: CreateProductMapper
) {
    @RabbitListener(queues = ["\${queue.name}"])
    fun receive(@Payload dto: CreateProductDTO) {
        println(dto)
        val product = createProductMapper.map(dto)
        createNewProduct.exec(product)
    }
}