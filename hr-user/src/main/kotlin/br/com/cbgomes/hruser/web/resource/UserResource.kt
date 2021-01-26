package br.com.cbgomes.hruser.web.resource

import br.com.cbgomes.hruser.service.use_case_port.data.UserPort
import br.com.cbgomes.hruser.service.use_case_port.input.UserInputPort
import br.com.cbgomes.hruser.web.domain.UserDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.ws.rs.core.Response


@RestController
@RequestMapping("/api/users")
class UserResource (private val userInputPort: UserInputPort){

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllUsers(): ResponseEntity<List<UserPort>> {
        return ResponseEntity.ok(this.userInputPort.getAllUser())
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody body: UserDTO): ResponseEntity<UserPort>{
        return ResponseEntity.ok(this.userInputPort.createUser(body))
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getUserById(@PathVariable("id") id: Long): ResponseEntity<UserPort>{
        return ResponseEntity.ok(this.userInputPort.getUserById(id))
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun updateUser(@RequestBody body: UserDTO,
                   @RequestParam("id_user") id_user: Long): ResponseEntity<UserPort>{
        return ResponseEntity.ok(this.userInputPort.updateUser(body, id_user))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(@PathVariable("id") id: Long): ResponseEntity<Void>{
        this.userInputPort.deleteUser(id)
        return ResponseEntity.notFound().build()
    }

}