package br.com.template.clear.arch.contact.web.helper

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import javax.servlet.http.HttpServletRequest

data class ContactDTO (
        val name: String,
        val email: String,
        val phone:String
)
    fun HttpServletRequest.toContactInputPort(target: ContactDTO): ContactInputPort {
        return ContactInputPort(name = target.name, email = target.email, phone = target.phone)
    }
