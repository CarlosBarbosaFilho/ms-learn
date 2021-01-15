package br.com.template.clear.arch.contact.presenters.db

import br.com.template.clear.arch.contact.presenters.domain.ContactEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactEntityRepository: JpaRepository<ContactEntity, Long> {
}