package dev.mrbrunelli.rabbitmqconsumer.mapper

import dev.mrbrunelli.rabbitmqconsumer.dto.CreateProductDTO
import dev.mrbrunelli.rabbitmqconsumer.model.Product
import org.springframework.stereotype.Component

@Component
class ProductMapper : Mapper<CreateProductDTO, Product> {
    override fun map(f: CreateProductDTO): Product {
        return Product(
            name = f.name,
            quantity = f.qty,
            category = f.category
        )
    }
}