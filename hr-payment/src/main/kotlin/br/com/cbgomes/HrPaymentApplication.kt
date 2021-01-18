package br.com.cbgomes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class HrPaymentApplication

fun main(args: Array<String>) {
    runApplication<HrPaymentApplication>(*args)
}
