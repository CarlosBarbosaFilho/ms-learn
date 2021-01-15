package br.com.cbgomes.hrworker.service.use_case_port.data

import java.math.BigDecimal

data class WorkerPort (
        val id: Long? = null,
        val name: String,
        val daily_income: BigDecimal
)