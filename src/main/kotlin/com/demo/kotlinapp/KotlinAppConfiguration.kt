package com.demo.kotlinapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinappApplication

fun main(args: Array<String>) {
    runApplication<KotlinappApplication>(*args)
}
