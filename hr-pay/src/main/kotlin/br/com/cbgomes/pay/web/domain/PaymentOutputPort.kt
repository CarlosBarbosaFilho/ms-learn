package br.com.cbgomes.pay.web.domain

import br.com.cbgomes.pay.presenters.domain.PaymentEntity
import java.math.BigDecimal

class PaymentOutputPort(
        val name: String,
        val daily_income: BigDecimal,
        val days : BigDecimal,
        var total : BigDecimal = daily_income * days
)