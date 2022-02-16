package com.demo.kotlinapp

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(info= Info(title = "Users portfolio API", version = "1.0"))
class KotlinappApplication

fun main(args: Array<String>) {
    runApplication<KotlinappApplication>(*args)
}
