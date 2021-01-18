package br.com.cbgomes.pay.presenters.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class PaymentServiceRestClient {

    @Bean
    fun getRestTemplate() = RestTemplate()
}