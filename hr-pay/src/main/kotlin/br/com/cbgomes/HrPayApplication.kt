package br.com.cbgomes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@EnableFeignClients
@SpringBootApplication
class HrPayApplication

fun main(args: Array<String>) {
    runApplication<HrPayApplication>(*args)
}


