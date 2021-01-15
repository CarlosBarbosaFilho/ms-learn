package br.com.template.clear.arch.contact.service.use_case_port.output

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort

interface ContactServiceUseCaseOutputPort {

    fun create(contactOutputPort: ContactOutputPort): ContactOutputPort

    fun getById(id: Long): ContactOutputPort

    fun getAll(): List<ContactOutputPort>

    fun remove(id: Long): Unit
}