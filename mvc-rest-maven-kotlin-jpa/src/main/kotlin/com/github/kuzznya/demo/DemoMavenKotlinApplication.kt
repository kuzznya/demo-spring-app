package com.github.kuzznya.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoMavenKotlinApplication

fun main(args: Array<String>) {
    runApplication<DemoMavenKotlinApplication>(*args)
}
