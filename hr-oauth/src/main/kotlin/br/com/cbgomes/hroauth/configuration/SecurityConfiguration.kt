package br.com.cbgomes.hroauth.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
class SecurityConfiguration(
        private val bCryptPasswordEncoder: BCryptPasswordEncoder,
        private val userDetailsService: UserDetailsService
): WebSecurityConfigurerAdapter() {

    @Autowired
    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth
                ?.userDetailsService(this.userDetailsService)
                ?.passwordEncoder(this.bCryptPasswordEncoder)
    }

    @Bean
    override fun authenticationManager(): AuthenticationManager {
        return super.authenticationManager()
    }
}