package dev.mrbrunelli.rabbitmqconsumer.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.TopicExchange
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class RabbitMQConfig {
    @Value("\${rabbitmq.queue.name}")
    private lateinit var queue: String

    @Value("\${rabbitmq.exchange.name}")
    private lateinit var exchange: String

    @Value("\${rabbitmq.routing.key}")
    private lateinit var routingKey: String

    @Bean
    fun queue(): Queue {
        return Queue(queue)
    }

    @Bean
    fun exchange(): TopicExchange {
        return TopicExchange(exchange)
    }

    @Bean
    fun binding(): Binding {
        return BindingBuilder
            .bind(queue())
            .to(exchange())
            .with(routingKey)
    }

    @Bean
    fun objectMapper(): ObjectMapper {
        return ObjectMapper()
    }

    @Bean
    fun jsonMessageConverter(objectMapper: ObjectMapper): MessageConverter {
        return Jackson2JsonMessageConverter(objectMapper)
    }
}