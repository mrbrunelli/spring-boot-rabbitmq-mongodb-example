package dev.mrbrunelli.rabbitmqconsumer.mapper

interface Mapper<From, To> {
    fun map(f: From): To
}