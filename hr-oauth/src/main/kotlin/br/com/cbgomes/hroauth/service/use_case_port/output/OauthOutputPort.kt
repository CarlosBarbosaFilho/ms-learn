package br.com.cbgomes.hroauth.service.use_case_port.output

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort

interface OauthOutputPort {

    fun getUserByEmail(email: String): OauthUserPort?

    fun loadUserByUsername(username:String): OauthUserPort?
}