package br.com.cbgomes.hroauth.presenters.service

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort
import br.com.cbgomes.hroauth.service.use_case_port.output.OauthOutputPort
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class OauthOutputPortImpl(val userFiegnClient: UserFiegnClient): OauthOutputPort, UserDetailsService {

   override fun getUserByEmail(email: String): OauthUserPort? {
       val user = this.userFiegnClient.getUserByEmail(email).body
        return user
    }

    override fun loadUserByUsername(username: String): OauthUserPort? {
        val user = userFiegnClient.getUserByEmail(username).body
                ?: throw UsernameNotFoundException("User not fund ${username}")
        return user
    }
}