package br.com.template.clear.arch.contact.service.use_case_port.output

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactPort

interface ContactServiceUseCaseOutputPort {

    fun create(contactPort: ContactPort): ContactPort

    fun createV1(contactPort: ContactPort): ContactOutputPort

    fun getById(id: Long): ContactPort

    fun getAll(): List<ContactPort>

    fun remove(id: Long): Unit
}