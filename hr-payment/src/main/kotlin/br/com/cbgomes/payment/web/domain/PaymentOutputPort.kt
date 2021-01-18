package br.com.cbgomes.payment.web.domain

import java.math.BigDecimal

class PaymentOutputPort(
        val name: String,
        val daily_income: BigDecimal,
        val days : BigDecimal,
        var total : BigDecimal = daily_income * days
)