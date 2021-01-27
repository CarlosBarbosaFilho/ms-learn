package br.com.cbgomes.hruser

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@EnableEurekaClient
@SpringBootApplication
class HrUserApplication(private val bCryptPasswordEncoder: BCryptPasswordEncoder): CommandLineRunner {
    override fun run(vararg args: String?) {
    }
}

fun main(args: Array<String>) {
    runApplication<HrUserApplication>(*args)
}

