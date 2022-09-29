package com.github.kuzznya.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvcRestGradleKotlinJpaApplication

fun main(args: Array<String>) {
    runApplication<MvcRestGradleKotlinJpaApplication>(*args)
}
