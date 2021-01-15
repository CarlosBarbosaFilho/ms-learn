package br.com.template.clear.arch.contact.presenters.domain

import br.com.template.clear.arch.contact.service.use_case.data.ContactOutputPort
import javax.persistence.*

@Entity
@Table(name = "tb_contacts")
data class ContactEntity (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name:String,
        val email:String,
        val phone: String
)

fun ContactOutputPort.toContactEntity() : ContactEntity{
        return ContactEntity(
                id = this.id,
                name = this.name,
                email = this.email,
                phone = this.phone,
        )
}

fun ContactEntity.toContactOutputPort() : ContactOutputPort {
        return ContactOutputPort(
                id = this.id,
                name = this.name,
                email = this.email,
                phone = this.phone
        )
}
