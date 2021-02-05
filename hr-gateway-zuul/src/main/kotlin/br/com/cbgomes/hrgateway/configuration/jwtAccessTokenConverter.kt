package br.com.cbgomes.hrgateway.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore

@Configuration
class AppConfiguration {

    @Bean
    fun jwtAccessTokenConverter(): JwtAccessTokenConverter {
        val tokenConverter = JwtAccessTokenConverter()
        tokenConverter.setSigningKey("MY-SECRET-KEY")
        return tokenConverter
    }

    @Bean
    fun jwtTokenStore(): JwtTokenStore {
        return JwtTokenStore(this.jwtAccessTokenConverter())
    }
}