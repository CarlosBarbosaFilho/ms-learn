package br.com.cbgomes.payment.presenters.db

import java.math.BigDecimal

data class WorkerEntity(
        val id: Long = 0,
        val name: String = "",
        val daily_income: BigDecimal = BigDecimal.ZERO
)

