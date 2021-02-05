package br.com.cbgomes.hrgateway.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore


@Configuration
@EnableResourceServer
class ResourcesServerConfiguration(private val jtwTokenStore: JwtTokenStore ): ResourceServerConfigurerAdapter() {

    override fun configure(resources: ResourceServerSecurityConfigurer) {
       resources.tokenStore(this.jtwTokenStore)
    }

    override fun configure(http: HttpSecurity) {
       http
               .authorizeRequests()
               .antMatchers("/hr-oauth/oauth/token").permitAll()
               .antMatchers(HttpMethod.GET,"/hr-worker/**").hasAnyRole("OPERATOR","ADMIN")
               .antMatchers("/hr-payment/**").hasAnyRole("ADMIN")
               .anyRequest().authenticated()
    }
}