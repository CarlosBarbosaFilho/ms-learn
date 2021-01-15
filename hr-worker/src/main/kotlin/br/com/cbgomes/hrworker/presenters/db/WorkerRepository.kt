package br.com.cbgomes.hrworker.presenters.db

import br.com.cbgomes.hrworker.presenters.domain.WorkerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkerRepository: JpaRepository<WorkerEntity, Long> {
}