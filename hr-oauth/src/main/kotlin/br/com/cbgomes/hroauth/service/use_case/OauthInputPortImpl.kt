package br.com.cbgomes.hroauth.service.use_case

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort
import br.com.cbgomes.hroauth.service.use_case_port.input.OauthInputPort
import br.com.cbgomes.hroauth.service.use_case_port.output.OauthOutputPort
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class OauthInputPortImpl(val oauthOutputPort: OauthOutputPort): OauthInputPort {

    override fun getUserByEmail(email: String): OauthUserPort? {
        return this.oauthOutputPort.getUserByEmail(email)
    }

    override fun loadUserByUsername(username: String): OauthUserPort? {
        return this.oauthOutputPort.loadUserByUsername(username)
    }
}