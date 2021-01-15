package br.com.template.clear.arch.contact.service.use_case_port.input

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort

interface ContactServiceUseCaseInputPort {

    fun create(contactPort: ContactInputPort): ContactOutputPort

    fun getById(id: Long): ContactInputPort

    fun getAll(): List<ContactInputPort>

    fun remove(id: Long): Unit
}