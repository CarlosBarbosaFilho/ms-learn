package br.com.cbgomes.hruser.service.use_case_port.data

data class UserPort( val id: Long? = null,
                     val name_user: String,
                     val email_user: String,
                     val password_user: String) {
}