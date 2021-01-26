package br.com.cbgomes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
class HrPaymentApplication

fun main(args: Array<String>) {
    runApplication<HrPaymentApplication>(*args)
}
