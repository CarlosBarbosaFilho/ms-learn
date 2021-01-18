package br.com.cbgomes.payment.presenters.domain

import java.math.BigDecimal

data class PaymentEntity (
        val name: String,
        val daily_income:BigDecimal,
        val days: BigDecimal
)

fun PaymentEntity.calculateTotal(): BigDecimal {
    return this.daily_income * this.days
}



