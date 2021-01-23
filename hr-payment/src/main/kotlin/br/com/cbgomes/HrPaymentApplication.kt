package br.com.cbgomes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableEurekaClient
@RibbonClient("hr-worker")
@EnableFeignClients
@SpringBootApplication
class HrPaymentApplication

fun main(args: Array<String>) {
    runApplication<HrPaymentApplication>(*args)
}
