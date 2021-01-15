package br.com.cbgomes.hrworker.presenters.service

import br.com.cbgomes.hrworker.presenters.domain.toPort
import br.com.cbgomes.hrworker.presenters.domain.toWorkerEntity
import br.com.cbgomes.hrworker.presenters.db.WorkerRepository
import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import br.com.cbgomes.hrworker.service.use_case_port.output.WorkerServiceOutput
import org.springframework.beans.BeanUtils
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class WorkerServerOutputImpl(val workerRepository: WorkerRepository): WorkerServiceOutput {

    @Transactional
    override fun create(workerPort: WorkerPort): WorkerPort  {
        return this.workerRepository.save(workerPort.toWorkerEntity()).toPort()
    }

    override fun getWorkerById(id: Long): WorkerPort {
        return this.workerRepository.findById(id).get().toPort()
    }

    override fun getAllWorkers(): List<WorkerPort> {
        return this.workerRepository.findAll().toPort()
    }

    @Transactional
    override fun deleteWorkerById(id: Long) {
        this.workerRepository.deleteById(id)
    }

    @Transactional
    override fun updateWorker(workerPort: WorkerPort, id: Long): WorkerPort {
        val workerBD = this.workerRepository.findById(id)
        BeanUtils.copyProperties(workerPort.toWorkerEntity(),workerBD.get())
        return this.workerRepository.save(workerBD.get()).toPort()
    }
}