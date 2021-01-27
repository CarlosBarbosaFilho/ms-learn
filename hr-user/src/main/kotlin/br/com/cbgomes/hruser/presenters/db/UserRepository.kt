package br.com.cbgomes.hruser.presenters.db

import br.com.cbgomes.hruser.presenters.domain.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, Long> {

    fun findByEmail(email: String): UserEntity
}