package br.com.template.clear.arch.contact.service.use_case

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactPort
import br.com.template.clear.arch.contact.service.use_case_port.input.ContactServiceUseCaseInputPort
import br.com.template.clear.arch.contact.service.use_case_port.output.ContactServiceUseCaseOutputPort
import org.springframework.stereotype.Service

@Service
class ContactServiceUseCaseInputPortImpl (private val contactServiceUseCaseOutputPort: ContactServiceUseCaseOutputPort):
        ContactServiceUseCaseInputPort{

    override fun create(contactPort: ContactPort): ContactPort {
        return this.contactServiceUseCaseOutputPort.create(contactPort)
    }

    override fun createV1(contactPort: ContactPort): ContactOutputPort {
        return this.contactServiceUseCaseOutputPort.createV1(contactPort)
    }

    override fun getById(id: Long): ContactPort {
        return this.contactServiceUseCaseOutputPort.getById(id)
    }

    override fun getAll(): List<ContactPort> {
        return this.contactServiceUseCaseOutputPort.getAll()
    }

    override fun remove(id: Long) {
        this.contactServiceUseCaseOutputPort.remove(id)
    }

}