package br.com.template.clear.arch.contact.presenters.service

import br.com.template.clear.arch.contact.presenters.db.ContactEntityRepository
import br.com.template.clear.arch.contact.presenters.domain.toContactEntity
import br.com.template.clear.arch.contact.presenters.domain.toContactOutputPort
import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactPort
import br.com.template.clear.arch.contact.service.use_case_port.output.ContactServiceUseCaseOutputPort
import org.springframework.stereotype.Service

@Service
class ContactServiceUserCaseOutputPortImpl (private val contactEntityRepository: ContactEntityRepository): ContactServiceUseCaseOutputPort {

    override fun create(contactPort: ContactPort): ContactPort {
        return this.contactEntityRepository.save(contactPort.toContactEntity()).toContactOutputPort()
    }

    override fun getById(id: Long): ContactPort {
       return this.contactEntityRepository.findById(id).get().toContactOutputPort()
    }

    override fun getAll(): List<ContactPort> {
        return this.contactEntityRepository.findAll().map { it.toContactOutputPort() }
    }

    override fun remove(id: Long) {
        this.contactEntityRepository.deleteById(id)
    }
}