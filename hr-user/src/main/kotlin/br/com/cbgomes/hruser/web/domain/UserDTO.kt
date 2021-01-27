package br.com.cbgomes.hruser.web.domain

import br.com.cbgomes.hruser.presenters.domain.RoleEntity
import br.com.cbgomes.hruser.presenters.domain.UserEntity

data class UserDTO (
        val name_user: String,
        val email_user: String,
        val password_user: String,
)

fun UserDTO.toUserEntity(): UserEntity {
    return UserEntity(
            id = 0,
            name = this.name_user,
            email = this.email_user,
            password = this.password_user,
    )
}

