package br.com.cbgomes.hruser.presenters.domain

import br.com.cbgomes.hruser.service.use_case_port.data.UserPort
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "tb_users")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = IDENTITY)
        val id: Long,
        val name: String,
        val email: String,
        val password: String
)

fun UserEntity.toUserPort(): UserPort {
        return UserPort(
                id = this.id,
                name_user = this.name,
                email_user = this.email,
                password_user = this.password
        )
}