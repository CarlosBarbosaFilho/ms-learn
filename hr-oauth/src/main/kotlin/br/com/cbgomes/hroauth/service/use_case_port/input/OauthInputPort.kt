package br.com.cbgomes.hroauth.service.use_case_port.input

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort

interface OauthInputPort {

    fun getUserByEmail(email: String): OauthUserPort?

    fun loadUserByUsername(username:String): OauthUserPort?
}