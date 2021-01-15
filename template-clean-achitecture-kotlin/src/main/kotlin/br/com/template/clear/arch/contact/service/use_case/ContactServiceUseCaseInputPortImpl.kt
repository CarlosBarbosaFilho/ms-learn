package br.com.template.clear.arch.contact.service.use_case

import br.com.template.clear.arch.contact.service.use_case_port.output.ContactServiceUseCaseOutputPort
import org.springframework.stereotype.Service

@Service
class ContactServiceUseCaseInputPortImpl
    (private val contactServiceUseCaseOutputPort: ContactServiceUseCaseOutputPort) {
}