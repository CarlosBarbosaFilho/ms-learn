package br.com.cbgomes.payment.service.use_case_port.input

import br.com.cbgomes.payment.web.domain.PaymentOutputPort

interface PaymentInputService {

    fun getPayment(worker: Long, days: Int): PaymentOutputPort
}