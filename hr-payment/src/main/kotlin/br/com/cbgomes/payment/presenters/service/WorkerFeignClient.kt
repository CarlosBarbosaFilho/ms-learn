package br.com.cbgomes.payment.presenters.service

import br.com.cbgomes.payment.presenters.db.WorkerEntity
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus
//url = "http://localhost:8080/api/workers/"


@FeignClient(name="hr-worker",url = "http://localhost:8080/api/workers/")
@Component
interface WorkerFeignClient {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getWorkerById(@PathVariable("id") id: Long): ResponseEntity<WorkerEntity>

}