package br.com.cbgomes.hrworker.web.resource

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import br.com.cbgomes.hrworker.service.use_case_port.input.WorkerServiceInput
import br.com.cbgomes.hrworker.web.domain.WorkerDTO
import br.com.cbgomes.hrworker.web.domain.toPort
import org.slf4j.LoggerFactory
import org.springframework.core.env.Environment
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/workers")
class WorkerResource(private val workerServiceInput: WorkerServiceInput, val environment: Environment) {

    private val logger = LoggerFactory.getLogger(WorkerResource::class.java)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createWorker(request: HttpServletRequest, @RequestBody body: WorkerDTO): ResponseEntity<WorkerPort> {
        return ResponseEntity.ok(this.workerServiceInput.create(request.toPort(body)))
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getWorkerById(@PathVariable("id") id: Long): ResponseEntity<WorkerPort>{
        logger.info("PORT " +environment.getProperty("local.server.port"))
        return ResponseEntity.ok(this.workerServiceInput.getWorkerById(id))
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllWorkers(): ResponseEntity<List<WorkerPort>>{
        return ResponseEntity.ok(this.workerServiceInput.getAllWorkers())
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteWorkerById(@PathVariable("id") id: Long){
        this.workerServiceInput.deleteWorkerById(id)
    }

    @PutMapping("/{id}")
    fun updateWorker(@RequestBody body: WorkerDTO, request: HttpServletRequest,
                     @PathVariable("id") id: Long): ResponseEntity<WorkerPort>{
        return ResponseEntity.ok(this.workerServiceInput.updateWorker(request.toPort(body), id))
    }
}