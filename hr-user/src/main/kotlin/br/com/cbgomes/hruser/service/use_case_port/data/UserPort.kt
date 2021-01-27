package br.com.cbgomes.hruser.service.use_case_port.data

import br.com.cbgomes.hruser.presenters.domain.RoleEntity

data class UserPort( val id: Long? = null,
                     val name_user: String,
                     val email_user: String,
                     val password_user: String,
                     val roles : List<RoleEntity>)