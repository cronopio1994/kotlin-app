package com.demo.kotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class KotlinappApplication

fun main(args: Array<String>) {
    runApplication<KotlinappApplication>(*args)
}
