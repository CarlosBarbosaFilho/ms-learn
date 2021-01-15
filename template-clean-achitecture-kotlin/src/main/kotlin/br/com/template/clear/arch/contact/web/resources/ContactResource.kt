package br.com.template.clear.arch.contact.web.resources

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import br.com.template.clear.arch.contact.service.use_case_port.input.ContactServiceUseCaseInputPort
import br.com.template.clear.arch.contact.web.helper.ContactDTO
import br.com.template.clear.arch.contact.web.helper.toContactInputPort
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/contacts")
class ContactResource(private val contactServiceUseCaseInputPort: ContactServiceUseCaseInputPort) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllContacts(): ResponseEntity<String>{
        return ResponseEntity.ok("All contact saved")
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createContact(request: HttpServletRequest, @RequestBody body: ContactDTO  ): ResponseEntity<ContactOutputPort> {
        return ResponseEntity.ok(this.contactServiceUseCaseInputPort.create(request.toContactInputPort(body)))
    }

}