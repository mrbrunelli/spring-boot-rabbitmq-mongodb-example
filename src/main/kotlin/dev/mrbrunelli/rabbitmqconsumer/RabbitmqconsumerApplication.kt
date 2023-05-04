package dev.mrbrunelli.rabbitmqconsumer

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableRabbit
@EnableMongoRepositories
@EnableMongoAuditing
@SpringBootApplication
class RabbitmqconsumerApplication

fun main(args: Array<String>) {
    runApplication<RabbitmqconsumerApplication>(*args)
}
