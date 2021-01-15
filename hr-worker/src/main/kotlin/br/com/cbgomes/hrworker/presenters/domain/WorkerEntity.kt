package br.com.cbgomes.hrworker.presenters.domain

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "tb_worker")
data class WorkerEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        @Column var name: String,
        @Column var daily_income: BigDecimal
)

fun WorkerEntity.toPort() = WorkerPort(
        id = this.id,
        name = this.name,
        daily_income = this.daily_income
)

fun WorkerPort.toWorkerEntity() = WorkerEntity(
        id = id,
        name = this.name,
        daily_income = this.daily_income
)

fun List<WorkerEntity>.toPort() = map { it.toPort() }

