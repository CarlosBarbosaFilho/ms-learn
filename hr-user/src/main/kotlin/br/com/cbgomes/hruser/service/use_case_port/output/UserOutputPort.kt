package br.com.cbgomes.hruser.service.use_case_port.output

import br.com.cbgomes.hruser.service.use_case_port.data.UserPort
import br.com.cbgomes.hruser.web.domain.UserDTO

interface UserOutputPort {

    fun getAllUser(): List<UserPort>

    fun createUser(userDTO: UserDTO): UserPort

    fun getUserById(id: Long): UserPort

    fun updateUser(body: UserDTO, idUser: Long): UserPort

    fun deleteUser(id: Long)
}