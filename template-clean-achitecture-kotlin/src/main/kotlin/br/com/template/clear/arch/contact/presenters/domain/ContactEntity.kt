package br.com.template.clear.arch.contact.presenters.domain

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactPort
import javax.persistence.*

@Entity
@Table(name = "tb_contacts")
data class ContactEntity (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val name:String= "" ,
        val email:String = "",
        val phone: String = ""
)

fun ContactEntity.toContactOutputPort() : ContactPort {
        return ContactPort(
                id = this.id,
                name = this.name,
                email = this.email,
                phone = this.phone
        )
}

fun ContactEntity.toContactOutputPortV1() : ContactOutputPort {
        return ContactOutputPort(
                id = this.id,
                name = this.name,
                email = this.email,
                phone = this.phone
        )
}

fun ContactPort.toContactEntity() : ContactEntity{
        return ContactEntity(
                id = 0,
                name = this.name,
                email = this.email,
                phone = this.phone,
        )
}

