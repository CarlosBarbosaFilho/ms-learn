package br.com.cbgomes.hruser.presenters.domain

import br.com.cbgomes.hruser.service.use_case_port.data.RolePort
import javax.persistence.*

@Entity
@Table(name = "tb_roles")
class RoleEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name: String,
)

fun RoleEntity.toRolePort(): RolePort {
        return RolePort(id = this.id, name = this.name)
}