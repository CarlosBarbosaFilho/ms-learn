package br.com.cbgomes.hroauth.presenters.service

import br.com.cbgomes.hroauth.service.use_case_port.data.OauthUserPort
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus

@Component
@FeignClient(name="hr-user", path = "/api/users/")
interface UserFiegnClient {

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    fun getUserByEmail(@RequestParam(required = true) email: String): ResponseEntity<OauthUserPort>

}