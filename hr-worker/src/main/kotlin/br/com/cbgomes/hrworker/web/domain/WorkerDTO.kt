package br.com.cbgomes.hrworker.web.domain

import br.com.cbgomes.hrworker.service.use_case_port.data.WorkerPort
import java.math.BigDecimal
import javax.servlet.http.HttpServletRequest

data class WorkerDTO (
        val name: String,
        val daily_income: BigDecimal,
)

fun WorkerPort.toDTO() = WorkerDTO(name = name, daily_income = daily_income)

fun List<WorkerPort>.toDTO() = map { it.toDTO() }

fun HttpServletRequest.toPort(target: WorkerDTO): WorkerPort {
    return WorkerPort(name = target.name, daily_income = target.daily_income)
}




