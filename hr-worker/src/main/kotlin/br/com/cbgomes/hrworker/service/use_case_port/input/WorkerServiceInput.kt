package br.com.cbgomes.hrworker.service.use_case_port.input

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort

interface WorkerServiceInput {

    fun create(workerPort: WorkerPort): WorkerPort

    fun getWorkerById(id: Long): WorkerPort

    fun getAllWorkers(): List<WorkerPort>

    fun deleteWorkerById(id:Long)

    fun updateWorker(workerPort: WorkerPort, id: Long): WorkerPort
}