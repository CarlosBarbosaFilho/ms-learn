package br.com.cbgomes.hrworker.service.use_case_port.output

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import br.com.cbgomes.hrworker.web.domain.WorkerDTO

interface WorkerServiceOutput {

    fun create(workerPort: WorkerPort): WorkerPort

    fun getWorkerById(id: Long): WorkerPort

    fun getAllWorkers(): List<WorkerPort>

    fun deleteWorkerById(id:Long)

    fun updateWorker(workerPort: WorkerPort, id: Long): WorkerPort
}