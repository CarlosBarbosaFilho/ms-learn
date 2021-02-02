package br.com.cbgomes.hruser.service.use_case_port.data

import br.com.cbgomes.hruser.presenters.domain.RoleEntity

data class UserPort( val id: Long? = null,
                     val name: String,
                     val email: String,
                     val pass: String,
                     val roles : List<RolePort>)
