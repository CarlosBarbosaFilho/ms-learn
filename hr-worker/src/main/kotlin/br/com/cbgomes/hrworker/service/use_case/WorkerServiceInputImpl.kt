package br.com.cbgomes.hrworker.service.use_case

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import br.com.cbgomes.hrworker.service.use_case_port.input.WorkerServiceInput
import br.com.cbgomes.hrworker.service.use_case_port.output.WorkerServiceOutput
import br.com.cbgomes.hrworker.web.domain.WorkerDTO
import org.springframework.stereotype.Component

@Component
class WorkerServiceInputImpl(val workerServiceOutput: WorkerServiceOutput): WorkerServiceInput {

    override fun create(workerPort: WorkerPort): WorkerPort {
        return this.workerServiceOutput.create(workerPort)
    }

    override fun getWorkerById(id: Long): WorkerPort {
        return this.workerServiceOutput.getWorkerById(id)
    }

    override fun getAllWorkers(): List<WorkerPort> {
        return this.workerServiceOutput.getAllWorkers()
    }

    override fun deleteWorkerById(id: Long) {
        this.workerServiceOutput.deleteWorkerById(id)
    }

    override fun updateWorker(workerPort: WorkerPort, id: Long): WorkerPort {
        return this.workerServiceOutput.updateWorker(workerPort,id)
    }
}