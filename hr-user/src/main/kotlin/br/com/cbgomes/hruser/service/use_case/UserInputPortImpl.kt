package br.com.cbgomes.hruser.service.use_case

import br.com.cbgomes.hruser.service.use_case_port.data.UserPort
import br.com.cbgomes.hruser.service.use_case_port.input.UserInputPort
import br.com.cbgomes.hruser.service.use_case_port.output.UserOutputPort
import br.com.cbgomes.hruser.web.domain.UserDTO
import org.springframework.stereotype.Component

@Component
class UserInputPortImpl(val userOutputPort: UserOutputPort): UserInputPort {

    override fun getAllUser(): List<UserPort> {
        return this.userOutputPort.getAllUser()
    }

    override fun createUser(userDTO: UserDTO): UserPort {
        return this.userOutputPort.createUser(userDTO)
    }

    override fun getUserById(id: Long): UserPort {
        return this.userOutputPort.getUserById(id)
    }

    override fun updateUser(body: UserDTO, idUser: Long): UserPort {
        return this.userOutputPort.updateUser(body, idUser)
    }

    override fun deleteUser(id: Long) {
        this.userOutputPort.deleteUser(id)
    }
}