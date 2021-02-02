package br.com.cbgomes.hroauth.presenters.service

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

//@Service
class OauthOutputPortUserDetailsImpl(private val userFiegnClient: UserFiegnClient): UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        return userFiegnClient.getUserByEmail(username).body
                ?: throw UsernameNotFoundException("User not fund ${username}")
    }
}