package br.com.cbgomes.hroauth.web.resource

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort
import br.com.cbgomes.hroauth.service.use_case_port.input.OauthInputPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/oauth")
class OauthResource (private val oauthInputPort: OauthInputPort) {

    @GetMapping("/search")
    fun searchUserByEmail(@RequestParam("username") username: String): ResponseEntity<OauthUserPort>{
        return ResponseEntity.ok(this.oauthInputPort.loadUserByUsername(username)!!)
    }
}