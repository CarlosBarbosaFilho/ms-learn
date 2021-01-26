package br.com.cbgomes.hruser.presenters.service

import br.com.cbgomes.hruser.presenters.db.UserRepository
import br.com.cbgomes.hruser.presenters.domain.toUserPort
import br.com.cbgomes.hruser.service.use_case_port.data.UserPort
import br.com.cbgomes.hruser.service.use_case_port.output.UserOutputPort
import br.com.cbgomes.hruser.web.domain.UserDTO
import br.com.cbgomes.hruser.web.domain.toUserEntity
import com.fasterxml.jackson.databind.util.BeanUtil
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service

@Service
class UserOutputPortImpl(private val userRepository: UserRepository): UserOutputPort {

    override fun getAllUser(): List<UserPort> {
        return  this.userRepository.findAll().map { it.toUserPort() }
    }

    override fun createUser(userDTO: UserDTO): UserPort {
       return this.userRepository.save(userDTO.toUserEntity()).toUserPort()
    }

    override fun getUserById(id: Long): UserPort {
        return this.userRepository.findById(id).get().toUserPort()
    }

    override fun updateUser(body: UserDTO, idUser: Long): UserPort {
        val userDB = this.userRepository.findById(idUser)
        BeanUtils.copyProperties(body.toUserEntity(),userDB.get())
        return this.userRepository.save(userDB.get()).toUserPort()
    }

    override fun deleteUser(id: Long) {
        this.userRepository.deleteById(id)
    }
}