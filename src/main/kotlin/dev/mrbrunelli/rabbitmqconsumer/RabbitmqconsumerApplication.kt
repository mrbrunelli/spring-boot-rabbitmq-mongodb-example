package dev.mrbrunelli.rabbitmqconsumer

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class RabbitmqconsumerApplication

fun main(args: Array<String>) {
	runApplication<RabbitmqconsumerApplication>(*args)
}
